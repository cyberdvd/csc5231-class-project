<%--
  Created by IntelliJ IDEA.
  User: david
  Date: 14/08/2019
  Time: 2:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <title>Account Registration</title>
    <s:head/>
</head>
<body>
<s:if test="id > 0">
    <h3>Edit Account</h3>
</s:if>
<s:else>
    <h3>Create Account</h3>

</s:else>
<s:form action="saveOrUpdateAccount">

    <s:hidden key="account.id"/>
    <s:textfield key="account.firstName"/>
    <s:textfield key="account.lastName"/>
    <s:textfield key="account.username"/>
    <s:password key="account.password"/>
    <s:textfield key="account.email"/>
    <%--<s:textfield key="account.dateOfBirth"/>--%>
    <s:submit/>
</s:form>
</body>
</html>
