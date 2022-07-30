import java.util.*;
public class LListExample {

	public static void main(String[] args) {
		LinkedList<String> l= new LinkedList<String>();
		
		l.addFirst("Aman");
		l.addFirst("Amit");
		System.out.println(l);
		
		l.add("Rama");
		l.add("Rima");
		System.out.println(l);
		
		l.add(2,"Bubu");
		l.add(3,"Babu");
		System.out.println(l);
		
		l.remove();
		l.remove();
		System.out.println(l);
		
		System.out.println(l.size());
	    

	}

}
