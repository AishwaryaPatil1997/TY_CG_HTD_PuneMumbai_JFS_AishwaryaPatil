package com.capgemini.stream.examples;

import java.util.Comparator;
import java.util.TreeSet;

public class TestEmployee1 
{
public static void main(String[] args) 
{
	Comparator<Employee> comp = (a1,a2) -> {
		return a1.name.compareTo(a2.name);
	};
	
	TreeSet<Employee> ts = new TreeSet<Employee>(comp);

	Employee e1 = new Employee(1, "Samba", 5.6);
	Employee e2 = new Employee(2, "Sambi", 5.2);
	Employee e3 = new Employee(3, "Dinga", 4.6);
	Employee e4 = new Employee(4, "Dingi", 4.2);

	ts.add(e1);
	ts.add(e2);
	ts.add(e3);
	ts.add(e4);

	for (Employee e : ts) 
	{
		System.out.println("Name: "+e.name);
		System.out.println("ID: "+e.id);
		System.out.println("Height: "+e.height);
		System.out.println("------------------------------");
	}	
}
}
