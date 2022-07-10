package _3Array;

//space Complexity = O(n)
//Time Complexity = O(n)
public class TrappingRainWater {

	static int solve(int height[]) {
		
		int len = height.length;
		//For Left Support Find
		int [] left = new int [len];
		left[0] = height[0];
		for(int i = 1; i < len; i++) {
			
			left[i] = Math.max(height[i],left[i-1]);
		}
		// For Right Support Find 
		int [] right = new int [len];
		right[len-1] = height[len-1];
		for(int i = len-2; i >= 0; i--) {
			
			right[i] = Math.max(height[i],right[i+1]);
		}
		
		int ans = 0;
		for(int i = 0; i < len; i++) {
			//ans += Math.max(0, Math.min((left[i] - height[i]), (right[i] - height[i])));
			ans += Math.max(0,(Math.min(left[i], right[i])-height[i]));
		}
		return ans;
		//ans = 0+1+0+1+2+1+0+0+1+0+0 trapping Rain Water
	}
	
	public static void main(String[] args) {
		
		//int [] height = {1,0,2,1,0,1,3,2,1,2,1};
		int [] height = {4,2,0,3,2,5};
		System.out.println(solve(height));

	}

}
