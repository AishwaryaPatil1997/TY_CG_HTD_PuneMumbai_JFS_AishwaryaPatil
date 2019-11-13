package com.capgemini.stream.examples;

import java.util.Iterator;
import java.util.PriorityQueue;

public class ExamplePQ 
{
	public static void main(String[] args) 
	{
		PriorityQueue<Integer> p = new PriorityQueue<Integer>();

		p.add(10);
		p.add(6);
		p.add(4);
		p.add(9);

		Iterator<Integer> i1 = p.iterator();
		while (i1.hasNext()) {
			Integer a = i1.next();
			System.out.println(a);
		}
	}
}
