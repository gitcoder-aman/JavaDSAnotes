package _4Recursion;

//Space Complexity = O(log n)
//Time Complexity = O(log n)
public class SumOfDigit7 {

	static int sumDigit(int n) {
		
		//base case
		if(n == 0) return 0;
		
		int lastDigit = n % 10;
		
		return lastDigit + sumDigit(n/10);

	}
	public static void main(String[] args) {

		System.out.println(sumDigit(2314));
	}

}
