package com.capgemini.studentproject;

import java.util.function.Function;

public class TestStudentFunction {

	public static void main(String[] args) {

		Function<Integer, Student> f = i -> {
			Student s = new Student();
			s.id = i;
			return s;
		};

		Student s = f.apply(10);

		System.out.println("Name: "+s.name);
		System.out.println("ID: "+s.id);
		System.out.println("Percentage: "+s.percentage);
	}
}
