package com.capgemini.assignment.questions;

public class Test_StudentArray 
{
	public static void main(String[] args) 
	{
		StudentArray st[] = new StudentArray[4];

		StudentArray s1 = new StudentArray(1,"Samba", 89.25);
		StudentArray s2 = new StudentArray(2,"Dinga", 45.25);
		StudentArray s3 = new StudentArray(3,"Chinnu", 65.50);
		StudentArray s4 = new StudentArray(4,"Dimple", 52.80);

		st[0] = s1;
		st[1] = s2;
		st[2] = s3;
		st[3] = s4;
		
		receive(st);
	}

	static void receive(StudentArray a[])
	{
		for (StudentArray s1 : a) 
		{
			System.out.println(s1.id);
			System.out.println(s1.name);
			System.out.println(s1.percentage);
			System.out.println("------------------");
		}
	}
}
