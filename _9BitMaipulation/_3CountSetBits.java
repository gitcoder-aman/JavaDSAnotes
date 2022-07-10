package _9BitMaipulation;

//Time Complexity = O(log n)
public class _3CountSetBits {

	static int countBit(int n) {
		
		int count = 0;
		while(n != 0) {
			if( (n & 1) == 1) {
				count++;
			}
			n = n >> 1;
		}
		return count;
	}
	static int countSetBitsOptimized(int n) {
		int count = 0;
		
		while(n > 0) {
			count ++;
			n = n & (n-1);	
		}
		return count;
	}
	public static void main(String[] args) {

	    System.out.println(countBit(10));
	    System.out.println(countSetBitsOptimized(15));
	}

}
