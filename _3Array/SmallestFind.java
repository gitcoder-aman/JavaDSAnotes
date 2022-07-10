package _3Array;

public class SmallestFind {
	
	public static int smallest(int a[]) {
		
		 int ans = 2147483647;
		
		for(int i = 0; i < a.length; i++) {
			
			if(a[i] < ans) {
				
				ans = a[i];
			}
		}
		
		return ans;
	}
	public static void main(String[] args) {
		
		int a[] = {3,5,8,6,1,9,2};
		
		System.out.println(smallest(a));
	}

}
