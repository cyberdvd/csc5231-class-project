<%--
  Created by IntelliJ IDEA.
  User: david
  Date: 14/08/2019
  Time: 2:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<html>
<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Exception Handling - Security Error</title>

</head>
<body>
<h4>There has been a security error.</h4>

<p> Please contact technical support with the following information:</p>

<!-- the exception and exceptionStack bean properties
were created by Struts2's Exception Interceptor (see page 89) -->
<h4>Exception Name: <s:property value="exception"/></h4>
<h4>Exception Details: <s:property value="exceptionStack"/></h4>

<p><a href="index.jsp">Return to the home page.</a></p>
</body>
</html>
