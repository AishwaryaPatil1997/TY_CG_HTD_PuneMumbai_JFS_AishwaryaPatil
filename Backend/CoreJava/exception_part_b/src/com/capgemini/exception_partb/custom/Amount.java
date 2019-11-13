package com.capgemini.exception_partb.custom;

public class Amount 
{
	void check(int val) throws InvalidLimitException
	{
		if (val > 40000)
		{
			throw new InvalidLimitException();
		}
	}
}
