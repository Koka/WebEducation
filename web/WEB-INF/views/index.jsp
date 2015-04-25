<%--
  Created by IntelliJ IDEA.
  User: Grand
  Date: 25.04.2015
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sample</title>
</head>
<body>
<%
  double num = Math.random();
  if (num > 0.95) {
%>
<h2>You'll have a luck day!</h2><p>(<%= num %>)</p>
<%
} else {
%>
<h2>Well, life goes on ... </h2><p>(<%= num %>)</p>
<%
  }
%>
</body>
</html>
