package com.capgemini.exception.first;

public class TestException 
{
	public static void main(String[] args) 
	{
		System.out.println("Main started...");
		String k = null;
		int a[] = new int[3];

		try
		{
			System.out.println(k.length());
			System.out.println(a[5]);
			System.out.println(10/0);
		}
		catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}

		System.out.println("Main ended...");
	}
}
