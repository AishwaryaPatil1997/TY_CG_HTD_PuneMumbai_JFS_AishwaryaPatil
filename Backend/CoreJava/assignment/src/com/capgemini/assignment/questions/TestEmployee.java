package com.capgemini.assignment.questions;

public class TestEmployee 
{
	public static void main(String[] args) 
	{
		Employee em[] = new Employee[4];

		Employee e1 = new Employee(1,"Divya", 450000.0,'F');
		Employee e2 = new Employee(2,"Raju", 400000.0,'M');
		Employee e3 = new Employee(3,"Chinnu", 650000.0,'M');
		Employee e4 = new Employee(4,"Dimple", 520000.0,'F');

		em[0] = e1;
		em[1] = e2;
		em[2] = e3;
		em[3] = e4;
		
		receive(em);
	}

	static void receive(Employee a[])
	{
		for (Employee e : a) 
		{
			System.out.println(e.id);
			System.out.println(e.name);
			System.out.println(e.salary);
			System.out.println(e.gender);
			System.out.println("------------------");
		}
	}
}
