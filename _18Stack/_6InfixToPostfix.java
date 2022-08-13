package _18Stack;

import java.util.ArrayDeque;


public class _6InfixToPostfix {

	static boolean isOperator(char c) {
		return c == '+' || c == '-' || c == '*' || c == '/';
	}
	static int precedence(char c) {
		
		if(c == '+' || c == '-') return 1;
		else if(c == '*' || c == '/')return 2;
		else return -1;
	}
	static String infixToPostfix(String s) {
		
		StringBuilder sb = new StringBuilder();
		
		ArrayDeque<Character>stack  = new ArrayDeque<>();
		
		for(int i = 0; i < s.length(); i++) {
			
			char cur = s.charAt(i);
			
			if(cur == '(') {
				stack.push(cur);
			}else if(cur == ')') {
				
				while(stack.peek() != '(') {
				
					sb.append(stack.pop());
				}
				stack.pop();
			}else if(isOperator(cur)) {
				
				while(!stack.isEmpty() && precedence(cur) <= precedence(stack.peek())) {
					sb.append(stack.pop());
				}
				stack.push(cur);
			}else {
				sb.append(cur);
			}
		}
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		return sb.toString();
	}
	static int calculate(char ch,int e1,int e2) {
		
		switch(ch) {
		
		case '+':
		 return e2 + e1;
		 
		case '-':
			return e2 - e1;
		case '*':
			return e2 * e1;
		case '/':
			return e2 / e1;
		}
		return 0;
	}
	static int EvaluatePostfix(String pf) {
	
		ArrayDeque<Integer>stack = new ArrayDeque<>();
	
		for(int i = 0; i < pf.length(); i++) {
			
			char curr = pf.charAt(i);
			if(isOperator(curr)) {
				int first = stack.pop();
				int second = stack.pop();
				int calc = calculate(curr, first, second);
				stack.push(calc);
			}
			else {
				
				stack.push(curr - '0');
			}
		}
		
		return stack.pop();
	}
	public static void main(String[] args) {

//		String input = "(a+b)*c-d";
//		String input = "(a+b/c)*((g/e)-f)";
		
		String input = "(2*3)-(4/5-6+7)";
		String output = infixToPostfix(input);
		System.out.println("Infix to Postfix is \n"+output);
		
		int ans = EvaluatePostfix(output);
		System.out.println("Calculate of Postfix is \n"+ans);
		
	}

}
