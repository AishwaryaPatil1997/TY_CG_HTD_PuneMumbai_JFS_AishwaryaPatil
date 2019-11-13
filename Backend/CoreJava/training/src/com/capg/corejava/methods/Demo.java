package com.capg.corejava.methods;

public class Demo 
{
	static MethodsExample me1 = new MethodsExample();
	public static void main(String[] args) 
	{
		MethodsExample me2 = new MethodsExample();
		System.out.println(me1);
		System.out.println(me2);
		
		System.out.println(MethodsExample.areaOfSquare(5));
		System.out.println(me2.areaOfRec(4,2));
	}
}
