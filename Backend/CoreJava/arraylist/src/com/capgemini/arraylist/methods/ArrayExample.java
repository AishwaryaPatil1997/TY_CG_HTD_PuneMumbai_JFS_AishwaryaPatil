package com.capgemini.arraylist.methods;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayExample 
{
	public static void main(String[] args) 
	{
		ArrayList a1= new ArrayList();

		a1.add('A');
		a1.add('E');
		a1.add('M');
		a1.add('D');

		System.out.println("Before: "+a1);
		
		Collections.shuffle(a1);
		
		System.out.println("After: "+a1);
	}
}
