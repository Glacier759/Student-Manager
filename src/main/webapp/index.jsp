<%@ page import="com.zzx.graduate.entity.StudentInfo" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<html>
    <head>
        <meta http-equiv="content-type" content="text/html; charset=utf-8">
        <title>Student Manager</title>
        <link rel="stylesheet" href="<%=request.getContextPath()%>/resource/css/main.css">
        <link rel="stylesheet" href="<%=request.getContextPath()%>/resource/css/head.css">
        <link rel="stylesheet" href="<%=request.getContextPath()%>/resource/css/content.css">
        <link rel="stylesheet" href="<%=request.getContextPath()%>/resource/css/foot.css">
        <link rel="stylesheet" href="<%=request.getContextPath()%>/resource/css/lunbo.css">
        <script type="text/javascript" src="<%=request.getContextPath()%>/resource/js/lunbo.js"></script>
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
<header id="header"><h1>软件工程实践综合教学平台</h1>
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
    <div id="content-1">
        <section id="sectionL"><header>平台概况</header>
            <article>
                <p>管理和追溯功能，并提供丰富的在线学习资源。“软件工程综合实践教学平台”（下文简称“实践平台”）旨在为软件工程实践打造一套综合实践教学管理平台，实现对实践教学全过程的跟踪、追溯、考核、交流和管理功能，并提供丰富的在线学习资源。 “学生端子系统”主要为学生提供实验（作业）查看、提交、在线考试等方面的功能，具体包括：
            1.实验安排查看
            2.实验小组注册
            3.实验（作业）提交
            4.实验（作业）成绩查看
                  习资源。 “学生端子系统”主要为学生提供实验（作业）查看、提交、在线考试等方面的功能，具体包括
                </p>
            <footer class="content-1-footer">软件工程实践综合教学平台</footer>
        </article>
        </section>
        <aside id="asideR">
            <%
                if ( session.getAttribute("login") == null || session.getAttribute("login").equals("false") ) {
            %>
            <form id="login" method="post" action="LoginServlet">
                <h4 class="login">用户登录</h4>
                <ul class="user">
                    <li class="logo"></li>
                    <li>
                        <input id="username" name="username" class="input_text" placeholder="学号"  type="text">
                    </li>
                </ul>
                <ul class="user">
                    <li class="logoPass"></li>
                    <li>
                        <input id="pass" name="password" class="input_text" placeholder="密码"  type="password">
                    </li>
                </ul>
                <input name="user" class="check" type="checkbox" checked="checked" value="student" />学生
                <input name="user" class="check" type="checkbox" value="teacher"  />教师
                <input name="user" class="check" type="checkbox" value="manager" />管理员
                <button type="submit" class="input_login"> 登陆</button>
            </form>
            <%
                }
                else {
                    StudentInfo student = (StudentInfo)session.getAttribute("stu_info");
            %>
            <br />
            <h4 class="login"><%=student.getStuName()%></h4>
            <br />
            <h4 class="login"><%=student.getStuDepartment()%> - <%=student.getStuMajor()%></h4>
            <br />
            <h4 class="login"><%=student.getStuNumber()%></h4>
            <%
                }
            %>
        </aside>
    </div>
    <div class="clearfix"></div>
    <div id="content-2">
            <div class="asideL-2">
                <header class="content-2-header">关于我们</header>
                <div class="about">我们是西安邮电大学15届的毕业生，本网站是由我们开发和维护。以下是我们的的联系方式，如果您在使用过中如果有什么问题和建议，请您及时联系我们。</div>
                <br>
                <p><span class="myMassage">E-mail:</span>zzxlinux@gmail.com</p>
                <p><span class="myMassage">QQ:</span>592989009</p>
                <P><span class="myMassage">Phone:</span>1879298009</P>
                <span class="welcome">欢迎您的联系！</span>
            </div>
            <div class="mid-2">
                <div id="div1">
                    <ul name="ul1">
                        <li name="li">
                            <img src="<%=request.getContextPath()%>/resource/img/20131024143113-1582401295.jpg">
                        </li>
                        <li>
                            <img src="<%=request.getContextPath()%>/resource/img/1345704584NxlNax1S.jpg">
                        </li>
                        <li>
                            <img src="<%=request.getContextPath()%>/resource/img/imag3.jpg">
                        </li>
                    </ul>

                </div>
                <div class="btn">
                    <a id="a1" href="javascript:" style="font-family:'Rye',cursive;font-size: 35px;color: #d270ff;font-weight: 800;"><div class="bt"></div></a>
                    <a id="a2"  href="javascript:" style=" font-family: 'Rye',cursive;font-size: 35px;color:#d270ff ;font-weight: 800;margin-right: 300px;"><div class="bt"></div></a>
                </div>
                <div class="introduce">
                    实现对实践教学全过程的跟踪、追溯、考核、交流和管理功能，并提供丰富的在线学习资源。 “学生端子系统”主要为学生提供实验（作业）查看、提交、在线考试等方面的功能，具体包括：
                </div>


            </div>
            <div class="asideR-2">
                <header class="content-2-header-r">友情链接</header>
                <ul class="uList">
                    <span>学校官网</span>
                    <li><a href="http://www.xiyou.edu.cn/">西邮主页</a></li>
                    <li><a href="http://www.lib.xiyou.edu.cn/">西邮图书馆</a></li>
                    <li><a href="http://222.24.19.201/">西邮教务处</a></li>
                    <li><a href="http://news.xiyou.edu.cn/">西邮新闻</a></li>
                </ul>
                <ul class="uList">
                    <span>实验室</span>
                    <li><a href="http://www.xiyoulinux.org/">西邮Linux兴趣小组</a></li>
                    <li><a href="http://blog.xiyoulinux.org/">西邮Linux群博客</a></li>
                    <li><a href="http://cs.xiyoulinux.org/">西邮Linux内部交流平台</a></li>
                    <li><a href="http://xylinux.acmclub.com/">西邮LinuxOJ平台</a></li>
                    <li><a href="http://www.xiyoumobile.com/">西邮移动应用开发实验室</a></li>
                    <li><a>西邮网络协会</a></li>
                </ul>
                <ul class="uList">
                    <span>其他高校</span>
                    <li><a>西安交通大学</a></li>
                    <li><a>西安工业大学</a></li>
                    <li><a>西北工业大学大学</a></li>
                    <li><a>西安财经大学</a></li>
                </ul>
            </div>
    </div>
</div>
<footer class="footer"><h4>Copyright © 软件工程实践综合教学平台</h4></footer>
</body>
</html>