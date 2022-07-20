package _12BinarySearch;

public class UpperBound {

	static int upperBound(int [] a,int key) {
		
		int l = 0, r = a.length - 1;
		int ans = -1;
		
		while(l <= r) {
			
			int mid = (l+r)/2;
			if(a[mid] <= key) {
				l = mid + 1;
			}
			else {
				ans = mid;
				r = mid - 1;
			}
		}
		return ans;
	}
	public static void main(String[] args) {

		int [] a = {2,4,5,6,8,9,12};
		System.out.println(upperBound(a, 6));
	}

}
