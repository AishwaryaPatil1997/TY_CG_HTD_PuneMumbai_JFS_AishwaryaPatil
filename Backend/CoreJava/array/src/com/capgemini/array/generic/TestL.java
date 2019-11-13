package com.capgemini.array.generic;

interface Square
{
	int sqr (int a);
}

public class TestL 
{
	public static void main(String[] args) 
	{
		Square s = a -> a*a;

		int b = s.sqr(4);

		System.out.println(b);
	}
}
