package _18Stack;

import java.util.ArrayDeque;

//Time Complexity = O(1)
//Space Complexity = O(n)
public class MinStackOofN {

	ArrayDeque<Integer>stack = new ArrayDeque<>();
	ArrayDeque<Integer>minStack = new ArrayDeque<>();
	
	void push(int e) {
		
		stack.push(e);
		
		if(minStack.isEmpty()) {
			minStack.push(e);
			return;
		}
		if(e <= minStack.peek()) {
			minStack.push(e);
		}
	}
	int pop()throws Exception {
		
		if(stack.isEmpty()) throw new Exception("Stack is Empty");
		int ans = stack.pop();
		
		if(ans == minStack.peek()) {
			minStack.pop();
		}
		return ans;
	}
	int min() throws Exception{
		if(stack.isEmpty()) throw new Exception("Stack is Empty");
		return minStack.peek();
	}

}
