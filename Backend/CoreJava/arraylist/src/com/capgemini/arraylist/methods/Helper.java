package com.capgemini.arraylist.methods;

import java.util.ArrayList;
import java.util.Iterator;

public class Helper 
{
	void display(ArrayList<Student> k)
	{
		for (Student s : k) 
		{
			System.out.println("Name: "+s.name);
			System.out.println("ID: "+s.id);
			System.out.println("Percentage: "+s.percentage);
			System.out.println("----------------------------");
		}
	}
	
	void onlyPass(ArrayList<Student> n)
	{
		Iterator<Student> i1 = n.iterator();
		System.out.println("Students getting percentage more than 35%");
		while(i1.hasNext())
		{
			Student m = i1.next();
			
			if(m.percentage>=35)
			{
				System.out.println("Name: "+m.name);
				System.out.println("ID: "+m.id);
				System.out.println("Percentage: "+m.percentage);
				System.out.println("----------------------------");
			}
		}
	}
	
	void distinction(ArrayList<Student> b)
	{
		Iterator<Student> i2 = b.iterator();
		System.out.println("Students getting percentage more than 75%");
		while(i2.hasNext())
		{
			Student m = i2.next();
			
			if(m.percentage>=75)
			{
				System.out.println("Name: "+m.name);
				System.out.println("ID: "+m.id);
				System.out.println("Percentage: "+m.percentage);
				System.out.println("----------------------------");
			}
		}
	}
	
}
