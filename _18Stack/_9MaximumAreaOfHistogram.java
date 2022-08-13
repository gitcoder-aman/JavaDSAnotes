package _18Stack;

import java.util.ArrayDeque;

public class _9MaximumAreaOfHistogram {

	//Time Complexity = O(n^2) //Brute Force
	static int maximumAreaInHistogram(int a[]) {
		
		int n = a.length;
		int max = 0;
		for(int i = 0; i < n; i++) {
			
			int l = i, r = i;
			
			while(l >= 0 && a[l] >= a[i]) l--;
			
			while(r < n && a[r] >= a[i])r++;
			
			int width = r - l -1;
			int curArea = a[i] * width;
			max = Math.max(max, curArea);
		}
		return max;
	}
	static int[] nextSmallerElement(int arr[],int n) {
		ArrayDeque<Integer>stack = new ArrayDeque<>();
		stack.push(-1);
		int ans[] = new int[n];
		
		for(int i = n-1; i >= 0; i--) {
			int curr = arr[i];
			while(stack.peek() != -1 && arr[stack.peek()] >= curr) {
				stack.pop();
			}
			ans[i] = stack.peek();
			stack.push(i);
		}
		return ans;
	}
	static int[] prevSmallerElement(int arr[],int n) {
		ArrayDeque<Integer>stack = new ArrayDeque<>();
		stack.push(-1);
		int ans[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			
			int curr = arr[i];
			while(stack.peek() != -1 && arr[stack.peek()] >= curr) {
				stack.pop();
			}
			ans[i] = stack.peek();
			stack.push(i);
		}
		return ans;
	}
	public static int optimizeHistogram(int[] a) {
		int n = a.length;
		
		int next[] = new int[n];
		next = nextSmallerElement(a,n);
		
		int prev[] = new int[n];
		prev = prevSmallerElement(a,n);
		
		int area = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++) {
			int l = a[i];
			
			if(next[i] == -1) {
				next[i] = n;
			}
			int b = next[i] - prev[i] - 1;
			int newArea = l*b;
			area = Math.max(area,newArea);
		}
		return area;
	}
	public static void main(String[] args) {

		int a[] = {4,2,1,4,3,0,2,3};
//		System.out.println(maximumAreaInHistogram(a));
		System.out.println(optimizeHistogram(a));
		
	}

}
