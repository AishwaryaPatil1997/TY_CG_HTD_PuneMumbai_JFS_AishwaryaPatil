package com.capg.corejava.cfs;

public class If_Else_If_Example 
{
	public static void main(String[] args) 
	{
        int marks = 45;
        
        if(marks>=75)
        {
        	System.out.println("Grade A");
        }
        else if(marks<=50 && marks>=25)
        {
        	System.out.println("Grade B");
        }
        else
        {
        	System.out.println("Failed");
        }
	}
}

