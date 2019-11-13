package com.capgemini.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetEmployeeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String empIdVal = req.getParameter("empId");
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>Employee Id " + empIdVal + " Found</h1>");
		out.print("<h3>Employee Name = Samba<br>");
		out.print("Salary = 2000000<br>");
		out.print("Address = Blr");
		out.println("Designation = SD</h3>");
		out.print("</html>");
		out.print("</body>");
	}
}
