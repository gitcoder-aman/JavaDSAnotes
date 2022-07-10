package _3Array;

// Two Pointer Approach
public class ContainerWithMostWater {

	static int FindContainerWithMostWater(int a[]) {
		
		int maxArea = 0;
		int l = 0;
		int r = a.length-1;
		
		while(l < r) {
			
			int height = Math.min(a[l], a[r]);
			int distance = r - l;
			
			int area = height * distance;
			maxArea = Math.max(maxArea, area);
			
			if(a[l] < a[r]) {
				l++;
			}
			else {
				r--;
			}
		}
		return maxArea;
	}
	public static void main(String[] args) {
		
		int [] a = {1,8,6,2,4,5,8,3,6};
		
	//	ans = 7 * 6 = 42 // No of Distance
        
		int ans = FindContainerWithMostWater(a);
		System.out.println("Container With Most Water "+ ans);
	}

}
