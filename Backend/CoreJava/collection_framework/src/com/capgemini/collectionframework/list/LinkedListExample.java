package com.capgemini.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample 
{
	public static void main(String[] args) 
	{
		LinkedList l1 = new LinkedList();

		l1.add(2.4);
		l1.add('M');
		l1.add("Samba");
		l1.add(3);
		
		System.out.println("------------FOR LOOP-----------");

		for (int i = 0; i < 4; i++) 
		{
			Object r = l1.get(i);
			System.out.println(r);
		}
		
		System.out.println("------------FOR EACH LOOP-----------");
		
		for (Object r : l1) 
		{
			System.out.println(r);
		}
		
		System.out.println("------------ITERATOR-----------");
		
		Iterator i1 = l1.iterator();
		
		while (i1.hasNext()) 
		{
			Object r = i1.next();
			System.out.println(r);
		}
		
		System.out.println("-----------ListIterator Forward------------");
		
		ListIterator l2 = l1.listIterator();
		
		while (l2.hasNext())
		{
			Object r = l2.next();
			System.out.println(r);
		}
		
		System.out.println("-----------ListIterator Backward------------");
		
		while (l2.hasPrevious())
		{
			Object r = l2.previous();
			System.out.println(r);
		}
	}
}
