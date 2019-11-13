package com.capgemini.array.generic;

import java.util.Scanner;

public class ScannerExample 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the name: ");
		String name = scan.next();

		System.out.println("Enter the age: ");
		int age = scan.nextInt();

		System.out.println("Enter the height: ");
		double height = scan.nextDouble();

		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Height: "+height);
		
		scan.close();
	}
}
