//Write a Java program to retrieve an element (at a specified index) from a given array list

package CollectionsAssignment;

import java.util.*;

public class RetriveElement {

	public static void main(String[] args) {
		
		ArrayList<String> b = new ArrayList<String>();
		
		b.add("Red");
		b.add("Green");
		b.add("Orange");
		b.add("White");
		b.add("Black");
		
		System.out.println("Elements : " + b);
		
		//Retrive the first & third elememt
		String element = b.get(0);
		System.out.println("First Element : "+ b.get(0));
		System.out.println("Third Elemet : "+ b.get(2));
		
		

	}

}
