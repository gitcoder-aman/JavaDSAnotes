package _9BitMaipulation;

public class _6SwapTwoBits {

	static int swapTwoBit(int n,int i,int j) {
		
		int ith = (n >> i) & 1; // kya rkha hai (0,1)
		
		int jth = (n >> j) & 1; // kya rkha hai (0,1)
		
//		int xor = ith ^ jth;
//		if(xor == 0) return n;
		if(ith == jth ) return n;
		
		//when xor is 1
		int mask = (1 << i) | (1 << j);
			return n ^ mask;
		
	}
	public static void main(String[] args) {

		System.out.println(swapTwoBit(10,1,2));		
	}
	// 10 = 1010
	//      1100 which is 12;

}
