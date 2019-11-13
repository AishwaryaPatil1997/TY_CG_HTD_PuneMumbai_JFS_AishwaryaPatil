package com.capgemini.exception.first;

public class Example2 
{
	public static void main(String[] args) 
	{
		System.out.println("Main started...");

		String s = null;
		int a[] = new int[3];

		try 
		{
			System.out.println(s);
			System.out.println(a[1]);
			System.out.println(10/0);
		}
		catch(ArrayIndexOutOfBoundsException m)
		{
			System.out.println("Don't cross the boundary of array");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Don't divide by zero");
		}
		
		catch(Exception n)
		{
			System.out.println("Sorry!!! Something went wrong...");
		}

		System.out.println("Main ended...");
	}
}
