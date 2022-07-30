//Write a java program to insert and display the elements inside the linked hashmap

package assignment1705;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
	public static void main(String[] args) {

		LinkedHashMap<String, Integer> l = new LinkedHashMap<>();

		l.put("Cocal Cola", 90);
		l.put("Thumps Up", 92);
		l.put("Maaza", 120);
		l.put("Mountain Dew", 70);
		l.put("Sprit", 85);

		System.out.println(l);
		
		System.out.println(l.keySet());

		System.out.println("\n Key Set - " + l.keySet());
		System.out.println("\n Values - " + l.values());
		System.out.println("\n Key-Value -> " + l.entrySet());

	}

}
