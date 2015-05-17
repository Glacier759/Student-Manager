<%@ page import="com.zzx.graduate.service.ExperimentService" %>
<%@ page import="com.zzx.graduate.entity.ExperimentBean" %>
<%@ page import="com.zzx.graduate.entity.StudentInfo" %>
<%@ page import="java.util.List" %>
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
        <script type="text/javascript" src="<%=request.getContextPath()%>/resource/js/jquery-2.1.1.min.js"></script>
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
<div id="content">
<div >
    <table  class="datalist">
        <caption>实验安排 2015.3 - 2015.7</caption>
        <tr>
            <th scope="col">实验名称</th>
            <th scope="col">时间</th>
            <th scope="col">地点</th>
            <th scope="col">指导老师</th>
            <th scope="col">报告提交日期</th>
        </tr>
        <%--<%--%>
            <%--StudentInfo student = (StudentInfo)session.getAttribute("stu_info");--%>
            <%--ExperimentService service = new ExperimentService(student.getStuNumber());--%>
            <%--List<ExperimentBean> beans = service.getAllExperiment();--%>
            <%--for ( int i = 1; i <= beans.size(); i ++ ) {--%>
<%--//                ExperimentBean bean = beans.get(i-1);--%>
<%--//                if ( i % 2 == 1 ) {--%>
        <%--%>--%>
            <tr>
                <th scope="row">微机原理</th>
                <td>3.1</td>
                <td>FF109</td>
                <td>张三</td>
                <td>3.4</td>
            </tr>
        <%--<%--%>
                <%--}--%>
                <%--else {--%>
        <%--%>--%>
            <tr class="altrow">
                <th scope="row">微机原理</th>
                <td>3.1</td>
                <td>FF109</td>
                <td>张三</td>
                <td>3.4</td>
            </tr>
        <%--<%--%>
                <%--}--%>
<%--//            }--%>
        <%--%>--%>
    </table>
</div>
</div>
<footer class="footer"><h4>Copyright © 软件工程实践综合教学平台</h4></footer>
</body>
</html>