package _6MathematicsBasic;

//Time Complexity = O(n)
//Space Complexity = O(1)
public class PalindromeNumber {

	static String checkPalindrome(int n) {
		
		int temp = n;
		int rev = 0;
		while(n != 0) {
			int lastDigit = n % 10;
			 rev = rev * 10 + lastDigit;
			 n /= 10;
		}
		if(temp == rev)
		return "This is Palindrome Number";
		
		return "This is Not Palindrome Number";
	}
	public static void main(String[] args) {

		System.out.println(checkPalindrome(23432));
	}

}
