package _14Hashing;

import java.util.HashSet;
import java.util.Set;

public class _6ZeroSumSubarray {

	static boolean zeroSumSubarray(int [] a) {
		
		Set<Integer> set = new HashSet<Integer>();
		int cs = 0;
		set.add(0);
		for(int e : a) {
			
			cs += e;
			if(set.contains(cs)) return true;
			
			set.add(cs);
		}
		return false;
	}
	public static void main(String[] args) {

		int arr [] = {1,4,-3,2,1,2};
		
		System.out.println(zeroSumSubarray(arr));
	}

}
