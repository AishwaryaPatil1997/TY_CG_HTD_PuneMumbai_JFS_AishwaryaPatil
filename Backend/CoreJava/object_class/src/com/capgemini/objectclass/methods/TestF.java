package com.capgemini.objectclass.methods;

public class TestF 
{
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Marker m = new Marker(1, "Camlin");

		System.out.println("Id is "+m.id);
		System.out.println("Name is "+m.name);

		Object r = m.clone();
		Marker k = (Marker)r;

		System.out.println("Id is "+k.id);
		System.out.println("Name is "+k.name);
	}
}
