package _14Hashing;

import java.util.HashSet;

public class _5TwoSum {


	static int[] pairWithGivenSum(int [] a,int sum) {
		
		int []result = new int[2];
		HashSet<Integer>set = new HashSet<>();
		for(int e : a) {
			
			int comp = sum - e;
			if(set.contains(comp))  {
				result[1] = e;
				result[0] = sum - e;
			}
				set.add(e);
			
		}
		return result;
	}
	public static void main(String[] args) {

		int a[] = {1,2,3,1,4,5,2,-1};
		int sum = 8;
		
//		System.out.print(pairWithGivenSum(a, sum));
		
		int result[] = pairWithGivenSum(a, sum);
		
		for (int i : result) {
			
			System.out.println(i);
		}
		
		
	}

}
