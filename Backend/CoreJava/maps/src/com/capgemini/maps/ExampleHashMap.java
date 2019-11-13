package com.capgemini.maps;

import java.util.HashMap;
import java.util.Map;

public class ExampleHashMap {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

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
