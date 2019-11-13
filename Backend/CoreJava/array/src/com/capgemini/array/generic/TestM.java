package com.capgemini.array.generic;

interface Circle
{
	double area (double r);
}

public class TestM 
{
	public static void main(String[] args) 
	{
		Circle c = (r) -> 3.14*r*r;

		double b = c.area(5);

		System.out.println("Area of Circle is "+b);
	}
}
