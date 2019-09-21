<%--
  Created by IntelliJ IDEA.
  User: YangML
  Date: 2019/9/21
  Time: 上午9:59
  version:TODO
  To change this template use File | Settings | File Templates.
--%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <base href="<%=basePath%>">
    <title>Title</title>
</head>
<body>
    <H2>hello</H2>
    <a href="blog/BlogMsg">请求</a>
</body>
</html>
