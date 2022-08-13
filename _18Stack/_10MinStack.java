package _18Stack;

import java.util.MissingFormatArgumentException;

public class _10MinStack {

	public static void main(String[] args) throws Exception{

		MinStackOofN minStackOofN = new MinStackOofN();
		
		minStackOofN.push(10);
		minStackOofN.push(2);
		System.out.println(minStackOofN.min());
		minStackOofN.push(1);
		System.out.println(minStackOofN.min());
		
		minStackOofN.pop();
		minStackOofN.push(5);
		System.out.println(minStackOofN.min());
		
		minStackOofN.pop();
		System.out.println(minStackOofN.min());
		minStackOofN.push(2);
		System.out.println(minStackOofN.min());
		minStackOofN.push(10);
		System.out.println(minStackOofN.min());
	}

}
