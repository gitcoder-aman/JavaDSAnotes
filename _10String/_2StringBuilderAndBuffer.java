package _10String;

public class _2StringBuilderAndBuffer {

	public static void main(String[] args) {

		String a = "abc"; // this is immutable
		a.concat(" HI");  //You can not change value in this String variable
		
		StringBuilder b = new StringBuilder("Hello"); //This is mutable
		
		b.append("HI");  //you can change value in this String variable
		
		System.out.println(b);
		
		b.replace(0, 3, "CATSPEED");
		
		System.out.println(b);
		b.reverse();
		
		System.out.println(a);
		System.out.println(b);
	}

}
