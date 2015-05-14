package com.zzx.graduate.service;

import com.zzx.graduate.dao.CourseClassDAO;
import com.zzx.graduate.dao.ExpGroupDAO;
import com.zzx.graduate.dao.ExpTaskDAO;
import com.zzx.graduate.dao.ExperimentDAO;
import com.zzx.graduate.entity.CourseClassBean;
import com.zzx.graduate.entity.ExpGroupBean;
import com.zzx.graduate.entity.ExpTaskBean;
import com.zzx.graduate.entity.ExperimentBean;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * Created by glacier on 15-5-14.
 */
public class ExperimentService {

    private static Logger logger = Logger.getLogger(ExperimentService.class.getName());
    private String stuSN;

    public ExperimentService(String stuSN) {
        this.stuSN = stuSN;
    }

    public List<ExperimentBean> getAllExperiment() {
        return ExperimentDAO.getAllExperiment();
    }

    public List<CourseClassBean> getCourseClassByCourClassID(int courClassID) {
        return CourseClassDAO.getCourseClassByCourID(courClassID);
    }

    public List<ExpTaskBean> getExpTaskByExpID(int expID) {
        return ExpTaskDAO.getExpTaskByExpID(expID);
    }

    public List<ExpGroupBean> getExpGroupByExpID(int expID) {
        return ExpGroupDAO.getExpGroupByExpID(expID);
    }

}
