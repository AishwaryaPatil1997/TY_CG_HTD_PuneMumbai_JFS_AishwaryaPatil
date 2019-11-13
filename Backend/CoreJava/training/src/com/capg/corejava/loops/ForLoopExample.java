package com.capg.corejava.loops;

public class ForLoopExample 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 10; i++) 
		{
			if(i%2 == 0)
				System.out.println("i = " + i + "(even)");
			else
				System.out.println("i = " + i + "(odd)");
		}
	}
}
