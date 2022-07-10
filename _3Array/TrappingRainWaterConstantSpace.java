package _3Array;

//space complexity = O(1)
//Time Complexity = O(n)
public class TrappingRainWaterConstantSpace {

	static int solve(int a[]) {
		
		int ans = 0;
		
		int leftMax = 0,rightMax = 0;
		int l = 0, r = a.length-1;
		
		while(l < r) {
			if(a[l] <= a[r]) {
				if(a[l] > leftMax) leftMax = a[l];
				else ans += (leftMax - a[l]);
				l++;
			} else {
				if(a[r] > rightMax) rightMax = a[r];
				else ans += (rightMax - a[r]);
				r--;
			}
		}
		return ans;
	}
	public static void main(String[] args) {

		int [] height = {4,2,0,3,2,5};
		System.out.println(solve(height));
	}

}
