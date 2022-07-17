package _6MathematicsBasic;

import java.math.BigInteger;

//Time complexity = O(log n)
public class FastPower {

	static int fastPower(int a,int b) {
		
		if(b == 0) return 1;
		
		int halfRes = fastPower(a,b/2);
		
		int fullRes = halfRes * halfRes;
		
		if(b % 2 != 0) fullRes *= a;
		
		return fullRes;
	}
	public static void main(String[] args) {

		System.out.println(fastPower(3,5));
		
//		BigInteger A,B;
//		
//		A = BigInteger.valueOf(54);
//		B = BigInteger.valueOf(23);
//
//		
//		BigInteger C = A.add(B);
//		
//		BigInteger biginteger = new BigInteger("2");
//		BigInteger val = new BigInteger("3");
//		BigInteger C1 = biginteger.and(val);
//		
//		System.out.println(A);
//		System.out.println(B);
//		System.out.println(C);
//		System.out.println(C1);
		
		
		
		
	}

}
