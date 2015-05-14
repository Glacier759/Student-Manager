package com.zzx.graduate.entity;

import java.util.Date;

/**
 * Created by glacier on 15-5-14.
 */
public class StudentBean {

    private int stuID, classID;
    private String stuSN;
    private int stuIndex;
    private Date enrolDate;
    private String name, sex, telNum, email;
    private String familyContact, familyTel, familyAddr;
    private int status;

    public StudentBean() {

    }

    /**
     * @param stuID 学生ID
     * @param classID 班级编号
     * @param stuSN 学号
     * @param stuIndex 序号
     * @param enrolDate 入学时间
     * @param name 姓名
     * @param sex 性别
     * @param telNum 联系电话
     * @param email email
     * @param familyContact 家庭联系人
     * @param familyTel 家庭联系电话
     * @param familyAddr 家庭住址
     * @param status 状态
     * */
    public StudentBean(int stuID, int classID, String stuSN, int stuIndex, Date enrolDate, String name, String sex, String telNum, String email, String familyContact, String familyTel, String familyAddr, int status) {
        this.stuID = stuID;
        this.classID = classID;
        this.stuSN = stuSN;
        this.stuIndex = stuIndex;
        this.enrolDate = enrolDate;
        this.name = name;
        this.sex = sex;
        this.telNum = telNum;
        this.email = email;
        this.familyContact = familyContact;
        this.familyTel = familyTel;
        this.familyAddr = familyAddr;
        this.status = status;
    }

    public int getStuID() {
        return stuID;
    }

    public void setStuID(int stuID) {
        this.stuID = stuID;
    }

    public int getClassID() {
        return classID;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }

    public String getStuSN() {
        return stuSN;
    }

    public void setStuSN(String stuSN) {
        this.stuSN = stuSN;
    }

    public int getStuIndex() {
        return stuIndex;
    }

    public void setStuIndex(int stuIndex) {
        this.stuIndex = stuIndex;
    }

    public Date getEnrolDate() {
        return enrolDate;
    }

    public void setEnrolDate(Date enrolDate) {
        this.enrolDate = enrolDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFamilyContact() {
        return familyContact;
    }

    public void setFamilyContact(String familyContact) {
        this.familyContact = familyContact;
    }

    public String getFamilyTel() {
        return familyTel;
    }

    public void setFamilyTel(String familyTel) {
        this.familyTel = familyTel;
    }

    public String getFamilyAddr() {
        return familyAddr;
    }

    public void setFamilyAddr(String familyAddr) {
        this.familyAddr = familyAddr;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
