package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.beans.UserBean;
import com.capgemini.jdbc.dao.UserDAO;
import com.capgemini.jdbc.factory.UserFactory;

public class Login {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		UserDAO dao = UserFactory.getInstance();
		
		System.out.println("Enter USER ID and PASSWORD: ");
		UserBean user = dao.login(scan.nextInt(), scan.next());
		
		if(user != null)
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
