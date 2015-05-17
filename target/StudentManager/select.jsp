<%@ page import="com.zzx.graduate.entity.StudentInfo" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%
    if ( session.getAttribute("login") == null || session.getAttribute("login").equals("false") ) {
        response.sendRedirect(request.getContextPath() + "/nogrant.jsp");
    }
%>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8">
    <title>Student Manager</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resource/css/main.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resource/css/head.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resource/css/content.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resource/css/foot.css">
</head>
<body>
<%
    if ( session.getAttribute("login") != null && session.getAttribute("login").equals("true") ) {
%>
    <span class="quick">
        <a href="LogoutServlet">退出登录</a>
    </span>
<%
    }
%>
<header id="header">
    <h1>软件工程实践综合教学平台</h1>
    <nav >
        <ul>
            <li><a href="<%=request.getContextPath()%>/student.jsp">实验安排</a></li>
            <li><a href="<%=request.getContextPath()%>/zhuce.jsp">实验注册</a></li>
            <li><a href="<%=request.getContextPath()%>/select.jsp">成绩查询</a></li>
            <li><a href="<%=request.getContextPath()%>/submit.jsp">作业提交</a></li>
            <li><a href="<%=request.getContextPath()%>/test.jsp">在线测试</a></li>
        </ul>
    </nav>
</header>
<%
    StudentInfo student = (StudentInfo)session.getAttribute("stu_info");
%>
<div id="content">
    <div >
        <table  class="datalist">
            <caption><%=student.getStuName()%>，您所参与的所有实验</caption>
            <tr>
                <th scope="col">实验ID</th>
                <th scope="col">实验内容</th>
                <th scope="col">小组成员</th>
                <th scope="col">小组组长</th>
                <th scope="col">状态</th>
                <th scope="col">提交作业</th>
                <th scope="col">成绩查看</th>
            </tr>
            <tr>
                <th scope="row">1</th>
                <td>词法分析器</td>
                <td>张三,李四,王五,赵六,耿七</td>
                <td>小二</td>
                <td>未提交</td>
                <td>一个按钮</td>
                <td>一个按钮</td>
            </tr>
            <tr class="altrow">
                <th scope="row">1</th>
                <td>一个OS的实现</td>
                <td>二货,李四,王五,赵六,耿七</td>
                <td>小三</td>
                <td>已完成</td>
                <td>一个按钮</td>
                <td>一个按钮</td>
            </tr>
        </table>
    </div>
</div>
<footer class="footer"><h4>Copyright © 软件工程实践综合教学平台</h4></footer>
</body>
</html>