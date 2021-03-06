package com.zzx.graduate.entity;

/**
 * Created by glacier on 15-5-14.
 */
public class CourseClassBean {

    private int courClassID, courID, dictID, teachID;
    private String semester;
    private int status;

    public CourseClassBean() {

    }

    /**
     * @param courClassID 课程班编号
     * @param courID 课程ID
     * @param dictID 数据字典ID
     * @param teachID 教师ID
     * @param semester 开学时间
     * @param status 状态
     * */
    public CourseClassBean(int courClassID, int courID, int dictID, int teachID, String semester, int status) {
        this.courClassID = courClassID;
        this.courID = courID;
        this.dictID = dictID;
        this.teachID = teachID;
        this.semester = semester;
        this.status = status;
    }

    public int getCourClassID() {
        return courClassID;
    }

    public void setCourClassID(int courClassID) {
        this.courClassID = courClassID;
    }

    public int getCourID() {
        return courID;
    }

    public void setCourID(int courID) {
        this.courID = courID;
    }

    public int getDictID() {
        return dictID;
    }

    public void setDictID(int dictID) {
        this.dictID = dictID;
    }

    public int getTeachID() {
        return teachID;
    }

    public void setTeachID(int teachID) {
        this.teachID = teachID;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
