//Write a Java program to update specific array element by given element.

package CollectionsAssignment;
import java.util.*;

public class UpdateArray {

	public static void main(String[] args) {
		
		ArrayList<String> c = new ArrayList<String>();
		
		c.add("Faf Du Plesis");
		c.add("Dhoni");
		c.add("Raina");
		c.add("Ruturaj");
		c.add("Jadeja");
		c.add("Lord_Shardhul");
		
		System.out.println("Players of CSK 2021 : "+ c);
		
		c.set(0, "Devon Conway");
		c.set(2, "Moeen Ali");
		c.set(5, "Mukesh Choudhuy");
		
		System.out.println("--------------------------------");
		System.out.println("Player of CSK 2022 : "+ c);
		

	}

}
