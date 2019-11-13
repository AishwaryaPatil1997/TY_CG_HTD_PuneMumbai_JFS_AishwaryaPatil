package com.capg.corejava.methods;

public class MethodsExample 
{
	public static void main(String[] args) 
	{
       print();
       int a = areaOfSquare(6);
       System.out.println("Area of Square = "+a);
       
       MethodsExample me = new MethodsExample();
       System.out.println("Area of Rectangle = "+me.areaOfRec(5, 3));
	}

	public static void print() 
	{
       System.out.println("Print() method");
	}
	
	public static int areaOfSquare(int side)
	{
		int area = side * side;
		return area;
	}
	
	public int areaOfRec(int length, int width)
	{
		return length * width;
	}
}
