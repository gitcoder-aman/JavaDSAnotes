package _3Array;

// Write a program to replace every element with the greatest element on its right side.
public class ReplaceEveryElement {
	
	public static void replace(int a[],int maxi,int pickElement,int maxiPosition) {
		
		//base case
		if(pickElement == a.length-1) {
			a[pickElement] = 0;
		    return;
		}
		
		for(int i = pickElement+1; i < a.length; i++) {
			
			if(a[i] > maxi) {
				maxi = a[i];
				maxiPosition = i;
			}
		}
		
		for(int i = pickElement; i < maxiPosition; i++) {
			
			a[i] = a[maxiPosition];
		}
		maxi = 0;
		pickElement = maxiPosition;
		
		replace(a,maxi,pickElement,maxiPosition);
	
}
	public static void main(String[] args) {
	     
		int a[] = {7,5,8,9,6,8,5,7,4,6};
		
		//int a[] = {7,5,8,6,10,2,4,1};
		
		// to come the ans = {9,9,9,8,8,7,7,6,6,0} // replace the modify array
		
		int maxi = 0;
		int pickElement = 0;
		int maxiPosition = 0;
		replace(a,maxi,pickElement,maxiPosition);
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
