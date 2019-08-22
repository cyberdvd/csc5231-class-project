<%--
  Created by IntelliJ IDEA.
  User: david
  Date: 19/07/2019
  Time: 9:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Exception Handling - Error</title>

</head>
<body>
<h4>The application has malfunctioned.</h4>
<p>Please contact technical support with the following information:</p>
<h4>Exception Name:<s:property value="exception"/></h4>
<h4>Exception Details:<s:property value="exceptionStack"/></h4>

</body>
</html>
