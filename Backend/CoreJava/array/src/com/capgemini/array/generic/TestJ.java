package com.capgemini.array.generic;

public class TestJ 
{
	public static void main(String[] args) 
	{
		int i[] = chinnu();

		for (int j : i) 
		{
			System.out.println(j);
		}

	}

	static int[] chinnu()
	{
		int a[] = {22,33,44,55};
		return a;
	}
}
