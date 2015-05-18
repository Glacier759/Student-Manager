package com.zzx.graduate.entity;

/**
 * Created by glacier on 15-5-18.
 */
public class ShortQuestionBean {

    private int questionID;
    private String questionName, questionType;

    public ShortQuestionBean() {

    }

    /**
     * @param questionID 问题ID
     * @param questionName 问题题目
     * @param questionType 问题类型
     * */
    public ShortQuestionBean(int questionID, String questionName, String questionType) {
        this.questionID = questionID;
        this.questionName = questionName;
        this.questionType = questionType;
    }

    public int getQuestionID() {
        return questionID;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }
}
