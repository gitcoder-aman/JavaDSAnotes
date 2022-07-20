package _12BinarySearch;

// Painter's partition question also similar code
public class _8AllocateBook {

	static boolean isPossible(int []a,int no_of_students,int mid) {
		
		int studentCount = 1;
		int pageSum = 0;
		
		for (int i = 0; i < a.length; i++) {
			
			if(pageSum + a[i] <= mid) {
				pageSum += a[i];
			}
			else {
				studentCount++;
				if(studentCount > no_of_students || a[i] > mid )
					return false;

				pageSum = a[i];
			}
		}
		return true;
	}
	static int allocateBook(int a [],int m) {
		
		
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		int s = 0;
		int ans = -1;
		int e = sum;
		
		while(s <= e) {
			int mid = s + (e-s)/2;
			
			if(isPossible(a,m,mid)) {
				ans = mid;
				e = mid - 1;  //because we find minimum element 
			}
			else {
				s = mid + 1;   //left side no solutions
			}
		}
		return ans;
	}
	public static void main(String[] args) {

		int arr[] = {10,20,30,40}; 
		
		int m = 2; // m is no of students
		System.out.println(allocateBook(arr, m));
	}

}
