package com.zzx.graduate.service;

import com.zzx.graduate.dao.QADAO;
import com.zzx.graduate.entity.ChoiceAnswerBean;
import com.zzx.graduate.entity.ChoiceQuestionBean;
import com.zzx.graduate.entity.ShortAnswerBean;
import com.zzx.graduate.entity.ShortQuestionBean;

import java.util.List;

/**
 * Created by glacier on 15-5-18.
 */
public class QAService {

    public List<ChoiceQuestionBean> getChoiceQuestion(String questionType){
        return QADAO.getChoiceQuestion(questionType);
    }

    public List<ShortQuestionBean> getShortQuestion(String questionType) {
        return QADAO.getShortQuestion(questionType);
    }

    public void setChoiceAnswer(ChoiceAnswerBean choiceAnswer) {
        QADAO.setChoiceAnswer(choiceAnswer);
    }

    public void setShortAnswer(ShortAnswerBean shortAnswer) {
        QADAO.setShortAnswer(shortAnswer);
    }

}
