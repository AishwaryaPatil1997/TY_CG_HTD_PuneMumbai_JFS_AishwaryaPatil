package com.capg.corejava.interfaces;

public interface InterfaceExample1 
{
	public void print();
	public void printNum();

	default void display()
	{
		System.out.println("Default method of Interface");
	}

	public static void show()
	{
		System.out.println("Static method of Interface");
	}
}
