package _12BinarySearch;


public class _2CountTheOccurrences {

	static int firstOccurence(int a[],int key) {
		
		int l = 0;
		int r = a.length - 1;
		
		int leftOccur = -1;
		while(l <= r) {
			int mid = l + (r-l)/2;
			
			if(a[mid] == key) {
			
				leftOccur = mid;
				r = mid - 1;
			}
			else if(a[mid] < key) l = mid + 1;
			else {
				r = mid - 1;
			}
		}
		return leftOccur;
	}
	static int LastOccurence(int a[],int key) {
		
		int l = 0;
		int r = a.length - 1;
		
		int rightOccur = -1;
		while(l <= r) {
			int mid = l + (r-l)/2;
			
			if(a[mid] == key) {
			
				rightOccur = mid;
				l = mid + 1;
			}
			else if(a[mid] < key) l = mid + 1;
			else {
				r = mid - 1;
			}
		}
		return rightOccur;
	}
	public static int CountTheOccurr(int a[],int key) {
		
		int LeftOccur = firstOccurence(a, key);
		int rightOccur = LastOccurence(a, key);
	    
		return rightOccur - LeftOccur + 1;
	}
	public static void main(String[] args) {

		int [] a = {1,1,1,2,3,3,3,3,4,6};
		
		System.out.println(CountTheOccurr(a, 1));
	}

}
