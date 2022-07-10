package _10String;

public class _1MainClass {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		String s4 = s1 + "abc";
		
		String s5 = s1.concat("pqr").replace('H', 'B');
		
		System.out.println(s1);
		System.out.println(s5);
		
		//s1 can not change because String are Immutable in java
		//just store in other Stirng svariable 
	}

}
