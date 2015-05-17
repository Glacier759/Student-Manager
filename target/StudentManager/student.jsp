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
            <th scope="col">实验ID</th>
            <th scope="col">创建时间</th>
            <th scope="col">班级ID</th>
            <th scope="col">实验安排</th>
            <th scope="col">查看详细</th>
            <th scope="col">实验注册</th>
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
                <th scope="row">1</th>
                <td>2014-10-24</td>
                <td>计科1204</td>
                <td>词法分析器</td>
                <td>戳</td>
                <td><a href="<%=request.getContextPath()%>/zhuce.jsp?expID=1">干</a></td>
            </tr>
        <%--<%--%>
                <%--}--%>
                <%--else {--%>
        <%--%>--%>
            <tr class="altrow">
                <th scope="row">2</th>
                <td>2014-08-25</td>
                <td>计科1205</td>
                <td>内核</td>
                <td>戳</td>
                <td><a href="<%=request.getContextPath()%>/zhuce.jsp?expID=2">干</a></td>
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