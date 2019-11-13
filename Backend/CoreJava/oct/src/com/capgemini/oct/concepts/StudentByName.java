package com.capgemini.oct.concepts;

import java.util.Comparator;

public class StudentByName implements Comparator<StudentBean>
{

	@Override
	public int compare(StudentBean a1, StudentBean a2) 
	{
		return a1.getName().compareTo(a2.getName());
	}

}
