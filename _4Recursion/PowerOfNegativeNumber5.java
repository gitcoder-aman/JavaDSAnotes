package _4Recursion;

public class PowerOfNegativeNumber5 {

	static double powerNegativeNumber(double x,int n) {
		
		double res = powFunction(x,Math.abs((long)(n)));
		return n < 0 ? 1/res : res;
	}
	static double powFunction(double x,long n) {
		
		if(n == 0) return 1.0;
		double res = powFunction(x,n/2) ;
		//System.out.println("Before res "+res);
		res *= res;
		//System.out.println("After res "+ res);
		
		if(n % 2 == 1) res *= x;
		//System.out.println("After if "+ res);
		
		return res;
	}
	public static void main(String[] args) {
		
		System.out.println(powerNegativeNumber(2.0000,-2));

	}

}
