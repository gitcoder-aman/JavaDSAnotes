package _14Hashing;

import java.util.HashSet;
import java.util.Set;

//Time Complexity =  O(n)
//Space Complexity = O(n)
public class _8longestConsecutiveSubsequence {

	static int longestConsecutiveSubsequence(int [] a) {
		
		Set<Integer>set = new HashSet<>();
		for(int e : a) set.add(e);
		
		int ans = 1;
		for(int e : set) {
			if(!set.contains(e-1)) {
				
				int len = 1;
				while(set.contains(++e)) {
					len++;
				}
				ans = Math.max(ans, len);
			}
		}
		return ans;
	}
	public static void main(String[] args) {

		int a[] = {2,1,9,3,5,4,8,7,2,1,3};
//		int a[] = {6,7,8,9,10};
		
		System.out.println(longestConsecutiveSubsequence(a));
	}

}
