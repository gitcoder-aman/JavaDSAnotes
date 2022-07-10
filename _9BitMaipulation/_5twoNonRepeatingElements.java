package _9BitMaipulation;

//Time complexity = O(n)
public class _5twoNonRepeatingElements {

	public static int [] twoNonRepeatingElements(int a[]) {
		
		int xorSum = 0;
	
		for(int e : a) {
			
			xorSum ^= e;
		}
		int temp = xorSum;
		
		//This formula is remembered.
		int mask = xorSum & ~((xorSum-1));
		
		for(int e : a) {
			
			if((mask & e) == 0) {
				temp = temp ^ e;
			}
		}
		int firstNumber = temp;
		int secondNumber = xorSum ^ firstNumber;
		
		int res [] = new int [2];
		res[0] = firstNumber;
		res[1] = secondNumber;
		
		return res;
	}
	public static void main(String[] args) {

		int [] a = {2,4,2,4,6,3};
		
		int res [] = twoNonRepeatingElements(a);
		
		for(int e : res) {
			System.out.println(e);
		}
	}

}
