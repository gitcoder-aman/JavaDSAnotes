package _20Queue;

import java.util.Stack;

public class _4ImpleQueueUsingTwoStack {

	static class MyQueue{
	     Stack<Integer>stack1 = new Stack<>();
	     Stack<Integer>stack2 = new Stack<>();
	    
	    void push(int data) {
	    	
	    	while(!stack1.isEmpty()) {
	    		
		        stack2.push(stack1.pop());
		    }

	    	stack1.push(data);
	    	
	    
	    }
	    
	    int pop() throws Exception{
	    	
	    	
	    	if(stack1.isEmpty()) throw new Exception("Stack1 is Empty");
	    	
	    	while(!stack2.isEmpty()) {
	    	   stack1.push(stack2.pop());
	    	}
	    	int peek = stack1.pop();
	    	
	    	return peek;
	   }
	}
	
	public static void main(String[] args) throws Exception{

		MyQueue q = new MyQueue();
		q.push(10);
		q.push(20);
		q.push(30);
		q.push(40);
	
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		
//		System.out.println(q.pop());
	}
	
}
