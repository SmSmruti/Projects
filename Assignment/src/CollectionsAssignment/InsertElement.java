//Write a Java program to insert an element into the array list at the first position.

package CollectionsAssignment;
import java.util.*;

public class InsertElement {

	public static void main(String[] args) {
		
		ArrayList<String> x = new ArrayList<String>();
		
		x.add("Pink");
		x.add("Brown");
		x.add("Red");
		x.add("Green");
		x.add("White");
		x.add("Blue");
		System.out.println("ArrayList : "+ x);
		
		x.add(0, "Yellow");
		x.add(4, "Violet");
		
		System.out.println("Adding Elements : "+ x);
		

	}

}
