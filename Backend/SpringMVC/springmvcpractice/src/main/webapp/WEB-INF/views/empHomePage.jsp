<%@page import="com.capgemini.springmvc.bean.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>

<%
	HttpSession session = request.getSession(false);
	EmployeeInfoBean employeeInfoBean = (EmployeeInfoBean) session.getAttribute("employeeInfoBean");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3 style="color: green">Welcome <%= employeeInfoBean.getEmp_name() %> !!!</h3>

	<a href="./addEmpForm">Add Employee</a>
	<br>
	<a href="./updateEmployeeForm">Update Employee</a>
	<br>
	<a href="./deleteEmployeeForm">Delete Employee</a>
	<br>
	<a href="./searchEmployeeForm">Search Employee</a>
	<br>
	<a href="./seeAllEmployees">See All Employees</a>
	<br>
	<br>
	
	<a href="./logout">Logout</a>
</body>
</html>