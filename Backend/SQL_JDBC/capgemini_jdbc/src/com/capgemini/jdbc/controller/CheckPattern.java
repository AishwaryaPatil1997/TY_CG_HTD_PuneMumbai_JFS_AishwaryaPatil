package com.capgemini.jdbc.controller;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.jdbc.dao.UserDAO;
import com.capgemini.jdbc.factory.UserFactory;

public class CheckPattern {

public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		UserDAO dao = UserFactory.getInstance();
		
		Pattern pat = Pattern.compile("\\w+\\@\\w+\\.\\w+");
		System.out.println("Enter EMAIL: ");
		Matcher mat = pat.matcher(scan.nextLine());
		boolean user = mat.matches();
		
		if(user == true)
		{
			System.out.println(user);
		}
		else
		{
			System.out.println("Something went wrong...");
		}
		
		scan.close();
	}
}
