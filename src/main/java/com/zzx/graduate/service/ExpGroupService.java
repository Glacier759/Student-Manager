package com.zzx.graduate.service;

import com.zzx.graduate.dao.ExpGroupDAO;
import com.zzx.graduate.dao.ExpGroupMemDAO;
import com.zzx.graduate.dao.StudentDAO;
import com.zzx.graduate.entity.ExpGroupBean;
import com.zzx.graduate.entity.ExpGroupMemBean;
import com.zzx.graduate.entity.StudentBean;
import org.apache.log4j.Logger;

/**
 * Created by glacier on 15-5-14.
 */
public class ExpGroupService {

    private static Logger logger = Logger.getLogger(ExpGroupService.class.getName());

    public void insertExpGroup(ExpGroupBean bean) {
        ExpGroupDAO.insertExpGroup(bean);
    }

    public StudentBean getStudentByStuSN(String stuSN) {
        return StudentDAO.getStudentByStuSN(stuSN);
    }

    public void insertExpGroupMem(ExpGroupMemBean bean) {
        ExpGroupMemDAO.insertExpGroupMem(bean);
    }

}
