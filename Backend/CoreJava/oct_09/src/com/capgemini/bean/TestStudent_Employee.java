package com.capgemini.bean;

public class TestStudent_Employee 
{
	public static void main(String[] args) 
	{
		Student s = new Student();
		s.setName("Dimple");
		s.setId(20);
		s.setHeight(5.12);
		
		Employee e1 = new Employee();
		e1.setName("Divya");
		e1.setId(24);
		e1.setDepartment("Development");
		e1.setRole("Associate Engineer");
		e1.setSalary(300000.0);

		DataBase db = new DataBase();
		db.receive(s);
		db.receive(e1);
	}
}
