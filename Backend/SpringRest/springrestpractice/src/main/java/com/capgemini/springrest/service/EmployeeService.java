package com.capgemini.springrest.service;

import java.util.List;

import com.capgemini.springrest.bean.EmployeeInfoBean;

public interface EmployeeService {

	public EmployeeInfoBean getEmployee(int emp_id);
	public EmployeeInfoBean authenticate(int emp_id, String password);
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean);
	public boolean updateEmployee(EmployeeInfoBean employeeInfoBean);
	public boolean deleteEmployee(int empId);
	public List<EmployeeInfoBean> getAllEmployees();
}
