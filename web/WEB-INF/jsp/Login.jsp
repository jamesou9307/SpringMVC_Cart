<%--
  Created by IntelliJ IDEA.
  User: JAMES
  Date: 2018/2/15
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>login</title>
    <link rel="stylesheet" href="css/bootstrap.css">
    <script src="js/jquery-1.9.1.js"></script>
    <script src="js/bootstrap.js"></script>
</head>
<body>
<form:form commandName="user" action="login" method="post" role="form">
    <div class="form-group">
        <label for="userid">用户id</label>
        <form:input path="userId" id="userid" class="form-controll" placeholder="请输入用户id"/>
        <label for="userPassword"></label>
        <form:password path="userPassword" id="userPassword" class="form-controll" placeholder="请输入密码"/>
        <button class="btn btn-primary" type="submit">提交</button>
    </div>
</form:form>
</body>
</html>
