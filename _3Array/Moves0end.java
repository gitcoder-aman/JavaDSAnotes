package _3Array;

public class Moves0end {

	static void solve(int a[]) {
		
//		int l = 0;
//		int r = a.length - 1;
//		
//		while(l < r) {
//			
//			if(a[l] == 0 && a[r] != 0) {
//				int swap = a[l];
//				a[l] = a[r];
//				a[r] = swap;
//				l++;
//				r--;
//			}
//			else if(a[r] == 0) {
//				r--;
//			}
//			else if(a[l] != 0) {
//				l++;
//			}
//		}
		int zeroPos = 0;
		for(int j = 0; j < a.length; j++) {
			
			if(a[j] != 0) {
				int swap = a[j];
				a[j] = a[zeroPos];
				a[zeroPos] = swap;
				zeroPos++;
			}
		}
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	public static void main(String[] args) {

		int [] a = {8,0,1,3,0,0,5};
		
		solve(a);
	}

}
