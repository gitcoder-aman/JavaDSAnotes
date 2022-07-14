package _12BinarySearch;


public class _3SearchRotatedSortedArray {

	static int searchRotatedSorted(int a[],int key) {
		
		int l = 0, r = a.length - 1;
		while(l <= r) {
			
			int mid = l + (r-l)/2;
			
			if(a[mid] == key) return mid;
			
			if(a[l] <= a[mid]) { // left part sorted
				
				if(key >= a[l] && key < a[mid]) { //left Right Present
					r = mid - 1;
				}
				else { //right side Present
					l = mid + 1;
				}
			}else { //Right part Sorted  
				if(key > a[mid] && key <= a[r]) {
					l = mid + 1;
				}else {
					r = mid - 1;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {

		int [] a = {4,5,7,8,9,1,2,3};
		
		
		System.out.println(searchRotatedSorted(a, 3));
	}

}
