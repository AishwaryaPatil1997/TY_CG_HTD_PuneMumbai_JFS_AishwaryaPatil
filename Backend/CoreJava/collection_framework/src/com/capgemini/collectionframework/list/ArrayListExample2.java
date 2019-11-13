package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample2 
{
	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();

		a1.add(20);
		a1.add("Chinnu");
		a1.add(2.9);
		a1.add('F');

		Iterator it = a1.iterator();

		while (it.hasNext()) 
		{
			Object r = it.next();
			System.out.println(r);
		}	
	}
}
