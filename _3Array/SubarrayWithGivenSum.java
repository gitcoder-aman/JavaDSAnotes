package _3Array;
import java.util.ArrayList;

public class SubarrayWithGivenSum {

	static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer>list = new ArrayList<>(2);
         
        int currSum = 0, start = 0,last = -1;
        for(int i = 0; i < n; i++){
         
        	last = i - 1;
        	while(currSum > s && start < last ) {
        		
        		currSum -= arr[start];
        		start++;
        	}
        	
        	// If curr_sum becomes equal to sum,
            // then return true
        	if(currSum == s) {
        		list.add(start);
        		list.add(last);
        		return list;
        	}
        	
        	//Add this element to curr_sum
        	if(i < n) {
        		currSum += arr[i];
        	}
        	
        }
        list.add(-1);
        return list;
     
    }
	public static void main(String[] args) {
		
//
		int [] a = {1,2,3,4,5,6,7,8,9,10};
		int s = 15;
		
		
//		int a [] = {135,101,170,125,79,159,163,65,106,146,82,28,162,92,196,143,28,37,192,5,103,154,93,183,22,117,119,96,48,127,172,139,70,113,68,100,36,95,104,12,123,134,94};
//		int s = 468;
		
		ArrayList<Integer>arrayList = subarraySum(a,a.length,s);
		
		for (Integer integer : arrayList) {
			
			System.out.println(integer);
		}
	}

}
