package _18Stack;

public class MainClassStackLL {

	public static void main(String[] args) throws Exception{

		_2StackUsingLL stack = new _2StackUsingLL();
		
		stack.push(2);
		stack.push(4);
	    stack.push(1);
	    stack.push(8);
	    
	    System.out.println("Size of stack after push Elements "+stack.size());
	    
	    System.out.println(stack.pop());
	    System.out.println(stack.pop());
	    System.out.println(stack.pop());
	    System.out.println(stack.pop());
	    
	    System.out.println("Size of stack after pop Elements "+stack.size());
	}

}
