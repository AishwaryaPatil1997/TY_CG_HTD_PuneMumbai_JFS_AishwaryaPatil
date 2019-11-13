package com.capgemini.exception.first;

public class BMS 
{
	public static void main(String[] args) 
	{
		System.out.println("Main started...");

		PVR p1 = new PVR();

		try
		{
			p1.confirm();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception caught at main in BMS");
		}

		System.out.println("Main ended...");
	}
}
