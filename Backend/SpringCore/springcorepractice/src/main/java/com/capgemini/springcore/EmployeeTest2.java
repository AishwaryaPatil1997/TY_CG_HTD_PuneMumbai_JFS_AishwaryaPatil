package com.capgemini.springcore;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.EmployeeBean;

public class EmployeeTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		ApplicationContext context = new ClassPathXmlApplicationContext("employeeConfig.xml");
		EmployeeBean bean1 = context.getBean("employee", EmployeeBean.class);

		System.out.println("Enter Employee ID: ");
		int empId1 = scan.nextInt();
		System.out.println("Enter Employee Name: ");
		String empName1 = scan.next();

		bean1.setEmpId(empId1);
		bean1.setEmpName(empName1);

		System.out.println();
		
		EmployeeBean bean2 = context.getBean("employee", EmployeeBean.class);

		System.out.println("Enter Employee ID: ");
		int empId2 = scan.nextInt();
		System.out.println("Enter Employee Name: ");
		String empName2 = scan.next();

		bean2.setEmpId(empId2);
		bean2.setEmpName(empName2);
		
		System.out.println();
		System.out.println("Employee ID: "+bean1.getEmpId());
		System.out.println("Employee Name: "+bean1.getEmpName());
		System.out.println();
		System.out.println("Employee ID: "+bean2.getEmpId());
		System.out.println("Employee Name: "+bean2.getEmpName());
	}
}
