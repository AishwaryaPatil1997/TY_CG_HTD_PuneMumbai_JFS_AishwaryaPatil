package com.capgemini.springcore.annotation.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.capgemini.springcore.annotation.beans.EmployeeBean;
import com.capgemini.springcore.annotation.config.EmployeeConfig;

public class EmployeeTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		
		System.out.println();
		System.out.println("Employee ID: "+employeeBean.getEmpId());
		System.out.println("Employee Name: "+employeeBean.getEmpName());
		System.out.println();
		System.out.println("Department ID: "+employeeBean.getDeptBean().getDeptId());
		System.out.println("Department Name: "+employeeBean.getDeptBean().getDeptname());
		System.out.println();
		
		((AbstractApplicationContext)context).close();
	}
}
