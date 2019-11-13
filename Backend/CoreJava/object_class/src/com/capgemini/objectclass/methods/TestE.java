package com.capgemini.objectclass.methods;

public class TestE 
{
	public static void main(String[] args) 
	{
		Product p1 = new Product(1, "Laptop", "CORE i3", 45000.0, "Dell");
		Product p2 = new Product(2, "Laptop", "CORE i5", 50000.0, "Dell");
		Product p3 = new Product(1, "Laptop", "CORE i3", 45000.0, "Dell");

		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
	}
}
