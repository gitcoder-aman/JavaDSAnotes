package _9BitMaipulation;

import java.util.Arrays;

//Time complexity = O(NlogN + N)
public class ThriceElementSortingLinear {

	static int SortingLinearTraversal(int [] a) {
		
		Arrays.sort(a); //O(n logn)
		
		int i = 1;
		int ans = a[a.length-1];
		while(i < a.length) {
			
			if(a[i] == a[i-1]) {
				i += 3;
			}else {
				ans = a[i-1];
				break;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		
		//int [] arr = {5,2,5,3,4,2,3,5,2,3};
		
		int [] arr = {5,4,5,4,5,4,2};
		
		//int [] arr = {4,5,4,5,6,5,4};
		
		System.out.println(SortingLinearTraversal(arr));
	}

}
