import java.util.*;
public class AList {

	public static void main(String[] args) {
		
		ArrayList<Integer> a= new ArrayList<Integer>();
		
		a.add(789);
		a.add(678);
		a.add(321);
		a.add(123);
		System.out.println(a);
		
	    Collections.sort(a);
	    System.out.println(a);
	    
		
		System.out.println(a.size());

	}

}
