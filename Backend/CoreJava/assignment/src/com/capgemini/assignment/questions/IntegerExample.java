package com.capgemini.assignment.questions;

public class IntegerExample 
{
    int[] view()
    {
    	int a[] = {12,3,6,77};
    	
    	return a;
    }
    
    public static void main(String[] args) 
    {
    	IntegerExample i = new IntegerExample();
		int b[] = i.view();
		
		for (int j : b) 
		{
			System.out.println(j);
		}
	}
}
