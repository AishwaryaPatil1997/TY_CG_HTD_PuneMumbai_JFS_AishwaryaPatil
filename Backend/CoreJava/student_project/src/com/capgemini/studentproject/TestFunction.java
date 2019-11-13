package com.capgemini.studentproject;

import java.util.function.Function;

public class TestFunction {

	public static void main(String[] args) {
		
		Function<Integer, Integer> f = i -> i * i;
		
		int ans = f.apply(5);
		System.out.println("RESULT: "+ans);
	}
}
