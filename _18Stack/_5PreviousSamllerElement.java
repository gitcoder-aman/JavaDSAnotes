package _18Stack;

import java.util.ArrayDeque;

//Time complexity = O(n)

public class _5PreviousSamllerElement {
	
	static int[] previousSmallerElement(int [] a) {
		
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		
		int ans[] = new int[a.length];
		int j = 0;
		for(int i = 0; i < a.length; i++) {
			
			int element = a[i];
		
			while(!stack.isEmpty() && stack.peek() >= element) {
				 stack.pop();
			}
			if(stack.isEmpty()) {
				ans[j] = -1;
			}
			else {
				 ans[j] = stack.peek();
			}
			
			stack.push(element);
			j++;
		}
		  
		return ans;
	}
	public static void main(String[] args) {
		
//		int a[] = {5,1,2,3,9,6,1,4,3};
		int a[] = {1,6,2};
		
		int[] ans =  previousSmallerElement(a);
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
			System.out.print(ans[i]+ " ");
			System.out.println();
		}
	}

}
