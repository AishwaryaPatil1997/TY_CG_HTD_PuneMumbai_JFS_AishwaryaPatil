package com.capg.corejava.interfaces;

public class InterfaceExampleImplementation implements InterfaceExample1
{

	@Override
	public void print() 
	{
		System.out.println("Implemented print method of Interface");

	}

	//	@Override
	//	public static void show()
	//	{
	//		System.out.println("Static method of Interface");
	//	}

	@Override
	public void display()
	{
		System.out.println("Implemented display method of Interface");
	}

	public static void main(String[] args) 
	{
		InterfaceExample1 ie1 = new InterfaceExampleImplementation();
		ie1.display();
		ie1.print();
		ie1.printNum();
		InterfaceExample1.show();
	}

	@Override
	public void printNum() 
	{
		System.out.println("12345");

	}

}
