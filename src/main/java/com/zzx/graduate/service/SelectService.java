package com.zzx.graduate.service;

import com.zzx.graduate.dao.*;
import com.zzx.graduate.entity.*;
import com.zzx.graduate.util.StreamUtil;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.util.List;

/**
 * Created by glacier on 15-5-17.
 */
public class SelectService {

    private static Logger logger = Logger.getLogger(SelectService.class.getName());

    //根据当前登陆用户的学号获取他所注册的实验
    public List<ExpGroupBean> getExperimentByStuSN(String stuSN) {
        return ExpGroupDAO.getExperimentByStuSN(stuSN);
    }

    //根据小组ID获取所有的成员信息
    public List<ExpGroupMemBean> getExpGroupMemByGroupID(Integer groupID) {
        return ExpGroupMemDAO.getExpGroupMemByGroupID(groupID);
    }

    //根据成员信息中的StuID获取其详细信息
    public StudentBean getStuNameByStuID(Integer stuID) {
        return StudentDAO.getStudentByID(stuID);
    }

    //查看成绩时找到当前用户的当前实验的成绩信息
    public TaskResultBean getTaskResultByExpID_SubbmiterID(Integer submitterID, Integer expID) {
        List<TaskResultBean> beans = TaskResultDAO.getTaskResultBySubmitterID(submitterID);
        TaskResultBean resultBean = null;
        for ( TaskResultBean bean : beans ) {
            ExpTaskBean taskBean = ExpTaskDAO.getExpTaskByID(bean.getTaskID());
            if ( taskBean.getExpID() == expID ) {
                resultBean = bean;
            }
        }
        return resultBean;
    }

    //上传附件
    public void uploadFileByExpGroup(File attachFile, int groupID) {
        try {
            ExpGroupBean groupBean = new ExpGroupBean();
            AttachFile file = new AttachFile();
            file.setFileName(attachFile.getName());
            file.setFileBytes(StreamUtil.toByteArray(FileUtils.openInputStream(attachFile)));

            groupBean.setGroupID(groupID);
            groupBean.setAttach2File(file);

            ExpGroupDAO.uploadFileByExpGroup(groupBean);
        }catch (Exception e) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            e.printStackTrace(new PrintStream(baos));
            logger.error(baos.toString());
        }
    }

}
