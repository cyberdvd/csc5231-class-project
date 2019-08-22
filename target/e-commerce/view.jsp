<%--
  Created by IntelliJ IDEA.
  User: david
  Date: 14/08/2019
  Time: 3:06 PM
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
    <title>View Account</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">

</head>

<body>
<h3>Accounts</h3>


<s:if test="accountList.size > 0">
    <ol>
        <s:iterator value="accountList">
            <li>
                <s:property value="firstName" />

                <s:property value="lastName" />

                    <%--Put the name of the method we want to call
                    in front of Person.  This action will cause
                    the method named edit to be called in the
                    ActionSupport class (see struts.xml)  --%>
                <s:url action="editAccount" var="editUrl">
                    <s:param name="id" value="id"/>
                </s:url>

                <s:url action="deleteAccount" var="deleteUrl">
                    <s:param name="id" value="id"/>
                </s:url>

                <a href="<s:property value='#editUrl' />" >Edit</a>

                <a href="<s:property value='#deleteUrl' />" >Delete</a>
            </li>
        </s:iterator>
    </ol>
</s:if>

<%--Put the name of the method we want to call
in front of Person.  This action will cause
the method named create to be called in the
ActionSupport class (see struts.xml)  --%>
<s:url action="createAccount" var="newUrl">
    <s:param name="id" value="0"/>
</s:url>

<p><a href="<s:property value='#newUrl' />" > Create new account.</a></p>
</body>
</html>