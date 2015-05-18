package com.zzx.graduate.entity;

/**
 * Created by glacier on 15-5-18.
 */
public class ChoiceAnswerBean {

    private int answerID, questionID;
    private String optionAnswer;

    public ChoiceAnswerBean() {

    }

    /**
     * @param answerID 答案ID
     * @param questionID 答案对应的问题ID
     * @param optionAnswer 答案选项内容
     * */
    public ChoiceAnswerBean(int answerID, int questionID, String optionAnswer) {
        this.answerID = answerID;
        this.questionID = questionID;
        this.optionAnswer = optionAnswer;
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

    public String getOptionAnswer() {
        return optionAnswer;
    }

    public void setOptionAnswer(String optionAnswer) {
        this.optionAnswer = optionAnswer;
    }
}
