package _3Array;

// Sorted Array
//Time Complexity = O(n) or theta(n)
//Space Complexity = O(1)
public class RemoveDuplicatesArray {
	
	public static void duplicate(int a[]) {
		
		int j = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] != a[j]) {
			   
				a[j+1] = a[i];
				j++;
			}
		}
		for(int i = 0; i < j; i++) {
			System.out.print(a[i] + " ");
		}
	
	}
	public static void main(String[] args) {
		
		int a[] = {2,2,3,4,4,7};
		duplicate(a);  

	}

}
