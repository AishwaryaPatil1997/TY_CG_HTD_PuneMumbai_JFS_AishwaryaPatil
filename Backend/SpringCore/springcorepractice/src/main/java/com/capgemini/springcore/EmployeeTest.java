package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.EmployeeBean;

public class EmployeeTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeBean employeeBean1 = (EmployeeBean) applicationContext.getBean("employeeBean1");
		EmployeeBean employeeBean2 = applicationContext.getBean("employeeBean2", EmployeeBean.class);
		
		System.out.println("Employee ID: "+employeeBean1.getEmpId());
		System.out.println("Employee Name: "+employeeBean1.getEmpName());
		System.out.println();
		System.out.println("Employee ID: "+employeeBean2.getEmpId());
		System.out.println("Employee Name: "+employeeBean2.getEmpName());
	}
}
