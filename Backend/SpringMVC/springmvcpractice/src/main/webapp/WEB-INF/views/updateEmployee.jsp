<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>

<%
	String msg = (String) request.getAttribute("msg");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee Portal</title>
</head>
<body>

	<%
		if (msg != null && !msg.isEmpty()) {
	%>
	<h3 style="color: green"><%=msg%></h3>
	<%
		}
	%>

	<fieldset>
		<legend>Update Employee</legend>
		<form action="./updateEmployee" method="post">
			<table>
				<tr>
					<td>Employee ID</td>
					<td>:</td>
					<td><input type="number" name="emp_id"></td>
				</tr>
				<tr>
					<td>Employee Name</td>
					<td>:</td>
					<td><input type="text" name="emp_name"></td>
				</tr>
				<tr>
					<td>Age</td>
					<td>:</td>
					<td><input type="number" name="age"></td>
				</tr>
				<tr>
					<td>Salary</td>
					<td>:</td>
					<td><input type="number" name="salary"></td>
				</tr>
				<tr>
					<td>Designation</td>
					<td>:</td>
					<td><input type="text" name="designation"></td>
				</tr>
				<tr>
					<td>Gender</td>
					<td>:</td>
					<td><input type="text" name="gender"></td>
				</tr>
				<tr>
					<td>Mobile</td>
					<td>:</td>
					<td><input type="number" name="mobile"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td>:</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td colspan="3" align="center"><br> <input type="submit"
						value="Update"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>