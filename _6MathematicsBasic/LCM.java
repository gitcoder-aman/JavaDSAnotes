package _6MathematicsBasic;

//Time Complexity = O(N)
public class LCM {


	static int findGCD(int a,int b) {
		
		//base case
		
		if(a < b) return findGCD(b,a); 
		if(b == 0) return a;
		
		return findGCD(a%b,b);
		
	}
	static int findLCM(int a,int b) {
		
		int HCF = findGCD(a,b);
		return (a*b)/HCF;
	}
	public static void main(String[] args) {

		System.out.println(findLCM(24,36));
	}

}
