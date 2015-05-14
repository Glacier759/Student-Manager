package com.zzx.graduate.entity;

import java.util.Date;

/**
 * Created by glacier on 15-5-14.
 */
public class TaskResultBean {

    private int resultID, taskID, submitterID;
    private Date submitTime;
    private String review;
    private int reviewStatus;
    private double score;

    public TaskResultBean() {

    }

    /**
     * @param resultID 实验结果ID
     * @param taskID 任务ID
     * @param submitterID 提交者ID
     * @param submitTime 提交时间
     * @param review 评语
     * @param reviewStatus 评阅状态
     * @param score 实验成绩
     * */
    public TaskResultBean(int resultID, int taskID, int submitterID, Date submitTime, String review, int reviewStatus, double score) {
        this.resultID = resultID;
        this.taskID = taskID;
        this.submitterID = submitterID;
        this.submitTime = submitTime;
        this.review = review;
        this.reviewStatus = reviewStatus;
        this.score = score;
    }

    public int getResultID() {
        return resultID;
    }

    public void setResultID(int resultID) {
        this.resultID = resultID;
    }

    public int getTaskID() {
        return taskID;
    }

    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }

    public int getSubmitterID() {
        return submitterID;
    }

    public void setSubmitterID(int submitterID) {
        this.submitterID = submitterID;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public int getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(int reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
