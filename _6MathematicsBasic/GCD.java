package _6MathematicsBasic;

//Euclid Algorithms
//Time Complexity = O(n)
public class GCD {

	static int FindGCD(int a,int b) {
		
		System.out.println(a+" "+b);
		if(a == b) return a;
		if(a < b) return FindGCD(b,a);
		
		return FindGCD(a-b,b);
	}
	static int gcdEuclidModified(int a,int b) {
		
		System.out.println(a+" "+b);
		if(a < b) return gcdEuclidModified(b,a);
		if(b == 0) return a;
		
		return gcdEuclidModified(a%b,b);
	}
	public static void main(String[] args) {

		//System.out.println(FindGCD(24,36));
		
		System.out.println(gcdEuclidModified(24,36));
	}

}
