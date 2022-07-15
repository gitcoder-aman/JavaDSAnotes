package _11Sorting;

public class MergeIterativeWay {

	public static void mergeIterative(int [] arr,int len) {
	   
		int curr;
		int left;
		
		
		for (curr = 1; curr <= len-1; curr = 2 * curr) {
			
			for (left = 0; left < len-1; left += 2 * curr) {
				
				int mid = Math.min(left + curr - 1, len-1);
				
				int right = Math.min(left + 2 * curr - 1, len - 1);
				
				merge(arr,left,mid,right);
			}
		}
	}
	public static void merge(int [] arr,int l,int m,int r) {
		
		int n1 = m - l + 1;
		int n2 = r - m;
		
		//Create temporary Array
		int [] L = new int[n1];
		int [] R = new int[n2];
		
		for (int i = 0; i < n1; i++) {
			
			L[i] = arr[l + i];
		}
		for(int j = 0; j < n2; j++) {
		
			R[j] = arr[m + 1 + j];
		}
		
		int i = 0;
		int j = 0;
		int k = l;
		while(i < n1 && j < n2) {
			
			if(L[i] < R[j]) {
				
				arr[k] = L[i];
				i++;
			}
			else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		
		//Remaining Part of array 
		
		while(i < n1) {
			
			arr[k] = L[i];
			i++;
			k++;
		}
		while(j < n2) {
			
			arr[k] = R[j];
			j++;
			k++;
		}
	}
	public static void main(String[] args) {

		int [] a = {12,11,13,5,6,7};
		
		int len = a.length;
		mergeIterative(a,len);
	
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

}
