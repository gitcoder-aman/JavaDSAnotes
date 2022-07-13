package _11Sorting;

//Time Complexity =  O(n)

public class DutchNationalFlag {

	public static void swap(int a[],int low,int mid) {
		
		int temp = a[low];
		a[low] = a[mid];
		a[mid] = temp;
		
	}
	public static void dnfSort(int a[]) {
		
		int low = 0;
		int mid = 0;
		
		int high = a.length-1;
		
	     while(mid < high) {
	    	 
	    	 if(a[mid] == 0) {
	    		 swap(a,low,mid);
	    		 low++;
	    		 mid++;
	    	 }
	    	 else if(a[mid] == 1) {
	    		 mid++;
	    	 }
	    	 else {
	    		 swap(a, mid, high);
	    		 high--;
	    	 }
	     }
	     for (int i : a) {
			System.out.print(i + " ");
		}
	}
	
	public static void main(String[] args) {

		int [] a = {1,1,2,0,0,1,2,2,1,0};
		dnfSort(a);
		
	}

}
