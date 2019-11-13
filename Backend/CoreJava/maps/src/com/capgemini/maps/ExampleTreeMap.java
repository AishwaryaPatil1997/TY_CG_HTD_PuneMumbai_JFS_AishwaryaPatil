package com.capgemini.maps;

import java.util.Map;
import java.util.TreeMap;

public class ExampleTreeMap {
 
	public static void main(String[] args) {

		TreeMap<String, Integer> hm = new TreeMap<String, Integer>();

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
