package _6MathematicsBasic;

import java.util.Arrays;

//Time Complexity = O(nloglogn)
public class seiveOfEratosthenes {

	static void Prime(int n) {
		
		boolean isPrime[] = new boolean[n+1];
		Arrays.fill(isPrime, true);
		
		for(int i = 2; i*i <= n; i++) {
			
			if(isPrime[i]) {
				
				for(int j = i*i; j <=n ; j +=i) {
					isPrime[j] = false;
				}
			}
		}
		for(int i = 2; i<=n; i++) {
			if(isPrime[i]) System.out.println(i);
		}
	}
	public static void main(String[] args) {
		
		Prime(30);
		
	}

}
