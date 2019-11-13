package com.capg.corejava.methods;

public class Car 
{
	String name;
	String color;
	double price;

	public Car(String name, String color, double price) 
	{
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	

	public Car() 
	{

	}



	public Car(double price, String name) 
	{
		this.name = name;
		this.price = price;
	}



	public Car(String name, double price) 
	{
		this.name = name;
		this.price = price;
	}



	@Override
	public String toString() 
	{
		return "Car [name=" + name + ", color=" + color + ", price=" + price + "]";
	}


}
