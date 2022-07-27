package _12BinarySearch;

import java.util.Arrays;

public class _9AggessiveCow {

	static boolean isPossible(int [] stalls,int k,int mid) {
		
		int cowCount = 1;
		int prevPos = stalls[0];
		
		for (int i = 0; i < stalls.length; i++) {
			if(stalls[i] - prevPos >= mid) {
				cowCount++;
				
				if(cowCount == k) return true;
				prevPos = stalls[i];
			}
		}
		return false;
	}
	static int aggerssiveCow(int [] stalls,int k) {
		
		
		// alert - variable s and e are not point to any index only distance check and move 
		Arrays.sort(stalls);
		int s = 0;
	
		int e = stalls[stalls.length-1];
		int ans = -1;
		
		while(s <= e) {
			
			int mid = s + (e-s)/2;
			if(isPossible(stalls,k,mid)) {
				ans = mid;
				s = mid + 1;
			}
			else {
				e = mid - 1;
			}
		}
		return ans;
	}
	public static void main(String[] args) {

//		int [] stalls = {4,2,1,3,6};
		int [] stalls = {0,3,4,7,10,9};
		int k = 4; //‘K’ which denotes the number of cows
		
		System.out.println(aggerssiveCow(stalls, k));
	}

}
