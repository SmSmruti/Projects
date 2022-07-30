package stackExample;

import java.util.Stack;

public class StackSolution2 {

	public static void main(String[] args) {
		
		Stack <Integer> s1 = new Stack<>();
		s1.push(2);
		s1.push(4);
		s1.push(5);
		
		System.out.println(s1);
		
		s1.pop();
		System.out.println(s1);

	}

}
