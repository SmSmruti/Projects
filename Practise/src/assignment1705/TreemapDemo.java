//Write a java program to implementmethods of treemap.

package assignment1705;

import java.util.TreeMap;

public class TreemapDemo {
	public static void main(String[] Args) {
		
		TreeMap<String, Integer> t= new TreeMap<>();
		
		t.put("Conway", 88);
		t.put("Ruturaj", 95);
		t.put("Moeen", 23);
		t.put("Ambati", 45);
		t.put("Dhoni", 35);
		
		System.out.println(t);
		
		//Descending Order...
		System.out.println("\n Desending Order : " +t.descendingMap());
		
		System.out.println("\n Head Map - "+ t.headMap("Moeen", true));
		
		System.out.println("\n Tail Map - "+ t.tailMap("Dhoni"));
	}
	

}
