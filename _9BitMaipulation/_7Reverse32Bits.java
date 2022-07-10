package _9BitMaipulation;

public class _7Reverse32Bits {
	
	static long reverse32Int(long n) {
		
		long res = 0;
		int i = 0;
		while(i <= 31) {
			if((n & (1 << i)) != 0) 
			res += (1L << (32-i));
			
			i++;
		}
		return res;
	}
	public static void main(String args[]) {
		
		System.out.println(reverse32Int(3));
		
	}

}
