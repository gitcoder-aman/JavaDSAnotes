package _3Array;

//In an array of all 0s & 1s, find the longest length of all consecutive 1s.

public class LongestLengthOf1 {

	static int solve(int a[]) {
		
		int Currcount = 0;
		int MaxCount = 0;
		for(int i = 0; i < a.length; i++) {
			
			if(a[i] == 1) {
				Currcount++;
			}
			else {
				Currcount = 0;
			}
			MaxCount = Math.max(MaxCount, Currcount);
//			if(Currcount > MaxCount ) {
//				MaxCount = Currcount;
//			}
		}
		
		return MaxCount;
	}
	public static void main(String[] args) {

		int [] a = {1,1,1,0,0,1,0,1,1,1,1,0,1};
		
		System.out.println(solve(a));
 	}

}
