package com.capgemini.exception_partb.custom;

public class InvalidLimitException extends Exception
{
	private String message = "Day limit is only 40000.0";

	@Override
	public String getMessage() 
	{
		return message;
	}
}
