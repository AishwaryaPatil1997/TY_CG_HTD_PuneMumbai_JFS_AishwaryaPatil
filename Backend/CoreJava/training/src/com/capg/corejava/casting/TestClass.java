package com.capg.corejava.casting;

public class TestClass 
{
	public static void main(String[] args) 
	{
		Pen p = new Marker(); //Up-casting

		Marker m = (Marker) p; //Down-casting

		m.cost = 100;
		m.write();
		m.size = 2.4;
		m.colour();
	}
}
