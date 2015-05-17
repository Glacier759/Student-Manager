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
            <caption>XXX，您本学期所有成绩</caption>
            <tr>
                <th scope="col">科目</th>
                <th scope="col">成绩</th>
                <th scope="col">名次</th>
                <th scope="col">学年</th>
                <th scope="col">学期</th>
            </tr>
            <tr>
                <th scope="row">微机原理</th>
                <td>3.1</td>
                <td>FF109</td>
                <td>张三</td>
                <td>3.4</td>
            </tr>
            <tr class="altrow">
                <th scope="row">微机原理</th>
                <td>3.1</td>
                <td>FF109</td>
                <td>张三</td>
                <td>3.4</td>
            </tr>
            <tr>
                <th scope="row">微机原理</th>
                <td>3.1</td>
                <td>FF109</td>
                <td>张三</td>
                <td>3.4</td>
            </tr>
            <tr class="altrow">
                <th scope="row">微机原理</th>
                <td>3.1</td>
                <td>FF109</td>
                <td>张三</td>
                <td>3.4</td>
            </tr>
            <tr>
                <th scope="row">微机原理</th>
                <td>3.1</td>
                <td>FF109</td>
                <td>张三</td>
                <td>3.4</td>
            </tr>
            <tr class="altrow">
                <th scope="row">微机原理</th>
                <td>3.1</td>
                <td>FF109</td>
                <td>张三</td>
                <td>3.4</td>
            </tr>
            <tr>
                <th scope="row">微机原理</th>
                <td>3.1</td>
                <td>FF109</td>
                <td>张三</td>
                <td>3.4</td>
            </tr>
            <tr class="altrow">
                <th scope="row">微机原理</th>
                <td>3.1</td>
                <td>FF109</td>
                <td>张三</td>
                <td>3.4</td>
            </tr>
        </table>
        <div class="select">
            <p >
                请输入您要查找的成绩的所属科目及学年：
            </p>

            <ul class="zhuceList">
                <li class="zhuceList-li">科目：</li>
                <li >
                    <input id="couseName" name="couseName" class="zhuceList-li-input" type="text" value="couseName">
                </li>
            </ul>
            <ul class="zhuceList">
                <li class="zhuceList-li">学年：</li>
                <li >
                    <input id="timeC" name="timeC" class="zhuceList-li-input" type="text" value="timeC">
                </li>
            </ul>
                <li class="zhuceList-li">成绩：</li>
                <li >
                    <input style="margin-bottom:30px"id="grad" name="grad" class="zhuceList-li-input" type="text" value="grad">
                </li>
            </ul>
        </div>

    </div>
</div>
<footer class="footer"><h4>Copyright © 软件工程实践综合教学平台</h4></footer>
</body>
</html>