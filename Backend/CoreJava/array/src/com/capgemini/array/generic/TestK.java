package com.capgemini.array.generic;

interface Sum
{
	int add (int a, int b);
}

public class TestK 
{
	public static void main(String[] args) 
	{
		Sum f = (a,b)-> a+b;

		int j = f.add(20, 40);

		System.out.println(j);
	}
}
