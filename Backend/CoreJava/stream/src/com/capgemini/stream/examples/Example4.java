package com.capgemini.stream.examples;

import java.util.ArrayList;
import java.util.Comparator;

public class Example4 {

	public static void main(String[] args) {

		ArrayList<Integer> a1 = new ArrayList<Integer>();

		a1.add(5);
		a1.add(10);
		a1.add(6);
		a1.add(3);
		a1.add(4);

		Comparator<Integer> c = (i,j) -> i.compareTo(j);

		Integer small = a1.stream().min(c).get();
		System.out.println("Smallest: "+small);

		Integer large = a1.stream().max(c).get();
		System.out.println("Largest: "+large);
	}
}
