import java.util.*;
public class LlAdd {

	public static void main(String[] args) {
		
		LinkedList<String> n= new LinkedList<String>();
		
		//Add elements to Linkedlist
		n.add("Raju");
		n.add("Sachin");
		n.add("Satya");
		System.out.println(n);
		
		//Add an element to First
		n.addFirst("Biswa");
		System.out.println(n);
		
		//Add element to Last
		n.addLast("Amit");
		System.out.println(n);
		
		//Add element to the 4rd position
		n.add(3,"Tapas");
		System.out.println(n);
		
		 Iterator<String> iterator=n.iterator();
	     while(iterator.hasNext()){
	       System.out.println(iterator.next());
	     }
		
		
		
	}

}
