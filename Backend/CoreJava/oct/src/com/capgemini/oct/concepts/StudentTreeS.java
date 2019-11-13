package com.capgemini.oct.concepts;

import java.util.TreeSet;

public class StudentTreeS 
{
	public static void main(String[] args) 
	{
		StudentById sbi = new StudentById();
		StudentByName sbn = new StudentByName();
		StudentByPercentage sbp = new StudentByPercentage();
		
		TreeSet<StudentBean> ts = new TreeSet<StudentBean>(sbi);

		StudentBean sb1 = new StudentBean();
		sb1.setName("Anil");
		sb1.setId(1);
		sb1.setPercentage(56.25);
		sb1.setGender('M');

		StudentBean sb2 = new StudentBean();
		sb2.setName("Divya");
		sb2.setId(2);
		sb2.setPercentage(58.36);
		sb2.setGender('F');

		StudentBean sb3 = new StudentBean();
		sb3.setName("Kavya");
		sb3.setId(4);
		sb3.setPercentage(96.35);
		sb3.setGender('F');

		StudentBean sb4 = new StudentBean();
		sb4.setName("Samba");
		sb4.setId(5);
		sb4.setPercentage(85.21);
		sb4.setGender('M');

		StudentBean sb5 = new StudentBean();
		sb5.setName("Dinga");
		sb5.setId(3);
		sb5.setPercentage(65.45);
		sb5.setGender('M');
		
		ts.add(sb1);
		ts.add(sb2);
		ts.add(sb3);
		ts.add(sb4);
		ts.add(sb5);
		
		for (StudentBean s : ts) 
		{
			System.out.println("Name: "+s.getName());
			System.out.println("ID: "+s.getId());
			System.out.println("Gender: "+s.getGender());
			System.out.println("Percentage: "+s.getPercentage());
			System.out.println("----------------------------------");
		}
	}
}
