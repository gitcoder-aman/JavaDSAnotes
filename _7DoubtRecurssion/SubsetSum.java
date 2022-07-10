package _7DoubtRecurssion;

public class SubsetSum {

	//Time COmplexity = O(2^n)
	static boolean subSetSum(int sum,int a[],int N) {
		
		//N for last index
		
		if(sum == 0) return true;
		
		if(N < 0) return false;
		
		if(sum < 0) return false;
		
		return subSetSum(sum-a[N],a,N-1) || subSetSum(sum,a,N-1);
		
	}
	public static void main(String[] args) {

		int a[] = {3,34,4,12,5,2};
		int sum = 15;
		
		System.out.println(subSetSum(sum,a,a.length-1));
	}

}
