package _3Array;

public class MaxValueofJMinusI {

	static int solve(int a[]) {
		
		int n = a.length;
		int [] rightMax = new int [n];
		int [] leftMin = new int [n];
		
		rightMax[n-1] = a[n-1];
		for(int i = n-2; i >=0; i--) {
			rightMax[i] = Math.max(rightMax[i+1], a[i]);
		}
		
		leftMin[0] = a[0];
		for(int i = 1; i < n; i++) {
			leftMin[i] = Math.min(leftMin[i-1], a[i]);
		}
		
		int i = 0, j =0;
		int ans = 0;
		while(i < n && j < n) {
			if(leftMin[i] < rightMax[j]) {
				ans =  Math.max(ans, j-i);
				j++;
			}
			else {
			    i++;
			}
		}
		return ans;
	}
	public static void main(String[] args) {

		int a[] = {3,4,5,1,7,2,6,5,4,1};
		//int a[] = {4,3,5,1,4,2,1};
		System.out.println(solve(a));
		
	}

}
