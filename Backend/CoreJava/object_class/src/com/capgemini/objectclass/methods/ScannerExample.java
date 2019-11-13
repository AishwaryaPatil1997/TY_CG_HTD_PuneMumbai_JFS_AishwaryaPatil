package com.capgemini.objectclass.methods;

import java.util.Scanner;

public class ScannerExample 
{
	public static void main(String[] args) 
	{
	   try(Scanner scan = new Scanner(System.in))
	   {
		   System.out.println("Enter the age: ");
		   int a = scan.nextInt();
		   
		   System.out.println("Age is "+a);
	   }
	}
}