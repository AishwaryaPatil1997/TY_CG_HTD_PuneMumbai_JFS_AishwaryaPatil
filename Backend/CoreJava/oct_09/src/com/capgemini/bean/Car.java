package com.capgemini.bean;

public class Car 
{
	private String name;
	private int cost;

	public Car(String name, int cost) 
	{
		super();
		this.name = name;
		this.cost = cost;
	}

	public String getName() 
	{
		return name;
	}

	public int getCost() 
	{
		return cost;
	}
}
