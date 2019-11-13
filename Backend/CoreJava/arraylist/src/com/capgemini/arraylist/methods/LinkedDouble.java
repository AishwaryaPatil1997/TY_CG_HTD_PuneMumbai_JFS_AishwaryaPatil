package com.capgemini.arraylist.methods;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedDouble 
{
	public static void main(String[] args) 
	{
		LinkedList<Double> l = new LinkedList<Double>();

		l.add(3.6);
		l.add(2.4);
		l.add(4.7);
		l.add(1.6);
		
		System.out.println("Before: "+l);
		
		Collections.sort(l);
		
		System.out.println("After: "+l);
	}
}
