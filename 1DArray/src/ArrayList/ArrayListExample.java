package ArrayList;

import java.util.*;

public class ArrayListExample{
	
	public static void main(String args[]) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		a.add(3);
		a.add(6);
		a.add(9);
		System.out.println("ArrayList = " + a);
		System.out.println("*****************************");
		
		//Adding Int at a specific location bt index
		a.add(2,15);
		a.add(1,20);
		System.out.println("After Addition A= " + a);
		
		//for removing the new Integer without mentioning index
		a.remove(new Integer(6));
		//removing by index
		a.remove(2);
		System.out.println("After Removal A= "+a);
		System.out.println("*****************************");
		
		//Creating new obj (b) & Adding all int of (a) in it...
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.addAll(a);
		System.out.println("A ="+ a);
		System.out.println("B ="+ b);
		System.out.println("*****************************");
		
		//for Adding many int at once in a List.....
		Collections.addAll(a,30,40,50);
		System.out.println("A =" +a);
		System.out.println("***********************************");
		
		//Removing (b) from (a) / [a-b].....
		a.removeAll(b);
		System.out.println("After RemoveAll A = "+ a);
		System.out.println("After RemoveAll B= "+ b);
		System.out.println("**********************************");
		
		//Clear All the elements / Remove all the elements...
		a.clear();
		Collections.addAll(a, 3,10,20,30,40,50);   //Again Adding many..
		System.out.println("A ="+ a);
		System.out.println("B =" + b); 
		System.out.println("************************************");
		
		System.out.println("Before RetainAll A =" + a);
		System.out.println("Before RetainAll B =" + b);
		System.out.println("**************************************");
		
		//Reatin All
		a.retainAll(b);
		System.out.println("After RetainAll A = " + a);
		System.out.println("After RetainAll B =" + b);
		System.out.println("**************************************");
		
		//Boolean
		boolean contains20= a.contains(20);
		System.out.println("Does A contains 20 ? " + contains20);
		System.out.println("Does A contains 3 ? " + a.contains(3));
		System.out.println("Does A contains 9 ?" + a.contains(9));
		System.out.println("**************************************");
		
		boolean containsAll=a.containsAll(b);
		System.out.println("Does a.containsAll(b) ?" + containsAll);
		System.out.println("**************************************");
		
		a.add(9);
		
		System.out.println("After Add : Does a.containsAll(b) ?" + a.containsAll(b));
		System.out.println("****************************************");
		
		
		
		
	}
}

