package com.zzx.graduate.servlet;

import com.zzx.graduate.entity.StudentInfo;
import com.zzx.graduate.service.LoginByZFsoft;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by glacier on 15-5-14.
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //执行完方法体需要跳转至的jsp页面
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("welcome.jsp");
        HttpSession session = request.getSession();
        String user = request.getParameter("user");
        if ( user != null ) {
            session.setAttribute("user", user);
            if (user.equals("student")) {
                StudentInfo student = new LoginByZFsoft(request.getParameter("username"), request.getParameter("password")).login();
                if (student.loginSuccess()) {
                    //如果登陆成功
                    session.setAttribute("login", "true");
                    session.setAttribute("stu_info", student);
                } else {
                    //否则
                    session.setAttribute("login", "false");
                }
            } else if (user.equals("teacher")) {

            } else if (user.equals("manager")) {

            }
        }
        //跳转至指定jsp页面
        requestDispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
