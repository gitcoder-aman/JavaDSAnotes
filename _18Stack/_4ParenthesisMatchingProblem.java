package _18Stack;

import java.util.ArrayDeque;

public class _4ParenthesisMatchingProblem {

	static boolean validParenthesis(String str) {
		
		ArrayDeque<Character> stack = new ArrayDeque<>();
		
		for(int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
				continue;
			}
		if(stack.isEmpty()) return false;
		
			if(ch == '}') {
				if(stack.peek() != '{') return false;
				stack.pop();
			}
			else if(ch == ']') {
				if(stack.peek() != '[') return false;
				stack.pop();
			}
			else if(ch == ')') {
				if(stack.peek() != '(') return false;
				stack.pop();
			}
			
		}
		if(stack.isEmpty()) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {

		
		String str = "[({[]})]";
		
		System.out.println(validParenthesis(str));
	}

}
