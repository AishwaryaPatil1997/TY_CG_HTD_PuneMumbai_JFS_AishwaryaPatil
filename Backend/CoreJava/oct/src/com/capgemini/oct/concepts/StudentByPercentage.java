package com.capgemini.oct.concepts;

import java.util.Comparator;

public class StudentByPercentage implements Comparator<StudentBean>
{

	@Override
	public int compare(StudentBean a1, StudentBean a2) 
	{
		Double k = a1.getPercentage();
		Double t = a2.getPercentage();

		return k.compareTo(t);
	}

}
