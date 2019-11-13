package com.capg.corejava.inheritance;

public class Daughter extends Father implements InterfaceExample
{
	String dname = "Sansa";

	public static void main(String[] args) 
	{
		Daughter d1 = new Daughter();
		d1.printName();
		d1.display();
		d1.show();
	}

	@Override
	public void printName()
	{
		System.out.println(dname + " " + fname + " " + lastname);
		super.printName();
	}

	@Override
	public void display() 
	{
		System.out.println("Display method in Daughter");

	}

	@Override
	public void show() 
	{
		System.out.println("Show method in Daughter");

	}
}
