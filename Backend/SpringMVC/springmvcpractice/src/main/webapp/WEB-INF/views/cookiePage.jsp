<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%
	String message = (String) request.getAttribute("message");
%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="./createCookie">Click here</a> to create cookie...
	<br>
	<a href="./readCookie">Click here</a> to see cookies...
	<br>
	<br>
	<%
		if (message != null && !message.isEmpty()) {
	%>
	<%=message%>
	<%
		}
	%>
</body>
</html>