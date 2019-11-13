package com.capgemini.exception.first;

public class ArrayExample 
{
	public static void main(String[] args) 
	{
		System.out.println("Main started...");

		int a[] = new int[3];

		try 
		{
			System.out.println(a[7]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Don't cross the boundary of array");
		}

		System.out.println("Main ended...");
	}
}
