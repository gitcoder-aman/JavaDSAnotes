package _18Stack;

public class MainClassStackArray {

	public static void main(String[] args) throws Exception{

		_1StackUsingArray stack = new _1StackUsingArray(3);
		
		stack.push(3);
		stack.push(2);  
		stack.push(1);
		
//		stack.push(8); // No push because size is only 3. 
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
//		System.out.println(stack.pop());
		
//		System.out.println(stack.pop()); //throw Exception because Stack is already Empty.
	
		System.out.println("Size of stack "+stack.size());
		System.out.println("Peek Element in Stack " +stack.peek());
	}

}
