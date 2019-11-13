package com.capgemini.regex.concepts;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternConcepts 
{
	static Pattern pattern;
	static Matcher matcher;

	public static void main(String[] args) 
	{
		pattern = Pattern.compile("\\d");  //For single digit to match
		matcher = pattern.matcher("1");
		System.out.println("pattern \\d: "+ matcher.matches());
		System.out.println();
		
		pattern = Pattern.compile("\\d+");	//For one or more than one digit to match
		matcher = pattern.matcher("123456");
		System.out.println("pattern \\d+: "+ matcher.matches());
		System.out.println();
		
		pattern = Pattern.compile("\\d{10}");	//For specific digits to match
		matcher = pattern.matcher("1234567890");
		System.out.println("pattern \\d{10}: "+ matcher.matches());
		System.out.println();
		
		pattern = Pattern.compile("\\d{1,10}");	
		matcher = pattern.matcher("1234567890");
		System.out.println("pattern \\d{1,10}: "+ matcher.matches());
		System.out.println();
		
		pattern = Pattern.compile("\\d{0}");	
		matcher = pattern.matcher("");
		System.out.println("pattern \\d{0}: "+ matcher.matches());
		System.out.println();
		
		pattern = Pattern.compile("\\d{1,9}");	
		matcher = pattern.matcher("12345");
		System.out.println("pattern \\d{1,9}: "+ matcher.matches());
		System.out.println();
		
		pattern = Pattern.compile("\\D");
		matcher = pattern.matcher("A");
		System.out.println("pattern \\D: "+ matcher.matches());
		System.out.println();
		
		pattern = Pattern.compile("\\D+");
		matcher = pattern.matcher("ABcd&*");
		System.out.println("pattern \\D+: "+ matcher.matches());
		System.out.println();
		
		pattern = Pattern.compile("\\s");
		matcher = pattern.matcher(" ");
		System.out.println("pattern \\s: "+ matcher.matches());
		System.out.println();
		
		pattern = Pattern.compile("\\s+");
		matcher = pattern.matcher("      ");
		System.out.println("pattern \\s+: "+ matcher.matches());
		System.out.println();
		
		pattern = Pattern.compile("\\S");
		matcher = pattern.matcher(" ");
		System.out.println("pattern \\S: "+ matcher.matches());
		System.out.println();
		
		pattern = Pattern.compile("\\S+");
		matcher = pattern.matcher("123as@#");
		System.out.println("pattern \\S+: "+ matcher.matches());
		System.out.println();
		
		pattern = Pattern.compile("\\w");
		matcher = pattern.matcher("M");
		System.out.println("pattern \\w: "+ matcher.matches());
		System.out.println();
		
		pattern = Pattern.compile("\\w+");
		matcher = pattern.matcher("ABcd566887");
		System.out.println("pattern \\w+: "+ matcher.matches());
		System.out.println();
		
		pattern = Pattern.compile("\\W");
		matcher = pattern.matcher("@");
		System.out.println("pattern \\W: "+ matcher.matches());
		System.out.println();
		
		pattern = Pattern.compile("\\W+");
		matcher = pattern.matcher("*&@#");
		System.out.println("pattern \\W+: "+ matcher.matches());
		System.out.println();
	}
}
