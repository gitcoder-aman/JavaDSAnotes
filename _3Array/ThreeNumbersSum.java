package _3Array;

import java.util.Arrays;

//Find three Numbers is an unsorted array with the given sum.
//Time Complexity =  O(nlogn)+O(n^2) = O(n^2)
//Space Complexity = O(n)
public class ThreeNumbersSum {
	public static void threeSum(int a[],int sum) {
		
		int n = a.length;
		int[] ans = null;
		int notfound = 1;
		int found = 0;
		for(int i = 0; i < n-2; i++) {

		   ans = twoSum(a,sum-a[i],i);
		   if(ans[0] != 0 ) {
			   found = 1;
			   
			   for(int j = 0; j < ans.length; j++) {
				System.out.print(ans[j] + " ");
				}
			   System.out.println();
		   }
		   else {
			  notfound = 0;
		   }
		}
		if(found == 0 && notfound == 0) {
			System.out.println("Not Found");
		}

	}
	public static int[] twoSum(int a[],int sum,int index) {
		
		int l = index+1;
		int r = a.length-1;
		int [] temp = {0,0,0};
		
		while(l < r) {
			int currSum = a[l]+a[r];
			
			if(currSum < sum) {
				l++;
			}
			else if(currSum > sum) {
				r--;
			}
			else {
				temp[0] = a[l];
				temp[1] = a[r];
				temp[2] = a[index];
					return temp;
			}
		}
		return temp;
	}
	public static void main(String arg[]) {
		
		int [] a = {1,2,4,7,3,5,-2,6};
		int sum = 12;
		
	//	{-2,1,1,2,3,4,5,7}
		
		Arrays.sort(a);
		
		
	  threeSum(a,sum);
	}

}
