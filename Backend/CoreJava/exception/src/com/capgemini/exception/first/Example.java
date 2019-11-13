package com.capgemini.exception.first;

public class Example 
{
	public static void main(String[] args) 
	{
		System.out.println("Main started...");

		try
		{
			System.out.println(10/0);
			System.out.println("Hi");
			System.out.println("Keep Smiling");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Don't divide by zero");
		}

		System.out.println("Main ended...");
	}
}
