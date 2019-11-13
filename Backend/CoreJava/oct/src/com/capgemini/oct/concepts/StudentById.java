package com.capgemini.oct.concepts;

import java.util.Comparator;

public class StudentById implements Comparator<StudentBean>
{

	@Override
	public int compare(StudentBean a1, StudentBean a2) 
	{
		Integer k = a1.getId();
		Integer t = a2.getId();

		return k.compareTo(t);
	}

}
