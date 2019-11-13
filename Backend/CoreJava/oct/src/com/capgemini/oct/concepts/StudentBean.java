package com.capgemini.oct.concepts;

import java.util.Comparator;

public class StudentBean
{
	private int id;
	private String name;
	private char gender;
	private double percentage;

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public char getGender() 
	{
		return gender;
	}

	public void setGender(char gender) 
	{
		this.gender = gender;
	}

	public double getPercentage() 
	{
		return percentage;
	}

	public void setPercentage(double percentage) 
	{
		this.percentage = percentage;
	}

}
