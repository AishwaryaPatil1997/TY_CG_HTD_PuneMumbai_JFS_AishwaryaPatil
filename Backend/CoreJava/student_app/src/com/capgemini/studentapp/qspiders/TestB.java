package com.capgemini.studentapp.qspiders;

import com.capgemini.studentapp.jspiders.*;

public class TestB 
{
	public static void main(String[] args)
	{
		Selenium s1 = new Selenium();
		s1.teachSelenium();

		QTP q1 = new QTP();
		q1.teachQTP();

		React r1 = new React();
		r1.teachReact();

		Angular a1 = new Angular();
		a1.teachAngular();
	}
}
