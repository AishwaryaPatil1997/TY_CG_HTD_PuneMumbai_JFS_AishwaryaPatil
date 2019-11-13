package com.capgemini.thread;

public class TestPen {

	public static void main(String[] args) {
		
		System.out.println("Main started...");
		
		Pen p = new Pen();
		p.start();
		
		Pen t = new Pen();
		t.start();
		
		try 
		{
			p.join();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		System.out.println("Main ended...");
	}
}
