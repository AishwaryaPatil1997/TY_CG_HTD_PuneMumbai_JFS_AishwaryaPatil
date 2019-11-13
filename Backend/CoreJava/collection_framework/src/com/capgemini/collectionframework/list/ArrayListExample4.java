package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample4 
{
	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();

		a1.add("Priya");
		a1.add(2);
		a1.add('F');
		a1.add(5.6);

		Iterator i1 = a1.iterator();

		while(i1.hasNext())
		{
			Object r = i1.next();
			System.out.println(r);
		}
	}
}
