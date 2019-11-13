package com.capgemini.collectionframework.list;

import java.util.ArrayList;

public class ArrayListExample5 
{
	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();

		a.add("Raju");
		a.add(19);
		a.add('M');
		a.add(6.14);

		for (Object r : a) 
		{
			System.out.println(r);
		}
	}
}
