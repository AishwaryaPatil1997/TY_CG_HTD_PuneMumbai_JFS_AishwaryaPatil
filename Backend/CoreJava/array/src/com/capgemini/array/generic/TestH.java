package com.capgemini.array.generic;

public class TestH 
{
	static void receive(double a[])
	{
		for (double i : a) 
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) 
	{
		double m[] = {20,10,30,40};

		receive(m);
	}
}
