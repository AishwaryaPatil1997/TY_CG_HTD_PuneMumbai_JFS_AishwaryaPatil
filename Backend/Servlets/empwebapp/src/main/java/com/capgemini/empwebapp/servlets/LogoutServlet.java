package com.capgemini.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.empwebapp.bean.EmployeeInfoBean;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession httpSession = req.getSession();
		if (httpSession != null) {
			EmployeeInfoBean employeeInfoBean = (EmployeeInfoBean) httpSession.getAttribute("empId");
			httpSession.invalidate();
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<h3 style='color :green'>Thanks "+employeeInfoBean.getEmp_name()+" for visiting...</h3>");
			out.println("<h3 style='color :red'>Logged Out Successfully...!!!</h3>");
			out.println("</body>");
			out.println("</html>");
			
		}
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("./loginForm.html");
		dispatcher.include(req, resp);
	}
}
