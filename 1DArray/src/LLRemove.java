import java.util.*;
public class LLRemove {

	public static void main(String[] args) {
		
		LinkedList<String> a= new LinkedList<String>();
		
		a.add("Steve");
		a.add("Warner");
		a.add("Conway");
		a.add("Jhonny");
		a.add("Axar");
		System.out.println(a);
		
		a.remove();
		a.remove();
		System.out.println(a);
		
		 Iterator<String> iterator=a.iterator();
	     while(iterator.hasNext()){
	       System.out.println(iterator.next());
	     }
	     
	     a.remove(1);
	     System.out.println(a);
	     
	     Iterator<String> iterator1=a.iterator();
	      while(iterator1.hasNext()){
	         System.out.println(iterator1.next()+" ");
	     
	      }	

	}

}
