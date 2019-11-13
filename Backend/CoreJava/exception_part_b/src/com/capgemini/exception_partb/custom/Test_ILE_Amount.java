package com.capgemini.exception_partb.custom;

public class Test_ILE_Amount 
{
	public static void main(String[] args) 
	{
		Amount a1 =  new Amount();

		try 
		{
			a1.check(20000);
			System.out.println("Collect Cash");
		} 
		catch (InvalidLimitException e) 
		{
			e.printStackTrace();
		}
	}
}
