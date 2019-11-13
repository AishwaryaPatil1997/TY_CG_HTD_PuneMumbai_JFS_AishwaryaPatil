package com.capgemini.exception.first;

public class ArithmeticExample 
{
	public static void main(String[] args) 
	{
		System.out.println("Main started...");

		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException a)
		{
			System.out.println("Don't divide by zero");
		}

		System.out.println("Main ended...");
	}
}
