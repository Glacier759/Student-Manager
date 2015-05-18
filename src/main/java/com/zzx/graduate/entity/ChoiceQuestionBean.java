package com.zzx.graduate.entity;

/**
 * Created by glacier on 15-5-18.
 */
public class ChoiceQuestionBean {

    private int questionID;
    private String questionName, questionType;
    private String optionA, optionB, optionC, optionD;

    public ChoiceQuestionBean() {

    }

    /**
     * @param questionID 选择题编号
     * @param questionName 选择题题目
     * @param questionType 题目类型
     * @param optionA 选项A
     * @param optionB 选项B
     * @param optionC 选项C
     * @param optionD 选项D
     * */
    public ChoiceQuestionBean(int questionID, String questionName, String questionType, String optionA, String optionB, String optionC, String optionD) {
        this.questionID = questionID;
        this.questionName = questionName;
        this.questionType = questionType;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
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

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }
}
