package _3Array;

public class MinSumSubarray {

	public static int minSubArray(int a[]) {
		
		int currSum = 0;
		int minSum = Integer.MAX_VALUE;
		
		for(int i = 0; i < a.length; i++) {
			
			currSum += a[i];
			if(minSum > currSum) {
				minSum = currSum;
			}
			//reset the sub array
			if(currSum > 0) {
				currSum = 0;
			}
		}
		
		return minSum;
	}
	public static void main(String[] args) {
		
		int a[] = {3, -4, 2, -3, -1, 7, -5};
		
		System.out.println("Your Contiguous min SubArray is "+ minSubArray(a));
	}

}
