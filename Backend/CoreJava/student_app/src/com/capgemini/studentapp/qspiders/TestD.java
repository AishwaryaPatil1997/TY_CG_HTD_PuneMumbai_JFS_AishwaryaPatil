package com.capgemini.studentapp.qspiders;

import static com.capgemini.studentapp.jspiders.Remote.*;

import com.capgemini.studentapp.jspiders.Remote;

public class TestD 
{
	public static void main(String[] args) 
	{
		on();
		System.out.println(sum);
		
		Remote r1 = new Remote();
		r1.off();
		System.out.println(r1.count);
	}
}
