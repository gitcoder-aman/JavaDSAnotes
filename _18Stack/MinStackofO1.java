package _18Stack;

import java.util.ArrayDeque;
import java.util.EmptyStackException;

public class MinStackofO1 {
	
	public static void main(String[] args) throws Exception{
		MinStackofO1 obj = new MinStackofO1();
		
		obj.push(5);
		obj.push(2);
		
		System.out.println("min "+ obj.min());
		System.out.println("Popped "+ obj.pop());
		System.out.println("min "+ obj.min());
		
		obj.push(9);
		obj.push(1);
		obj.push(6);
		
		System.out.println("min "+ obj.min());
		System.out.println("Popped "+ obj.pop());
		System.out.println("min "+ obj.min());
		
		
	}

	ArrayDeque<Integer>stack = new ArrayDeque<>();
	
	int min = 0;
	
	void push(int data) {
		
		//for first element
		if(stack.isEmpty()) {
			stack.push(data);
			min = data;
			return;
		}
		
		else {
			if(data < min) {
				
				stack.push(2 * data - min); 
				min = data;
			}
			else {
				stack.push(data);
			}
		}
	}
	
	int pop() throws Exception{
		
		if(stack.isEmpty()) throw new EmptyStackException();
	
		int curr = stack.peek();
		stack.pop();
		
		if(curr > min) {
			return curr;
		}
		else {
			int prevMin = min;
			int val = 2 * min - curr;
			min = val;
			return prevMin;
		}
	}
	
	int min() throws Exception{
		if(stack.isEmpty()) throw new Exception("Stack is Empty");
		return min;
	}
	
	int peek() throws Exception{
		
		if(stack.isEmpty()) throw new Exception("Stack is Empty");
		
		int curr = stack.peek();
		if(curr <= min) {
			return min;
		}
		else {
			return curr;
		}
	}
}
