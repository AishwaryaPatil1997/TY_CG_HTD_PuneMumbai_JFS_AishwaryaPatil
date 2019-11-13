package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestStudent 
{
	public static void main(String[] args) 
	{
		ArrayList<Student> a1 = new ArrayList<Student>();

		Student s1 = new Student(1, "Divya", 78.25);
		Student s2 = new Student(2, "Dimple", 88.5);
		Student s3 = new Student(3, "Dinga", 70.75);
		Student s4 = new Student(4, "Samba", 85.15);
		Student s5 = new Student(5, "Tanya", 96.25);

		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		a1.add(s4);
		a1.add(s5);

		System.out.println("----------------FOR LOOP----------------");

		for (int i = 0; i < 5; i++) 
		{
			Student s = a1.get(i);
			System.out.println("Name: "+s.name);
			System.out.println("ID: "+s.id);
			System.out.println("Percentge: "+s.percentage);
			System.out.println("-------------------------------");
		}

		System.out.println("----------------FOR EACH LOOP----------------");

		for (Student s : a1) 
		{
			System.out.println("Name: "+s.name);
			System.out.println("ID: "+s.id);
			System.out.println("Percentge: "+s.percentage);
			System.out.println("-------------------------------");
		}

		System.out.println("----------------ITERATOR----------------");

		Iterator<Student> i1 = a1.iterator();

		while(i1.hasNext())
		{
			Student s = i1.next();

			System.out.println("Name: "+s.name);
			System.out.println("ID: "+s.id);
			System.out.println("Percentge: "+s.percentage);
			System.out.println("-------------------------------");
		}

		System.out.println("----------------ListIterator Forward----------------");

		ListIterator<Student> l1 = a1.listIterator();

		while(l1.hasNext())
		{
			Student s = l1.next();

			System.out.println("Name: "+s.name);
			System.out.println("ID: "+s.id);
			System.out.println("Percentge: "+s.percentage);
			System.out.println("-------------------------------");
		}

		System.out.println("----------------ListIterator Backward----------------");

		while(l1.hasPrevious())
		{
			Student s = l1.previous();

			System.out.println("Name: "+s.name);
			System.out.println("ID: "+s.id);
			System.out.println("Percentge: "+s.percentage);
			System.out.println("-------------------------------");
		}
	}
}
