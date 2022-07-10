package _3Array;

public class MaxElement {
	
	public static int maxFind(int a[],int maxElement) {
		
		for(int i = 1; i < a.length; i++) {
			
			if(a[i] > maxElement) {
				maxElement = a[i];
			}
		}
		return maxElement;
		
		
	}
	public static void main(String [] args) {
		
		int [] a = {5,8,3,9,6};
		int maxElement = -1;
		int result = maxFind(a,maxElement);
		System.out.println("Maximum Element "+ result);
		
	}

}
