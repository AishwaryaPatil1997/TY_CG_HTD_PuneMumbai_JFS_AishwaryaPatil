package com.capgemini.array.generic;

public class TestI 
{
	static void receive(String a[])
	{
		for (String i : a) 
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) 
	{
		String m[] = {"Samba","Dinga","Bunga"};

		receive(m);
	}
}
