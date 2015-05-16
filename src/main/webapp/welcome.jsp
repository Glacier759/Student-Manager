<%@ page import="com.zzx.graduate.entity.StudentInfo" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
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
    <nav id="nav">
        <ul>
            <li><a href="<%=request.getContextPath()%>/index.jsp">首页</a></li>
            <li><a>后台管理</a>
                <ul>
                    <li ><a>实验查询</a></li>
                    <li><a>小组登录</a></li>
                    <li><a>作业提交</a></li>
                    <li><a>成绩查询</a></li>
                    <li><a>在线考试</a></li>
                 </ul>
            </li>
            <li><a>实验资源管理</a>
                <ul>
                    <li ><a>实验查询</a></li>
                    <li><a>小组登录</a></li>
                    <li><a>作业提交</a></li>
                    <li><a>成绩查询</a></li>
                    <li><a>在线考试</a></li>
                </ul>
            </li>
            <li><a>教师端</a>
                <ul>
                    <li ><a>实验查询</a></li>
                    <li><a>小组登录</a></li>
                    <li><a>作业提交</a></li>
                    <li><a>成绩查询</a></li>
                    <li><a>在线考试</a></li>
                </ul>
            </li>
            <li><a href="<%=request.getContextPath()%>/welcome.jsp" target="_blank">学生端</a>
                <ul >
                    <li ><a>实验查询</a></li>
                    <li><a href="<%=request.getContextPath()%>/groupLogin.jsp">小组登录</a></li>
                    <li><a>作业提交</a></li>
                    <li><a>成绩查询</a></li>
                    <li><a>在线考试</a></li>
                </ul>
            </li>
            <li><a>在线测试</a>
                <ul>
                    <li ><a>实验查询</a></li>
                    <li><a>小组登录</a></li>
                    <li><a>作业提交</a></li>
                    <li><a>成绩查询</a></li>
                    <li><a>在线考试</a></li>
                </ul>
            </li>
            <li><a>作业判定</a>
                <ul>
                    <li ><a>实验查询</a></li>
                    <li><a>小组登录</a></li>
                    <li><a>作业提交</a></li>
                    <li><a>成绩查询</a></li>
                    <li><a>在线考试</a></li>
                </ul>
            </li>
            <li><a>学生Android端</a>
                <ul>
                    <li ><a>实验查询</a></li>
                    <li><a>小组登录</a></li>
                    <li><a>作业提交</a></li>
                    <li><a>成绩查询</a></li>
                    <li><a>在线考试</a></li>
                </ul>
            </li>

        </ul>
    </nav>
</header>
<div id="content">
    <div class="asideL-w-1">
        <%
            if ( session.getAttribute("login").equals("true") ) {
                StudentInfo student = (StudentInfo)session.getAttribute("stu_info");
        %>
            <h1 class="welcome-w">welcome,<%=student.getStuName()%>!</h1>
            <h2 class="welcome-w">欢迎您进入软件工程实践综合教学平台！</h2>
            <h2 class="welcome-w">请在顶部导航栏选择您要选择的操作。</h2>
        <%
            }
            else {
        %>
            <h1 class="welcome-w">你并没有登陆成功</h1>
        <%
            }
        %>
    </div>
</div>
<footer class="footer"><h4>Copyright © 软件工程实践综合教学平台</h4></footer>
</body>
</html>