package com.zzx.graduate.entity;

import java.util.Date;

/**
 * Created by glacier on 15-5-14.
 */
public class ExperimentBean {

    private int expID, courClassID, dictID;
    private Date createTime;
    private String expPlan;
    private int groupTag;

    public ExperimentBean() {

    }

    /**
     * @param expID 实验ID
     * @param courClassID 课程班编号
     * @param dictID 数据字典ID
     * @param createTime 创建时间
     * @param expPlan 实验时间安排
     * @param groupTag 分组项目标识
     * */
    public ExperimentBean(int expID, int courClassID, int dictID, Date createTime, String expPlan, int groupTag) {
        this.expID = expID;
        this.courClassID = courClassID;
        this.dictID = dictID;
        this.createTime = createTime;
        this.expPlan = expPlan;
        this.groupTag = groupTag;
    }

    public int getExpID() {
        return expID;
    }

    public void setExpID(int expID) {
        this.expID = expID;
    }

    public int getCourClassID() {
        return courClassID;
    }

    public void setCourClassID(int courClassID) {
        this.courClassID = courClassID;
    }

    public int getDictID() {
        return dictID;
    }

    public void setDictID(int dictID) {
        this.dictID = dictID;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getExpPlan() {
        return expPlan;
    }

    public void setExpPlan(String expPlan) {
        this.expPlan = expPlan;
    }

    public int getGroupTag() {
        return groupTag;
    }

    public void setGroupTag(int groupTag) {
        this.groupTag = groupTag;
    }
}
