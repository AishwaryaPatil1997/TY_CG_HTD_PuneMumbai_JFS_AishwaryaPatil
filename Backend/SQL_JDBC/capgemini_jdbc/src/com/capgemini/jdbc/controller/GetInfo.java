package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.beans.UserBean;
import com.capgemini.jdbc.dao.UserDAO;
import com.capgemini.jdbc.factory.UserFactory;

public class GetInfo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		UserDAO dao = UserFactory.getInstance();
		
		System.out.println("Enter the USER ID: ");
		UserBean user = dao.getInfo(scan.nextInt());
		
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
