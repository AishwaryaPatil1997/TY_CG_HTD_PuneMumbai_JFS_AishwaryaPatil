package com.capg.corejava.inheritance;

public class Son extends Father implements InterfaceExample
{
	String sname = "Robb";

	public static void main(String[] args) 
	{
		Son s1 = new Son();
		s1.printName();
		s1.display();
		s1.show();
	}

	@Override
	public void printName()
	{
		System.out.println(sname + " " + fname + " " + lastname);
		super.printName();
	}

	@Override
	public void display() 
	{
		System.out.println("Display method in Son");

	}

	@Override
	public void show() 
	{
		System.out.println("Show method in Son");

	}
}
