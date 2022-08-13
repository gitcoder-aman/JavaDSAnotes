package _18Stack;

import java.util.ArrayDeque;

public class _7InfixToPrefix {

	static boolean isOperator(char ch) {
		if(ch == '-' || ch == '*' || ch == '/' || ch == '+')
			return true;
		
		return false;
	}
	static int precedence(char ch) {
		
		if(ch == '+' || ch == '-') return 1;
		if(ch == '*' || ch == '/') return 2;
		
		return -1;
	}
	static String InfixToPrefix(String s) {
		
		StringBuilder sb = new StringBuilder();
		ArrayDeque<Character>stack = new ArrayDeque<>();
		
		for(int i = s.length()-1; i >= 0; i--) {
			char ch = s.charAt(i);
			if(ch == ')') { //Suppose open Bracket
				stack.push(ch);
			}
			else if(ch == '(') { //Suppose close Bracket
				while(stack.peek() != ')') {
					sb.append(stack.pop());
				}
				stack.pop();
			}
			else if(isOperator(ch)) {
				while(!stack.isEmpty() && precedence(ch) < precedence(stack.peek())) {
					sb.append(stack.pop());
				}
				stack.push(ch);
			}
			else {
				sb.append(ch); // when Operand
			}
		}
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		return sb.reverse().toString();
		
	}
	public static void main(String[] args) {

//		String input = "(2-3)*(4-5+(6*7))";
//		String input = "(a-b)*c";
//		String input = "(a-b*c)/((e+f)*g/h)";
		String input = "(2*3)-(4/5-6+7)";
		String output = InfixToPrefix(input);
		System.out.println(output);
		
	}

}
