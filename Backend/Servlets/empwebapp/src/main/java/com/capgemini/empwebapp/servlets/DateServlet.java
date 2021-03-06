package com.capgemini.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateServlet extends HttpServlet{

	public DateServlet() {
		System.out.println("Instantiation Phase...!!!");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("Initialization Phase...!!!");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Service Phase...!!!");
		
		Date date = new Date();
		
		resp.setHeader("refresh", "1");
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
//		out.println("<head>");
//		out.println("<meta http-equiv='refresh'content='1'>");
//		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Current System Date & Time-<br>");
		out.println(date + "</h1>");
		out.println("</html>");
		out.println("</body>");
	}
	
	@Override
	public void destroy() {
		super.destroy();
		System.out.println("Destroy Phase...!!!");
	}
}
