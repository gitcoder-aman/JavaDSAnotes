package _12BinarySearch;

public class _5SquareRoot {

	static int sqrt(int n) {
		
		int ans = 1;
		int l = 1, r = n;
		
		while(l <= r) {
			
			int mid = (l + r)/2;
			int midsqr = mid * mid;
			
			if(midsqr == n) return mid;
			if(midsqr > n) r = mid - 1;
			else {
				ans = mid;
				l = mid + 1;
			}
		}
		return ans;
	}
	public static void main(String[] args) {

		System.out.println(sqrt(24));
	}

}
