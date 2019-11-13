package com.capgemini.exception.first;

public class PVR 
{
	void confirm()
	{
		System.out.println("Confirm started...");
		
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception caught at confirm in PVR");
			throw e;
		}
		
		finally
		{
		System.out.println("Confirm ended...");
		}
	}
}
