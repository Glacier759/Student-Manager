package com.zzx.graduate.servlet;

import com.zzx.graduate.entity.UserEntity;

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
        UserEntity userEntity = new UserEntity(request.getParameter("username"), request.getParameter("password"));
        userEntity.login();
        //跳转至指定jsp页面
        //requestDispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
