package com.zzx.graduate.dao;

import com.zzx.graduate.entity.*;

import java.util.List;

/**
 * Created by glacier on 15-5-14.
 */
public interface MysqlOperation {

    public ExperimentBean getExperimentByID(int expID);

    public List<ExperimentBean> getExperimentByClassID(int courClassID);

    public List<ExperimentBean> getExperimentByDictID(int dictID);

    public List<ExperimentBean> getExperimentByCreateTime(String createTime);

    public List<ExperimentBean> getExperimentBeforeTime(String beforeTime);

    public List<ExperimentBean> getAllExperiments();

    public ExpTaskBean getExpTaskByID(Integer taskID);

    public List<ExpTaskBean> getExpTaskByExpID(Integer expID);

    public List<ExpTaskBean> getExpTaskByTaskIndex(Integer taskIndex);

    public List<ExpTaskBean> getExpTaskByStartTime(String startTime);

    public List<ExpTaskBean> getExpTaskByEndTime(String endTime);

    public ExpGroupBean getExpGroupByID(Integer groupID);

    public List<ExpGroupBean> getExpGroupByExpID(Integer expID);

    public void insertExpGroup(ExpGroupBean expGroupBean);

    public ExpGroupMemBean getExpGroupMemByID(Integer groupMemID);

    public List<ExpGroupMemBean> getExpGroupMemByGroupID(Integer groupID);

    public List<ExpGroupMemBean> getExpGroupMemByStuID(Integer stuID);

    public TaskResultBean getTaskResultByID(Integer resultID);

    public List<TaskResultBean> getTaskResultByTaskID(Integer taskID);

    public List<TaskResultBean> getTaskResultBySubmitterID(Integer submitterID);

    public CourseClassBean getCourseClassByID(Integer courClassID);

    public List<CourseClassBean> getCourseClassByCourID(Integer courID);

    public List<CourseClassBean> getCourseClassByDictID(Integer dictID);

    public List<CourseClassBean> getCourseClassByTeachID(Integer teachID);

    public CourStudentBean getCourStudentByID(Integer selCourID);

    public List<CourStudentBean> getCourStudentByStuID(Integer stuID);

    public List<CourStudentBean> getCourStudentByCourClassID(Integer courClassID);

    public StudentBean getStudentByID(Integer stuID);

    public List<StudentBean> getStudentByClassID(Integer classID);

    public StudentBean getStudentByStuSN(String stuSN);

    public StudentBean getStudentByIndex(Integer stuIndex);

    public List<StudentBean> getStudentByName(String name);

    public void insertExpGroupMem(ExpGroupMemBean expGroupMemBean);

    public void uploadFileByExpGroup(ExpGroupBean expGroupBean);

    public List<ExpGroupBean> getExperimentByStuSN(String stuSN);

    public List<ExpGroupMemBean> getExpGroupMenByGroupID(Integer groupID);

}
