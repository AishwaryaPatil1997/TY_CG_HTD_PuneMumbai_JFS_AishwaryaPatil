package com.capgemini.exception.first;

public class Test_IRCTC_Paytm 
{
	public static void main(String[] args) 
	{
		System.out.println("Main started...");

		Paytm p1 = new Paytm();

		try
		{
			p1.book();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception caught at main");
		}

		System.out.println("Main ended...");
	}
}
