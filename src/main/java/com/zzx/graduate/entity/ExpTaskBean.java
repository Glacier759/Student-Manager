package com.zzx.graduate.entity;

import java.util.Date;

/**
 * Created by glacier on 15-5-14.
 */
public class ExpTaskBean {

    private int taskID, expID, taskIndex;
    private String taskName, description, attachFile;
    private Date startTime, endTime;

    public ExpTaskBean() {

    }

    /**
     * @param taskID 任务ID
     * @param expID 实验ID
     * @param taskIndex 任务序号
     * @param taskName 任务名称
     * @param description 任务说明
     * @param attachFile 附件
     * @param startTime 开始时间
     * @param endTime 结束时间
     * */
    public ExpTaskBean(int taskID, int expID, int taskIndex, String taskName, String description, String attachFile, Date startTime, Date endTime) {
        this.taskID = taskID;
        this.expID = expID;
        this.taskIndex = taskIndex;
        this.taskName = taskName;
        this.description = description;
        this.attachFile = attachFile;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getTaskID() {
        return taskID;
    }

    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }

    public int getExpID() {
        return expID;
    }

    public void setExpID(int expID) {
        this.expID = expID;
    }

    public int getTaskIndex() {
        return taskIndex;
    }

    public void setTaskIndex(int taskIndex) {
        this.taskIndex = taskIndex;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAttachFile() {
        return attachFile;
    }

    public void setAttachFile(String attachFile) {
        this.attachFile = attachFile;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
