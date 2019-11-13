package com.capgemini.assignment.questions;

public class DoubleExample 
{
	double[] view()
    {
		double a[] = {12.3,3.6,6.1,77.8};
    	
    	return a;
    }
    
    public static void main(String[] args) 
    {
    	DoubleExample d = new DoubleExample();
    	double b[] = d.view();
		
		for (double j : b) 
		{
			System.out.println(j);
		}
	}
}
