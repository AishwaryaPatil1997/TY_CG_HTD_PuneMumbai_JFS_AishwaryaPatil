package com.capgemini.bean;

public class TestBus 
{
	public static void main(String[] args) 
	{
		Bus b1 = new Bus("Red Bus", 5);

		System.out.println("Name: "+b1.getName());
		System.out.println("Seats: "+b1.getSeats());
	}
}
