package com.zzx.graduate.entity;

/**
 * Created by glacier on 15-5-18.
 */
public class ShortAnswerBean {

    private int answerID, questionID;
    private String answerEnty;

    public ShortAnswerBean() {

    }

    /**
     * @param answerID 答案ID
     * @param questionID 答案对应问题ID
     * @param answerEnty 答案实体
     * */
    public ShortAnswerBean(int answerID, int questionID, String answerEnty) {
        this.answerID = answerID;
        this.questionID = questionID;
        this.answerEnty = answerEnty;
    }

    public int getAnswerID() {
        return answerID;
    }

    public void setAnswerID(int answerID) {
        this.answerID = answerID;
    }

    public int getQuestionID() {
        return questionID;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

    public String getAnswerEnty() {
        return answerEnty;
    }

    public void setAnswerEnty(String answerEnty) {
        this.answerEnty = answerEnty;
    }
}
