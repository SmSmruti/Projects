//Write a Java program to iterate through all elements in a array list.

package CollectionsAssignment;

import java.util.*;

public class IteratorExample {
	public static void main(String args[]) {
		
		ArrayList<Integer> z= new ArrayList<Integer>();
		
		z.add(2);
		z.add(4);
		z.add(6);
		z.add(8);
		z.add(9);
		System.out.println("ArrayList : "+z);
		
		Iterator<Integer> iterator = z.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next() );
		}
		
		
		
	}

}
