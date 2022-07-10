package _3Array;

public class BuyandSellStock {

	public static int maximumProfit(int a[]){
	
		int max = 0;
		for(int i = 1; i < a.length; i++) {
	
			if(a[i] > a[i-1]) {
				
				max += a[i] - a[i-1];
			}
		}
		return max;
	}
	public static void main(String[] args) {

		int a [] = {1,4,3,7,2,5,6,1,2};
		
		System.out.println(maximumProfit(a));
	}

}
