package com.capg.corejava.methods;

public class Test 
{
	public static void main(String[] args) 
	{
		Car car1 = new Car("Mustang GT", "Yellow", 4798435.5678);
		System.out.println(print(car1));
	}

	public static Car print(Car car)
	{
		return car;
	}
}
