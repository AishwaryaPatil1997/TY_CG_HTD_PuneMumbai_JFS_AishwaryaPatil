package com.capgemini.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ExampleKV {

	public static void main(String[] args) {

		LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();

		hm.put("Ondhu", 1);
		hm.put("Idhu", 5);
		hm.put("Hathu", 10);
		hm.put("Eredu", 2);

		System.out.println("----------KEYS----------");

		Set<String> s = hm.keySet();
		for (String r : s) {
			System.out.println(r);
		}

		System.out.println("----------Values----------");

		Collection<Integer> c = hm.values();
		for (Integer i : c) {
			System.out.println(i);
		}
	}
}
