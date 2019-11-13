package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.EmployeeBean;

public class EmployeeTest3 {

	public static void main(String[] args) {
		
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("employeeConfig.xml");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("employeeConfig2.xml");
		EmployeeBean employeeBean1 = (EmployeeBean) applicationContext.getBean("employee");
		
		System.out.println("Employee ID     : "+employeeBean1.getEmpId());
		System.out.println("Employee Name   : "+employeeBean1.getEmpName());
		System.out.println("Department ID   : "+employeeBean1.getDeptBean().getDeptId());
		System.out.println("Department Name : "+employeeBean1.getDeptBean().getDeptname());
	}
}
