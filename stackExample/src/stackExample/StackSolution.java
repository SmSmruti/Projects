package stackExample;

import java.util.Stack;

public class StackSolution {

	public static void main(String[] args) {
		//created a stack
		Stack<Integer> s1=new Stack<>();
		
		//inserting element into stack
		s1.push(3);
		s1.push(4);
		s1.push(6);
		System.out.println(s1);
		
		//delete operation on stack
		//s1.pop();
		//System.out.println(s1);
		//delete operation on stack
		//s1.pop();
		//System.out.println(s1);
		
		//peek operation
		//s1.peek();
		
		System.out.println(s1.peek());
		//s1.pop();
		//s1.pop();
		boolean status = s1.empty();
		System.out.println(status);
		

	}

}
