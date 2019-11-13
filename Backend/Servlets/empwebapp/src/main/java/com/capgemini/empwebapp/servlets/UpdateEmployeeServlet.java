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
import com.capgemini.empwebapp.dao.EmployeeDAO;
import com.capgemini.empwebapp.dao.EmployeeDAOJPAImpl;

@WebServlet("/updateEmployee")
public class UpdateEmployeeServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession httpSession = req.getSession(false);
		if (httpSession != null) {
			//valid session
			//Get the form data
			int emp_id = Integer.parseInt(req.getParameter("emp_id"));
			int age = Integer.parseInt(req.getParameter("age"));
			double salary = Double.parseDouble(req.getParameter("salary"));
			String emp_name = req.getParameter("emp_name");
			String password = req.getParameter("password");
			String designation = req.getParameter("designation");
			long mobile = Long.parseLong(req.getParameter("mobile"));
			
			EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();
			employeeInfoBean.setEmp_id(emp_id);
			employeeInfoBean.setAge(age);
			employeeInfoBean.setSalary(salary);
			employeeInfoBean.setEmp_name(emp_name);
			employeeInfoBean.setPassword(password);
			employeeInfoBean.setDesignation(designation);
			employeeInfoBean.setMobile(mobile);
			
			EmployeeDAO dao = new EmployeeDAOJPAImpl();
			boolean isadded = dao.addEmployee(employeeInfoBean);
			
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			if (isadded) {
				out.println("<h3>Employee record updated successfully...</h3>");
			} else {
				out.println("<h3 style='color :red'>Unable to update employee record...</h3>");
			}
			out.println("</body>");
			out.println("</html>");
			
			
		} else {
			//invalid session
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<h3 style='color :red'>Please login first to add employee...</h3>");
			out.println("</body>");
			out.println("</html>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("./loginForm.html");
			dispatcher.include(req, resp);
		}
	}
}
