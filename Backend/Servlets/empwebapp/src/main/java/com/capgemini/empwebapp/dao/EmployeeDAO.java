package com.capgemini.empwebapp.dao;

import com.capgemini.empwebapp.bean.EmployeeInfoBean;

public interface EmployeeDAO {

	public EmployeeInfoBean getEmployee(int emp_id);
	public EmployeeInfoBean authenticate(int emp_id, String password);
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean);
	public boolean updateEmployee(EmployeeInfoBean employeeInfoBean);
}
