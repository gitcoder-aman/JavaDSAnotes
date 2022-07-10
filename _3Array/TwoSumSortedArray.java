package _3Array;

public  class TwoSumSortedArray {

	static boolean solve(int a[],int sum) {
		
		int l = 0;
		int r = a.length - 1;
		while(l < r) {
			int currSum = a[l] + a[r];
			if(currSum > sum) {
				r--;
			}
			else if(currSum < sum) {
				l++;
			}
			else {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {

		// given array is sorted array
		int a[] = {1,2,7,8,10,12};
		int sum = 15;
		System.out.println(solve(a,sum));
	}

}
