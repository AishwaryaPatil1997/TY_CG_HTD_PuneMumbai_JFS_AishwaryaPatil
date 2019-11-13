package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListExample3 
{
	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();

		a1.add(20);
		a1.add("Chinnu");
		a1.add(2.9);
		a1.add('F');

		ListIterator m = a1.listIterator();

		while (m.hasNext()) 
		{
			Object r = m.next();
			System.out.println(r);
		}
		
		System.out.println("----------------------------");
		
		while (m.hasPrevious()) 
		{
			Object r = m.previous();
			System.out.println(r);
		}
		
		System.out.println("----------------------------");
		
		System.out.println(a1);
	}
}
