package com.capgemini.exception_partb.custom;

public class Validator 
{
	void verify(int age)
	{
		if(age<18)
		{
			throw new InvalidAgeException();
		}
	}
}
