package _3Array;
import java.util.HashSet;
import java.util.Set;

public class SubarrayWith0Sum {

	static boolean subArrayWithZeroSum(int a[]) {
		
		int len = a.length;
//		int prefixSum [] = new int [len];
//		
//		prefixSum[0] = a[0];
		Set<Integer>set = new HashSet<>();
		int sum = 0;
		for(int i = 0; i < len; i++) {
		
			sum += a[i];
			if(set.contains(sum)) {
				return true;
			}
			set.add(sum);          
			//value in set  = {2,5,6,2,5,3};
                    //  when come is 2 then return true
		}
		return false;
	}
	public static void main(String[] args) {
		
		int [] a = {2,3,1,-4,3,-2};
	    
		System.out.println(subArrayWithZeroSum(a));

	}

}
