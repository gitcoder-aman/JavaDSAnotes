package _3Array;

import java.util.HashMap;
import java.util.Map;

//Time complexity = O(n^2) // This is brute force not a optimized solution
public class LargestsSubArrayWithEqual01 {

	public static int solve(int a[]) {
		
		int ans = 0;
		for(int i = 0; i<a.length; i++) {
			int zero = 0;
			int one = 0;
			for(int j = i+1; j < a.length; j++) {
				if(a[j] == 0) zero++;
				else
					one++;
				
				if(zero == one) {
					ans = Math.max(ans, 2*zero);
				}
			}
		}
		return ans;
	}
	//Time Complexity = O(n)
	//Space Complexity = O(n)
	public static int optimizeSolution(int a[]) {
		
		int n = a.length;
		int prefixSum[] = new int [n];
		
		prefixSum[0] = a[0] == 0 ? -1 : 1;
		for(int i = 1; i < n; i++) {
			
			prefixSum[i] = a[i] == 0 ?
					prefixSum[i-1]-1 : prefixSum[i-1] + 1;
		    
		}
		Map<Integer,Integer> map = new HashMap<>();
		
		int ans = 0;
		for(int i = 0; i<n; i++) {
			if(map.containsKey(prefixSum[i])) {
				ans = Math.max(ans,i - map.get(prefixSum[i]));
			}else {
				map.put(prefixSum[i], i);
			}
		}
		
		return ans;
	}
	public static void main(String[] args) {

		int [] a = {0,0,0,0,1,0,1,1,0,1};
		//int [] a = {0,0,1,1,0};
		//System.out.println(solve(a));
		System.out.println(optimizeSolution(a));
		
	}

}
