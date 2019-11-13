package com.capgemini.exception.first;

public class Paytm 
{
	void book()
	{
		System.out.println("Book started...");

		IRCTC i1 = new IRCTC();

		try
		{
			i1.confirm();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception caught at book");
		}

		System.out.println("Book ended...");
	}
}
