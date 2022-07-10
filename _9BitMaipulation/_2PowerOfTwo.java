package _9BitMaipulation;

public class _2PowerOfTwo {

	static boolean isPowerOfTwo(int n) {
		
		if((n & n-1) == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	static int toggleIthBit(int n,int i) {
		
		int mask = 1 << i;
		return n ^ mask;
	}
	public static void main(String[] args) {

		System.out.println(isPowerOfTwo(15));
		System.out.println(toggleIthBit(5,1));
	}
	

}
