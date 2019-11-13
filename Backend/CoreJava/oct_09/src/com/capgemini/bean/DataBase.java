package com.capgemini.bean;

public class DataBase 
{
	void receive (Student t) 
	{
		System.out.println("----------I am Student DataBase----------");
		System.out.println("Name: "+t.getName());
		System.out.println("ID: "+t.getId());
		System.out.println("Height: "+t.getHeight());
	}
	
	void receive (Employee e)
	{
		System.out.println("----------I am Employee DataBase----------");
		System.out.println("Name: "+e.getName());
		System.out.println("ID: "+e.getId());
		System.out.println("Department: "+e.getDepartment());
		System.out.println("Role: "+e.getRole());
		System.out.println("Salary: "+e.getSalary());
	}
}
