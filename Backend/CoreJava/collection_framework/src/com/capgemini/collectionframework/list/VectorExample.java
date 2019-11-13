package com.capgemini.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorExample 
{
	public static void main(String[] args) 
	{
		Vector v = new Vector();

		v.add(9.6);
		v.add('M');
		v.add("Priya");
		v.add(2);

		System.out.println("----------------FOR LOOP----------------");

		for (int i = 0; i < 4; i++) 
		{
			Object r = v.get(i);
			System.out.println(r);
		}

		System.out.println("----------------FOR EACH LOOP----------------");

		for (Object r : v) 
		{
			System.out.println(r);
		}

		System.out.println("----------------ITERATOR----------------");

		Iterator i1 = v.iterator();

		while(i1.hasNext())
		{
			Object r = i1.next();
			System.out.println(r);
		}

		System.out.println("----------------ListIterator Forward----------------");

		ListIterator l1 = v.listIterator();

		while(l1.hasNext())
		{
			Object r = l1.next();
			System.out.println(r);
		}

		System.out.println("----------------ListIterator Backward----------------");

		while(l1.hasPrevious())
		{
			Object r = l1.previous();
			System.out.println(r);
		}
	}
}
