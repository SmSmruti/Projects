import java.util.*;

public class StackExamples {

	public static void main(String[] args) {
		Stack<Integer> s=new Stack<Integer>();
		
		//Add Value to Stack(Push Operation)
		s.push(222);
		s.push(7);
		s.push(102);
		s.push(13);
		s.push(155);
		s.push(20);
		System.out.println(s);
		
		//(peek operation)
		System.out.println(s.peek());
		
		//(Pop Operation)
		s.pop();
		s.pop();
		s.pop();
		System.out.println(s);
		
		
		//(peek operation)
		System.out.println(s.peek());
		
       //(empty operation)
       boolean status= s.empty();
       System.out.println(status);



	}

}
