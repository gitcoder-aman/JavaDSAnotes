package _13DoubtClass;

public class InsertPositionSortedArray {

	public static int InsertPosition(int []a ,int element) {
		
		int left = 0;
		int right = a.length - 1;
		
		while(left <= right) {
			
			int mid = left + (right - left)/2;
			if(a[mid] == element) {
				return mid;
			}
			if(a[mid] < element) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
			
		}
		return left;
	}
	public static void main(String[] args) {

		int [] a = {1,3,4,6,7,8,10};
		System.out.println(InsertPosition(a,9));
	}

}
