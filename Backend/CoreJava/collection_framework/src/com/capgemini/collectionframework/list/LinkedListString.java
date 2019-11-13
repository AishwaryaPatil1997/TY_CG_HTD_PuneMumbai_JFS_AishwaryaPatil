package com.capgemini.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListString 
{
public static void main(String[] args) 
{
	LinkedList<String> l1 = new LinkedList<String>();
	
	l1.add("Samba");
	l1.add("Dinga");
	l1.add("Divya");
	l1.add("Dimple");
	
	System.out.println("------------FOR LOOP-----------");

	for (int i = 0; i < 4; i++) 
	{
		String s = l1.get(i);
		System.out.println(s);
	}
	
	System.out.println("------------FOR EACH LOOP-----------");
	
	for (String s : l1) 
	{
		System.out.println(s);
	}
	
	System.out.println("------------ITERATOR-----------");
	
	Iterator<String> i1 = l1.iterator();
	
	while (i1.hasNext()) 
	{
		String s = i1.next();
		System.out.println(s);
	}
	
	System.out.println("-----------Forward------------");
	
	ListIterator<String> l = l1.listIterator();
	
	while (l.hasNext())
	{
		String s = l.next();
		System.out.println(s);
	}
	
	System.out.println("-----------Backward------------");
	
	while (l.hasPrevious())
	{
		String s = l.previous();
		System.out.println(s);
	}
}
}
