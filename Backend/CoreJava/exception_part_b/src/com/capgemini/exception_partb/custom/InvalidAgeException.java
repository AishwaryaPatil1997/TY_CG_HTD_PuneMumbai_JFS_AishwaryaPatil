package com.capgemini.exception_partb.custom;

public class InvalidAgeException extends RuntimeException
{
	private String message = "Invalid age to proceed";

	public String getMessage() 
	{
		return message;
	}
}
