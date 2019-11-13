package com.capgemini.studentproject;

import java.util.function.Consumer;

public class TestStuent {

	public static void main(String[] args) {

		Consumer<Student> c = (s)-> {
			System.out.println("Name: "+s.name);
			System.out.println("ID: "+s.id);
			System.out.println("Percentage: "+s.percentage);
		};

		Student s1 = new  Student(1, "Divya", 'F', 85.65);

		c.accept(s1);
	}
}
