<%--
  Created by IntelliJ IDEA.
  User: david
  Date: 14/08/2019
  Time: 1:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Weekend Market</title>
</head>
<body>
<h1>Welcome to the <i>Weekend</i> Market</h1>
<div style="width: 100%">
    <s:url action="createAccount" var="createAccountLink"/>
    <s:url action="login" var="loginLink"/>

    <div style="float:right"><a href="${createAccountLink}">Register</a>&nbsp;|<a href="${loginLink}">Login</a></div>
</div>

</body>
</html>
