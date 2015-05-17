package com.zzx.graduate.servlet;

import com.zzx.graduate.entity.ExpGroupBean;
import com.zzx.graduate.entity.ExpGroupMemBean;
import com.zzx.graduate.entity.StudentBean;
import com.zzx.graduate.entity.StudentInfo;
import com.zzx.graduate.service.ExpGroupService;
import com.zzx.graduate.service.ExperimentService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by glacier on 15-5-17.
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("select.jsp");

        HttpSession session = request.getSession();
        StudentInfo student = (StudentInfo)session.getAttribute("stu_info");
        ExpGroupBean groupBean = new ExpGroupBean();
        List<ExpGroupMemBean> groupMemBeans = new ArrayList<ExpGroupMemBean>();
        ExpGroupService service = new ExpGroupService();

        //1. 根据表单提交信息获取实验小组信息,组织为一个bean,插入数据库获得其返回值 - groupID
        groupBean.setExpID(Integer.parseInt(request.getParameter("expID")));
        groupBean.setGroupName(request.getParameter("groupName"));
        groupBean.setPrjName(request.getParameter("testName"));
        groupBean.setPrjDescription(request.getParameter("introduce"));
        service.insertExpGroup(groupBean);

        //2. 根据表单提交的成员信息, 以此找到其对应的学生ID
        String[] memberName = request.getParameterValues("memberName");
        String[] memberNum = request.getParameterValues("memberNum");
        for ( int index = 0; index < memberName.length; index ++ ) {
            StudentBean studentBean = service.getStudentByStuSN(memberNum[index]);
            //如果检索到的学校对应的学生与提交的学生名称吻合
            if ( studentBean != null && studentBean.getName().equals(memberName[index]) ) {
                //3. 依据学生ID与组ID, 依此插入数据库保存组成员信息
                ExpGroupMemBean groupMemBean = new ExpGroupMemBean();
                groupMemBean.setGroupID(groupBean.getGroupID());
                groupMemBean.setStuID(studentBean.getStuID());
                if ( student.getStuNumber().equals(studentBean.getStuSN()) ) {
                    groupMemBean.setLeaderTag(1);
                    groupMemBean.setMemTask("leader");
                }
                else {
                    groupMemBean.setLeaderTag(0);
                    groupMemBean.setMemTask("member");
                }
                service.insertExpGroupMem(groupMemBean);
            }
        }
        requestDispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
