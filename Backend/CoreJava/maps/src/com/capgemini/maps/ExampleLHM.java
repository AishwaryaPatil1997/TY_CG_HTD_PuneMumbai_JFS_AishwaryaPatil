package com.capgemini.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExampleLHM {

	public static void main(String[] args) {

		LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();

		hm.put("Ondhu", 1);
		hm.put("Idhu", 5);
		hm.put("Hathu", 10);
		hm.put("Eredu", 2);

		for (Map.Entry<String, Integer> r : hm.entrySet()) {
			String s = r.getKey();
			Integer i = r.getValue();

			System.out.println("Key: "+s);
			System.out.println("Value: "+i);
			System.out.println("--------------------------");
		}
	}
}
