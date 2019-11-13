package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDouble 
{
	public static void main(String[] args) 
	{
		ArrayList<Double> a1 = new ArrayList<Double>();

		a1.add(2.4);
		a1.add(9.6);
		a1.add(4.1);
		a1.add(3.2);
		
		System.out.println("------------FOR LOOP-----------");

		for (int i = 0; i < 4; i++) 
		{
			Double d = a1.get(i);
			System.out.println(d);
		}
		
		System.out.println("------------FOR EACH LOOP-----------");
		
		for (Double d1 : a1) 
		{
			System.out.println(d1);
		}
		
		System.out.println("------------ITERATOR-----------");
		
		Iterator<Double> i1 = a1.iterator();
		
		while (i1.hasNext()) 
		{
			Double d2 = i1.next();
			System.out.println(d2);
		}
		
		System.out.println("-----------Forward------------");
		
		ListIterator<Double> l1 = a1.listIterator();
		
		while (l1.hasNext())
		{
			Double d3 = l1.next();
			System.out.println(d3);
		}
		
		System.out.println("-----------Backward------------");
		
		while (l1.hasPrevious())
		{
			Double d3 = l1.previous();
			System.out.println(d3);
		}
	}
}
