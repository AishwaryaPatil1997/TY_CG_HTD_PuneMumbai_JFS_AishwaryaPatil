package com.capgemini.collectionframework.list;

import java.util.ArrayList;

public class ArrayListExample 
{
	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();

		a1.add(20);
		a1.add("Chinnu");
		a1.add(2.9);
		a1.add('F');
		
		System.out.println(a1.get(0));
		System.out.println(a1.get(1));
		System.out.println(a1.get(2));
		System.out.println(a1.get(3));
		
		System.out.println("-----------------------");

		for (int i = 0; i < 4; i++) 
		{
			Object r = a1.get(i);
			System.out.println(r);
		}
		
		System.out.println("-----------------------");
		
		for (Object r : a1) 
		{
			System.out.println(r);
		}
	}
}
