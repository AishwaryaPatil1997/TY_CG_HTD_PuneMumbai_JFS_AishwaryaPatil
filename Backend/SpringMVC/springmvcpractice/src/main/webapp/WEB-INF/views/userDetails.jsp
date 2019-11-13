<%@page import="com.capgemini.springmvc.bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%  /* String empId =(String) request.getAttribute("empId"); */

	/* int empId =(int) request.getAttribute("empId");
	String password = (String) request.getAttribute("password"); */
	
	UserBean userBean = (UserBean) request.getAttribute("userBean"); 
%>
	
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Details</title>
</head>
<body>
	<%-- <h3>Entered Employee ID : <%=empId%></h3>
	<h3>Entered Password : <%=password%></h3> --%>
	
	<h3>Entered Employee ID : <%=userBean.getEmpId()%></h3>
	<h3>Entered Password : <%=userBean.getPassword()%></h3>
	<h3>Entered DOB : <%=userBean.getDob()%></h3>
</body>
</html>