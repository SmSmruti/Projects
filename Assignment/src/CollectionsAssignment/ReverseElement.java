//Write a Java program to reverse elements in a array list.

package CollectionsAssignment;
import java.util.*;

public class ReverseElement {

	public static void main(String[] args) {
		
		ArrayList<String> z = new ArrayList<String>();
		
		z.add("Dog");
		z.add("Cat");
		z.add("Bird");
		z.add("Fish");
		z.add("Lion");
		z.add("Tiger");
		
		System.out.println("\n Array Before Reversing : "+z);
		
		
		Collections.reverse(z);
		System.out.println("\n Array After Reversing : "+z);

	}

}
