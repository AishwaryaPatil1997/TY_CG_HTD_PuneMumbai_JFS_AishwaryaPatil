package com.capgemini.exception_partb.custom;

public class Test_IAE_Validator 
{
	public static void main(String[] args) 
	{
		Validator v = new Validator();

		try 
		{
			v.verify(15);
			System.out.println("Welcome to pub");
		}
		catch(InvalidAgeException in)
		{
			System.out.println(in.getMessage());
		}
	}
}
