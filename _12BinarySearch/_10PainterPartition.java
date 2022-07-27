package _12BinarySearch;

import java.awt.geom.AffineTransform;
import java.util.ArrayList;

import _5BackTracking.RateInMazeProblem;

public class _10PainterPartition {

	static int findMax(ArrayList<Integer>boards) {
		
		int max = Integer.MIN_VALUE;
		
		for(int e : boards) {
			max = Math.max(max, e);
		}
		return max;
		
	}
	static int findSum(ArrayList<Integer>boards) {
		
		int total = 0;
		for(int e : boards) {
			total += e; 
		}
		return total;
	}
//  Find minimum required painters for given maxlen which is the maximum length a painter can paint.
	static boolean isPossible(ArrayList<Integer>boards,int maxLen,int no_of_painter) {
		
		int totalSum = 0, painterCount = 1;
	
//		for(int i = 0; i < boards.size(); i++) {
//		  
//			totalSum += boards.get(i);
//			
//			if(totalSum > maxLen) {
//				totalSum = boards.get(i);
//				painterCount++;
//			}
//			
//		}
//		return painterCount;
	    for(int i = 0; i < boards.size(); i++) {
	    	if(totalSum + boards.get(i) <= maxLen) {
	    		totalSum += boards.get(i);
	    	}
	    	else {
	    		painterCount++;
	    		if(painterCount > no_of_painter || boards.get(i) > maxLen) {
	    			return false;
	    		}
	    		totalSum = boards.get(i);
	    	}
	    }
	    return true;
	}
	static int findLargestMinDistance(ArrayList<Integer>boards,int no_of_painter) {
		
	    int low = findMax(boards);
	    int high = findSum(boards);
	    
	    int ans = -1;
	    while(low <= high) {
	    	
	    	int mid = low + (high - low)/2;
	    	
	    	if(isPossible(boards, mid,no_of_painter)) {
	    		ans = mid;
	    		high = mid-1;
	    	}
	    	else {
	    		low = mid + 1;
	    	}
	    }
	    return ans;
	}
	
	public static void main(String[] args) {

		ArrayList<Integer>arrayList = new ArrayList<>();
		
		int no_of_painter = 2;
		arrayList.add(5);
		arrayList.add(5);
		arrayList.add(5);
		arrayList.add(5);
//		arrayList.add(50);
//		arrayList.add(60);
		
		System.out.println(findLargestMinDistance(arrayList,no_of_painter));
	}

}
