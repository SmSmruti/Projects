// Write  a  java  program  toto  short  the  stringobjectsinside a linkedlistconsidering the first char of the stringsand display it.

package assignment1705;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] Args) {
		
		LinkedList<String> l = new LinkedList<>();
		
		l.add("Dog");
		l.add("Cat");
		l.add("Elephant");
		l.add("Lion");
		l.add("Tiger");
		
		System.out.println(l);
		
		Collections.sort(l);;
		System.out.println(l);
		
	}

}
