package com.capgemini.studentproject;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Helper {

	Comparator<Student> c = (a,b) -> {
		Double x = a.percentage;
		Double y = b.percentage;
		
		return x.compareTo(y);
	};
	
	void displayTopper(ArrayList<Student> a)
	{
		Student r = a.stream().max(c).get();
			System.err.println("TOPPER OF THE CLASS\n");
			System.out.println("Name: "+r.name);
			System.out.println("ID: "+r.id);
			System.out.println("Percentage: "+r.percentage);
			System.out.println("Gender: "+r.gender);
			System.out.println("-----------------------------------");
	}
	
	void displayPassed(ArrayList<Student> a)
	{
		List<Student> li = a.stream().filter(i -> i.percentage>=35).collect(Collectors.toList());
		
		System.err.println("PASSED STUDENTS\n");
		
		for (Student s : li) {
			
			System.out.println("Name: "+s.name);
			System.out.println("ID: "+s.id);
			System.out.println("Percentage: "+s.percentage);
			System.out.println("Gender: "+s.gender);
			System.out.println("-----------------------------------");
		}
	}
	
	void displayFailed(ArrayList<Student> a)
	{
		List<Student> li = a.stream().filter(i -> i.percentage < 35).collect(Collectors.toList());
		
		System.err.println("FAILED STUDENTS\n");
		
		for (Student s : li) {
			
			System.out.println("Name: "+s.name);
			System.out.println("ID: "+s.id);
			System.out.println("Percentage: "+s.percentage);
			System.out.println("Gender: "+s.gender);
			System.out.println("-----------------------------------");
		}
	}
	
	void displayPassed(ArrayList<Student> a, char g)
	{
		List<Student> li = a.stream().filter(i -> (i.percentage>=35 && i.gender == g)).collect(Collectors.toList());
		
		System.err.println("PASSED STUDENTS"+"("+g+")\n");
		
		for (Student s : li) {
			
			System.out.println("Name: "+s.name);
			System.out.println("ID: "+s.id);
			System.out.println("Percentage: "+s.percentage);
			System.out.println("Gender: "+s.gender);
			System.out.println("-----------------------------------");
		}
	}
	
	void displayFailed(ArrayList<Student> a, char g)
	{
		List<Student> li = a.stream().filter(i -> (i.percentage < 35 && i.gender == g)).collect(Collectors.toList());
		
		System.err.println("FAILED STUDENTS"+"("+g+")\n");
		
		for (Student s : li) {
			
			System.out.println("Name: "+s.name);
			System.out.println("ID: "+s.id);
			System.out.println("Percentage: "+s.percentage);
			System.out.println("Gender: "+s.gender);
			System.out.println("-----------------------------------");
		}
	}
	
	void displayAll(ArrayList<Student> a)
	{
		System.err.println("STUDENTS LIST\n");
		
		for (Student s : a) 
		{
			System.out.println("Name: "+s.name);
			System.out.println("ID: "+s.id);
			System.out.println("Percentage: "+s.percentage);
			System.out.println("Gender: "+s.gender);
			System.out.println("-----------------------------------");
		}

	}
}
