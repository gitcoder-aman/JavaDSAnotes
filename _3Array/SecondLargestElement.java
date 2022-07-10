package _3Array;

// Time complexity = O(n) best theta(n)
public class SecondLargestElement {
	
	public static int secMaxElement(int a[],int secmaxi,int maxi) {
		
		if(a.length < 2) return -1;
		
		for(int i = 0; i < a.length; i++) {
			
			if(a[i] > maxi) {
				secmaxi = maxi;
				maxi = a[i];
			}
			else if(a[i] < maxi) {
				if(secmaxi == -1 || a[i] > secmaxi) {
					secmaxi = a[i];
				}
			}
		}
		return secmaxi;
	}
	public static void main(String[] args) {
		
		int a[] = {9,8,7,2,6};
		int secMaxi = -1;
		int maxi = -1;
		
		int result = secMaxElement(a,secMaxi,maxi);
		System.out.println(result);
	}

}
