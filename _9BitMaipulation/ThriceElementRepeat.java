package _9BitMaipulation;

//time complexity = O(n)
//space complexity = O(1)
public class ThriceElementRepeat {

	static boolean getBit(int n,int pos) {
		
		if((n & (1 << pos)) != 0) {
			return true;
		}
		return false;
	}
	static int setBit(int n,int pos) {
		
		int mask = 1 << pos;
	    return (n | mask);
	}
	static int solve(int a[]) {
		
		int result = 0;
		
		for(int i = 0; i<32; i++) {
			
			int countBit = 0;
			for(int j = 0; j < a.length; j++) {
				
				if(getBit(a[j],i)) {
					countBit++;
				}
			}
		    if(countBit % 3 != 0) {
		    	result = setBit(result,i);
		    }
		}
		return result;
	}
	public static void main(String[] args) {

		int a[] = {3,3,5,2,3,2,2};
		
//		System.out.println(solve(a));
		System.out.println(1 << 2);
		System.out.println(3 & 4);
	}

}
