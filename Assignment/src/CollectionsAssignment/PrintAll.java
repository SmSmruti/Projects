//Write a Java program to print all the elements of a ArrayList using the position of the elements.

package CollectionsAssignment;
import java.util.*;

public class PrintAll {

	public static void main(String[] args) {
	
		ArrayList<String> x = new ArrayList<String>();
		
		x.add("Cricket");
		x.add("Volleyball");
		x.add("Hockey0");
		x.add("Carom");
		x.add("Football");
		System.out.println("\n Original ArrayList : "+x);
		System.out.println("\n Print using index of an element : ");
		
		int arrlength = x.size();
		for(int index = 0; index < arrlength; index++) {
		System.out.println(x.get(index));
		}
	}

}
