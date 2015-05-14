package com.zzx.graduate.servlet;

import com.zzx.graduate.service.LoginByZFsoft;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by glacier on 15-5-14.
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //执行完方法体需要跳转至的jsp页面
        //RequestDispatcher requestDispatcher = request.getRequestDispatcher("xxx.jsp");
        if ( new LoginByZFsoft(request.getParameter("username"), request.getParameter("password")).login()) {
            //如果登陆成功
            request.setAttribute("login", true);
            request.setAttribute("stuSN", request.getParameter("username"));
        }
        else {
            //否则
            request.setAttribute("login", false);
        }
        //跳转至指定jsp页面
        //requestDispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
