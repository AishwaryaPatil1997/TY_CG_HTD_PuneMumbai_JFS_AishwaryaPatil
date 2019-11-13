package com.capgemini.studentproject;

import java.util.ArrayList;
import java.util.Comparator;

public class TestStudent {

	public static void main(String[] args) {
		
		ArrayList<Student> a = new ArrayList<Student>();
		
		Student s1 = new Student(1, "Samba", 'M', 98.32);
		Student s2 = new Student(2, "Dinga", 'M', 34.69);
		Student s3 = new Student(3, "Divya", 'F', 95.24);
		Student s4 = new Student(4, "Sambi", 'F', 26.45);
		Student s5 = new Student(5, "Dingi", 'F', 84.56);
		Student s6 = new Student(6, "Anil", 'M', 75.21);
		Student s7 = new Student(7, "Bunga", 'M', 65.21);
		Student s8 = new Student(8, "Bungi", 'F', 33.22);
		
		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		a.add(s5);
		a.add(s6);
		a.add(s7);
		a.add(s8);
		
		Helper h = new Helper();
		h.displayAll(a);
		h.displayPassed(a);
		h.displayFailed(a);
		h.displayPassed(a, 'F');
		h.displayPassed(a, 'M');
		h.displayFailed(a, 'F');
		h.displayFailed(a, 'M');
		h.displayTopper(a);
	}
}
