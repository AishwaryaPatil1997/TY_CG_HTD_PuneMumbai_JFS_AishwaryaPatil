package com.capgemini.array.generic;

interface Gm
{
	String view(String a);
}

public class TestN 
{
	public static void main(String[] args) 
	{
		Gm g1 = a -> a;

		String b = g1.view("Good Morning");

		System.out.println(b);
	}
}
