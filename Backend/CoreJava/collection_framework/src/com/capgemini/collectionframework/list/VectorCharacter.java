package com.capgemini.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorCharacter 
{
	public static void main(String[] args) 
	{
		Vector<Character> v = new Vector<Character>();

		v.add('A');
		v.add('P');
		v.add('P');
		v.add('L');
		v.add('E');

		System.out.println("----------------FOR LOOP----------------");

		for (int i = 0; i < 5; i++) 
		{
			Character c = v.get(i);
			System.out.println(c);
		}

		System.out.println("----------------FOR EACH LOOP----------------");

		for (Character c : v) 
		{
			System.out.println(c);
		}

		System.out.println("----------------ITERATOR----------------");

		Iterator<Character> i1 = v.iterator();

		while(i1.hasNext())
		{
			Character c = i1.next();
			System.out.println(c);
		}

		System.out.println("----------------ListIterator Forward----------------");

		ListIterator<Character> l1 = v.listIterator();

		while(l1.hasNext())
		{
			Character c = l1.next();
			System.out.println(c);
		}

		System.out.println("----------------ListIterator Backward----------------");

		while(l1.hasPrevious())
		{
			Character c = l1.previous();
			System.out.println(c);
		}
	}
}
