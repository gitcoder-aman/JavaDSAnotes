package _4Recursion;

//Time Complexity = O(n)
public class PowerOfNumber3 {

	static int CalculatePower(int a,int b) {
		
		//base case
		if(b == 0) {
			return 1;
		}
		if(b == 1) return a;
		
		return (a * CalculatePower(a,b-1)); 
	}
	public static void main(String [] args) {
		
		System.out.println(CalculatePower(3,4));
		System.out.println(Math.pow(3, 5));
	}
}
