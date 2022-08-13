package _18Stack;

public class _10MinStackOofN {

	public static void main(String[] args) throws Exception{

		MinStackOofN minStack = new MinStackOofN();
		
		minStack.push(10);
		minStack.push(2);
		System.out.println(minStack.min());
		minStack.push(1);
		System.out.println(minStack.min());
		minStack.pop();
		minStack.push(5);
		System.out.println(minStack.min());
		minStack.pop();
		System.out.println(minStack.min());
		minStack.push(2);
		System.out.println(minStack.min());
		minStack.push(10);
		System.out.println(minStack.min());
	}

}
