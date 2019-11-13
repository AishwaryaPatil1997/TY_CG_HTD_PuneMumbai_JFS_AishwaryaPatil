package com.capgemini.maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class TestStudent {

	public static void main(String[] args) {

		ArrayList<Student> a1 = new ArrayList<Student>();

		Student s1 = new Student(1, "Samba", 45.62);
		Student s2 = new Student(2, "Dinga", 58.63);
		Student s3 = new Student(3, "Bungi", 98.32);

		a1.add(s1);
		a1.add(s2);
		a1.add(s3);

		ArrayList<Student> a2 = new ArrayList<Student>();

		Student s4 = new Student(4, "Divya", 78.56);
		Student s5 = new Student(5, "Anil", 25.36);

		a2.add(s4);
		a2.add(s5);

		ArrayList<Student> a3 = new ArrayList<Student>();

		Student s6 = new Student(6, "Sambi", 89.21);
		Student s7 = new Student(7, "Raju", 65.47);
		Student s8 = new Student(8, "Bunga", 85.21);
		Student s9 = new Student(9, "Kavya", 75.65);

		a3.add(s6);
		a3.add(s7);
		a3.add(s8);
		a3.add(s9);

		LinkedHashMap<String, ArrayList<Student>> lhm = new LinkedHashMap<String, ArrayList<Student>>();

		lhm.put("First", a1);
		lhm.put("Second", a2);
		lhm.put("Third", a3);
		
		ArrayList<Student> a =  lhm.get("First");
		Iterator<Student> it = a.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println("Name: "+s.name);
			System.out.println("ID: "+s.id);
			System.out.println("Percenatge: "+s.percentage);
			System.out.println("----------------------------------");
		}


	}
}
