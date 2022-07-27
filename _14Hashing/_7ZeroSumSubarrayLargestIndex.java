package _14Hashing;

import java.util.HashMap;
import java.util.Map;

public class _7ZeroSumSubarrayLargestIndex {

	static int largstSubarrayWithZeroSum(int a[]) {
		
		Map<Integer, Integer>map = new HashMap<>();
		
		map.put(0, -1);
		int ans = 0;
		int cs = 0;
	
		for(int i = 0; i < a.length; i++) {
			int element = a[i];
			cs += element;
			
			if(map.containsKey(cs)) {
				int prev = map.get(cs);
				ans = Math.max(ans, i-prev); 
			}
			else {
				map.put(cs, i);
			}
		}
		return ans;
	}
	public static void main(String[] args) {

		int [] a = {1,1,5,-3,-4,3,4,1};
		
		System.out.println(largstSubarrayWithZeroSum(a));
	}

}
