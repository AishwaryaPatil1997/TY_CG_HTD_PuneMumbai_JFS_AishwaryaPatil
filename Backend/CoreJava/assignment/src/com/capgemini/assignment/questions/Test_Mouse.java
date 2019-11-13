package com.capgemini.assignment.questions;

public class Test_Mouse 
{
	public static void main(String[] args) 
	{
		Mouse m1 = new Mouse();
		
		double t[] = {10.22,20.44,30.33,40.55};
		m1.walk(t);
		
		System.out.println("---------------------");
		
		int r[] = {50,80,90,70};
		m1.run(r);
		
		
	}
}
