package com.capgemini.bean;

public class TestCar 
{
	public static void main(String[] args) 
	{
		Car c = new Car("Benz", 500000);

		System.out.println("Name: "+c.getName());
		System.out.println("Cost: "+c.getCost());
	}
}
