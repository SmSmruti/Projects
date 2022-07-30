package onlineVideo3;

import java.util.Stack;

public class Indexfound {

	public static void main(String[] args) {
		Stack <Integer> s1= new Stack<>();
		
		s1.push(7);
		s1.push(8);
		s1.push(9);
		s1.push(2);
		System.out.println(s1);
		
		int indexfound = s1.search(8);
		System.out.println(indexfound);
	
	     

	}

}
