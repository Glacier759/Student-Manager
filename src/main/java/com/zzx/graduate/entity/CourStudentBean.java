package com.zzx.graduate.entity;

/**
 * Created by glacier on 15-5-14.
 */
public class CourStudentBean {

    private int selCourID, stuID, courClassID, usualScore;
    private int expScore, interimScore, paperScore, finalScore;
    private String comment;

    public CourStudentBean() {

    }

    /**
     * @param selCourID 选课ID
     * @param stuID 学生ID
     * @param courClassID 课程班编号
     * @param usualScore 作业成绩
     * @param expScore 实验成绩
     * @param interimScore 期中成绩
     * @param paperScore 期末成绩
     * @param finalScore 最终成绩
     * @param comment 备注
     * */
    public CourStudentBean(int selCourID, int stuID, int courClassID, int usualScore, int expScore, int interimScore, int paperScore, int finalScore, String comment) {
        this.selCourID = selCourID;
        this.stuID = stuID;
        this.courClassID = courClassID;
        this.usualScore = usualScore;
        this.expScore = expScore;
        this.interimScore = interimScore;
        this.paperScore = paperScore;
        this.finalScore = finalScore;
        this.comment = comment;
    }

    public int getSelCourID() {
        return selCourID;
    }

    public void setSelCourID(int selCourID) {
        this.selCourID = selCourID;
    }

    public int getStuID() {
        return stuID;
    }

    public void setStuID(int stuID) {
        this.stuID = stuID;
    }

    public int getCourClassID() {
        return courClassID;
    }

    public void setCourClassID(int courClassID) {
        this.courClassID = courClassID;
    }

    public int getUsualScore() {
        return usualScore;
    }

    public void setUsualScore(int usualScore) {
        this.usualScore = usualScore;
    }

    public int getExpScore() {
        return expScore;
    }

    public void setExpScore(int expScore) {
        this.expScore = expScore;
    }

    public int getInterimScore() {
        return interimScore;
    }

    public void setInterimScore(int interimScore) {
        this.interimScore = interimScore;
    }

    public int getPaperScore() {
        return paperScore;
    }

    public void setPaperScore(int paperScore) {
        this.paperScore = paperScore;
    }

    public int getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(int finalScore) {
        this.finalScore = finalScore;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
