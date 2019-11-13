package com.capgemini.studentproject;

import java.util.function.Predicate;

public class TestPredicateStudent {

	public static void main(String[] args) {
		 
		Student s1 = new Student(1, "Samba", 'M', 23.52);
		
		Predicate<Student> p = s -> {
			
			if(s.percentage < 35)
			{
				return false;
			}
			else
			{
				return true;
			}
		};
		
		boolean res = p.test(s1);
		System.out.println("RESULT: "+res);
	}
}
