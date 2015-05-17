package com.zzx.graduate.service;

import com.zzx.graduate.dao.*;
import com.zzx.graduate.entity.*;

import java.util.List;

/**
 * Created by glacier on 15-5-17.
 */
public class SelectService {

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
    public void uploadFileByExpGroup(ExpGroupBean expGroupBean) {
        ExpGroupDAO.uploadFileByExpGroup(expGroupBean);
    }

}
