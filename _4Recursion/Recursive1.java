package _4Recursion;

public class Recursive1 {
	
	static int i = 0;
	static void dummyFunction() {
		
		//base case
		if(i == 10) return;
		System.out.println(i++);
		dummyFunction();
	}
	static void printNaturalNumber(int n) {
		
		//base case
		if(n == 0) return;
		
		System.out.println(n);
		printNaturalNumber(n-1);// This will be called Tail Recursion
		
	}
	public static void main(String[] args) {
		
		//dummyFunction();
		printNaturalNumber(5);
	}

}
