package _3Array;

//Contiguous part 
public class MaximumSumSubArray {

	//Use Kadane's algorithm
	static int largestSumSubArray(int a[]) {
		
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;
		
		for(int i = 0; i < a.length; i++) {
			currSum += a[i];
			
			if(maxSum < currSum)
				maxSum = currSum;
			if(currSum < 0) {
				currSum = 0;
			}
		}
		
		return maxSum;
	}
	public static void main(String[] args) {
		
		int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		
		// 4,-1,-2,1,5 maximum sum Subarray part
		System.out.println("Max Contiguous Sum is "+largestSumSubArray(a));
		
		
		
	}

}
