package com.zzx.graduate.servlet;

import com.zzx.graduate.entity.ChoiceAnswerBean;
import com.zzx.graduate.entity.ChoiceQuestionBean;
import com.zzx.graduate.entity.ShortAnswerBean;
import com.zzx.graduate.entity.ShortQuestionBean;
import com.zzx.graduate.service.QAService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by glacier on 15-5-18.
 */
public class TestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");

        QAService service = new QAService();
        HttpSession session = request.getSession();
        List<ChoiceQuestionBean> choiceBeans = (List<ChoiceQuestionBean>)session.getAttribute("choiceBeans");
        List<ShortQuestionBean> shortBeans = (List<ShortQuestionBean>)session.getAttribute("shortBeans");

        for ( int index = 1; index <= choiceBeans.size(); index ++ ) {
            ChoiceAnswerBean answerBean = new ChoiceAnswerBean();
            ChoiceQuestionBean questionBean = choiceBeans.get(index-1);
            String key = "a" + index;
            answerBean.setQuestionID(questionBean.getQuestionID());
            answerBean.setOptionAnswer(request.getParameter(key));
            service.setChoiceAnswer(answerBean);
        }

        for ( int index = 1; index <= shortBeans.size(); index ++ ) {
            ShortAnswerBean answerBean = new ShortAnswerBean();
            ShortQuestionBean questionBean = shortBeans.get(index-1);
            String key = "a" + (index+5);
            answerBean.setQuestionID(questionBean.getQuestionID());
            answerBean.setAnswerEnty(request.getParameter(key));
            service.setShortAnswer(answerBean);
        }
        requestDispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
