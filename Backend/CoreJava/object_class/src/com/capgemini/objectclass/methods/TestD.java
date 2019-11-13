package com.capgemini.objectclass.methods;

public class TestD 
{
	public static void main(String[] args) 
	{
		Cow c1 = new Cow();
		c1.id = 1;
		c1.name = "Ganga";
		c1.height = 5.6;

		Cow c2 = new Cow();
		c2.id = 2;
		c2.name = "Tunga";
		c2.height = 3.5;

		Cow c3 = new Cow();
		c3.id = 1;
		c3.name = "Ganga";
		c3.height = 5.6;
		
		System.out.println(c1.equals(c3));
	}
}
