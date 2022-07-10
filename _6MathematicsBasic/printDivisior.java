package _6MathematicsBasic;

public class printDivisior {

	static void printDivisiors(int n) {
		
		int i ;
		for( i = 1; i*i <= n; i++) {
			if(n % i == 0) {
				System.out.println(i);
		
				//if(n/i != i) System.out.println(n/i);
			}
		}
		//sorted wise
		i--;
		for(; i >= 1; i--) {
			if(n % i == 0) {
				
				if(n/i != i) System.out.println(n/i);
			}
		}
	}
	public static void main(String[] args) {

		printDivisiors(36);
	}
}
