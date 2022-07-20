package _12BinarySearch;

public class _7TreeCutterProblem {
	
	static boolean isEnough(int a[],int k,int cut) {
		
		int total = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] > cut) {
				total += (a[i] - cut);
			}
		}
		System.out.println(total);
		return total >= k;
	}
	static int woodCutterProblem(int a[],int k) {
		
		int left = 0, right = -1;
		
		for(int e : a) {
			right =  Math.max(right, e);
		}
		
		int ans = -1;
		while(left <= right) {
			int mid = (left+right)/2;
			System.out.println(left + " " +right + " "+mid);
			
			if(isEnough(a, k, mid)) {
				ans = mid; 
				left = mid + 1;
			}else {
				right = mid - 1;
			}
		}
		return ans;
	}
	public static void main(String[] args) {

//		int a[] = {6,5,10,9,2,4,9,5};
//		int k = 13;
		
		int [] a = {3,1,4,7,2,5,2,9};
		int k = 7;
		
		System.out.println(woodCutterProblem(a, k));
	}

}
