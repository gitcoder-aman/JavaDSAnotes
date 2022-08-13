package _18Stack;

import java.util.ArrayDeque;
import java.util.Stack;

public class _3UsingLibraryStack {

	public static void main(String[] args) {

//		Stack<Integer>stack = new Stack<>();
		ArrayDeque<Integer>stack = new ArrayDeque<>(); //Recommended
		
		stack.push(2);
		stack.push(4);
	    stack.push(1);
	    stack.push(8);
	    
	    System.out.println("Size of stack after push Elements "+stack.size());
	    
	    System.out.println("Peek Element "+ stack.peek());
	  
	    System.out.println(stack.pop());
	    System.out.println(stack.pop());
	    System.out.println(stack.pop());
	    System.out.println(stack.pop());
	    
	    System.out.println("Size of stack after pop Elements "+stack.size());
	}

}
