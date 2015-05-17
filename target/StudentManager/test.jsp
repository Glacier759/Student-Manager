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
        <div class="test">
        <table class="datalist">
            <tr>
                <th scope="col">测试标题</th>
                <th scope="col">开始时间</th>
                <th scope="col">截止时间</th>
                <th scope="col">限制用时（分钟）</th>
            </tr>
            <tr >
                <td >微机原理</td>
                <td>3.1</td>
                <td>FF109</td>
                <td>张三</td>
            </tr>
        </table>
          <form class="question" action="" >
              <p>不定项选择题</p>
              <ul>
                  <li>
                      第1题
                  </li>
                  <input name="a1" class="check" type="checkbox" value=""  />A
                  <input name="a1" class="check" type="checkbox" value="" />B
                  <input name="a1" class="check" type="checkbox" value="" />C
                  <input name="a1" class="check" type="checkbox" value="" />D
              </ul>
              <ul>
                  <li>
                      第1题
                  </li>
                  <input name="a2" class="check" type="checkbox" value=""  />A
                  <input name="a2" class="check" type="checkbox" value="" />B
                  <input name="a2" class="check" type="checkbox" value="" />C
                  <input name="a2" class="check" type="checkbox" value="" />D
              </ul>
              <ul>
                  <li>
                      第2题
                  </li>
                  <input name="a3" class="check" type="checkbox" value=""  />A
                  <input name="a3" class="check" type="checkbox" value="" />B
                  <input name="a3" class="check" type="checkbox" value="" />C
                  <input name="a3" class="check" type="checkbox" value="" />D
              </ul><ul>
              <li>
                  第3题
              </li>
              <input name="a3" class="check" type="checkbox" value=""  />A
              <input name="a3" class="check" type="checkbox" value="" />B
              <input name="a3" class="check" type="checkbox" value="" />C
              <input name="a3" class="check" type="checkbox" value="" />D
          </ul>
              <ul>
              <li>
                  第4题
              </li>
                  <input name="a4" class="check" type="checkbox" value=""  />A
                  <input name="a4" class="check" type="checkbox" value="" />B
                  <input name="a4" class="check" type="checkbox" value="" />C
                  <input name="a4" class="check" type="checkbox" value="" />D
          </ul>
              <ul>
                  <li>
                      第5题
                  </li>
                  <input name="a5" class="check" type="checkbox" value=""  />A
                  <input name="a5" class="check" type="checkbox" value="" />B
                  <input name="a5" class="check" type="checkbox" value="" />C
                  <input name="a5" class="check" type="checkbox" value="" />D
              </ul>
              <p>简答题</p>
              <div class="jianda">
                  <ul>
                      <li>
                          第1题
                      </li>
                      <input name="a6" class="check" type="text" value=""  />
                  </ul>
                  <ul>
                      <li>
                          第2题
                      </li>
                      <input name="q7" class="check" type="text" value=""  />
                  </ul>
                  <ul>
                      <li>
                          第3题
                      </li>
                      <input name="a8" class="check" type="text" value=""  />
                  </ul><ul>
                  <li>
                      第4题
                  </li>
                  <input name="a9" class="check" type="text" value=""  />
              </ul>
                  <ul>
                      <li>
                          第5题
                      </li>
                      <input name="a10" class="check" type="text" value=""  />
                  </ul>
              </div>
              <input type="submit" class="input_login center" name="submit" value="提交" />
          </form>
        </div>
</div>
<footer class="footer"><h4>Copyright © 软件工程实践综合教学平台</h4></footer>
</body>
</html>