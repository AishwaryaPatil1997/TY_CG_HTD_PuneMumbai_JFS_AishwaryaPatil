package com.capgemini.junit;

public class TestSchool {

	public static void main(String[] args) {

		Student s1 = new Student("Samba", 89.95, 'M');
		Student s2 = new Student("Sambi", 85.95, 'F');

		School school = new School();

		Student student1 = school.registerStudent(s1);
		Student student2 = school.registerStudent(s2);

		System.out.println("Student ID: " + student1.getId());
		System.out.println("Student Name: " + student1.getName());
		System.out.println();
		System.out.println("Student ID: " + student2.getId());
		System.out.println("Student Name: " + student2.getName());

	}
}
