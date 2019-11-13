package com.capgemini.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.empwebapp.bean.EmployeeInfoBean;
import com.capgemini.empwebapp.dao.EmployeeDAO;
import com.capgemini.empwebapp.dao.EmployeeDAOJPAImpl;

@WebServlet("/searchEmployee")
public class SearchEmpServlets extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Get the form
		String empIdVal =  req.getParameter("empId");
		int empId = Integer.parseInt(empIdVal);
		
		EmployeeDAO dao = new EmployeeDAOJPAImpl();
		EmployeeInfoBean employeeInfoBean = dao.getEmployee(empId);
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		
		if (employeeInfoBean != null) {
			//display employee record
			out.println("<h2> Employee ID " + empId +" found:</h2>");
			out.println("Employee Name: " + employeeInfoBean.getEmp_name());
			out.println("<br> Age: " + employeeInfoBean.getAge());
			out.println("<br> Contact no.: " + employeeInfoBean.getMobile());
			out.println("<br> Gender: " + employeeInfoBean.getGender());
			out.println("<br> Designation: " + employeeInfoBean.getDesignation());
			out.println("<br> Salary: " + employeeInfoBean.getSalary());
			out.println("<br> Password: " + employeeInfoBean.getPassword());
		} else {
			//display error message
			out.println("<h3 style='color :red'>Employee ID " + empId + " not found...</h3>");
		}
		
		out.println("</html>");
		out.println("</body>");
	}
}
