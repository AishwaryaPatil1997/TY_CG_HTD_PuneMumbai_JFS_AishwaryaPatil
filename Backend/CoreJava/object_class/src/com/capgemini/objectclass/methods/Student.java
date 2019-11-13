package com.capgemini.objectclass.methods;

public class Student 
{
	int id;
	String name;
	double percentage;

	public Student(int id, String name, double percentage) 
	{
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}

	public String toString()
	{
		return "Name: "+name +" , Id: "+id +" , Percentage: "+percentage;
	}
}
