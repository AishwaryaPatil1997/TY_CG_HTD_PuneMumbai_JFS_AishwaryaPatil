package com.capgemini.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class StackExample 
{
	public static void main(String[] args) 
	{
		Stack s = new Stack();

		s.add(9.6);
		s.add('M');
		s.add("Priya");
		s.add(2);

		System.out.println("----------------FOR LOOP----------------");

		for (int i = 0; i < 4; i++) 
		{
			Object r = s.get(i);
			System.out.println(r);
		}

		System.out.println("----------------FOR EACH LOOP----------------");

		for (Object r : s) 
		{
			System.out.println(r);
		}

		System.out.println("----------------ITERATOR----------------");

		Iterator i1 = s.iterator();

		while(i1.hasNext())
		{
			Object r = i1.next();
			System.out.println(r);
		}

		System.out.println("----------------ListIterator Forward----------------");

		ListIterator l1 = s.listIterator();

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
