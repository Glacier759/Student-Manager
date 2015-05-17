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

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
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

    public CourseClassBean getCourseClassByCourClassID(int courClassID) {
        return CourseClassDAO.getCourseClassByID(courClassID);
    }

    public ExperimentBean getExperimentByExpID(int expID) {
        return ExperimentDAO.getExperimentByID(expID);
    }

    public ExpTaskBean getExpTaskByExpID(int expID) {
        try {
            List<ExpTaskBean> beans = ExpTaskDAO.getExpTaskByExpID(expID);
            return beans.get(0);
        }catch (Exception e) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            e.printStackTrace(new PrintStream(baos));
            logger.error(baos.toString());
        }
        return null;
    }

    public List<ExpGroupBean> getExpGroupByExpID(int expID) {
        return ExpGroupDAO.getExpGroupByExpID(expID);
    }

}
