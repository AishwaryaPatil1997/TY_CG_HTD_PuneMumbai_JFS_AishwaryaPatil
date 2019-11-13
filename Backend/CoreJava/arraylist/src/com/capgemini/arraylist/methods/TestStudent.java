package com.capgemini.arraylist.methods;

import java.util.ArrayList;

public class TestStudent 
{
	public static void main(String[] args) 
	{
		ArrayList<Student> a1 = new  ArrayList<Student>();

		Student s1 = new Student(1, "Divya", 78.25);
		Student s2 = new Student(2, "Dimple", 30.5);
		Student s3 = new Student(3, "Dinga", 70.75);
		Student s4 = new Student(4, "Samba", 32.15);

		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		a1.add(s4);
		
		Helper h = new Helper();
		h.display(a1);
		h.onlyPass(a1);
		h.distinction(a1);
	}
}
