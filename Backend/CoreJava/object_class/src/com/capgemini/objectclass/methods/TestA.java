package com.capgemini.objectclass.methods;

public class TestA 
{
	public static void main(String[] args) 
	{
		Pen p = new Pen();
		int add = p.hashCode();
		
		Pen d = new Pen();

		System.out.println("Address is: "+add);
		System.out.println("Address is: "+d);
	}
}
