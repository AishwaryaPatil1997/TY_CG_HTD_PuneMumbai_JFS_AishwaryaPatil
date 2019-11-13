package com.capgemini.array.generic;

public class Test_Student 
{
	public static void main(String[] args) 
	{
		Student st[] = new Student[4];

		Student s1 = new Student(1,"Divya", 89.25);
		Student s2 = new Student(2,"Raju", 45.25);
		Student s3 = new Student(3,"Chinnu", 65.50);
		Student s4 = new Student(4,"Dimple", 52.80);

		st[0] = s1;
		st[1] = s2;
		st[2] = s3;
		st[3] = s4;
		
		receive(st);
	}

	static void receive(Student a[])
	{
		for (Student student : a) 
		{
			System.out.println(student.id);
			System.out.println(student.name);
			System.out.println(student.percentage);
			System.out.println("------------------");
		}
	}
}
