package _9BitMaipulation;

//Time complexity = O(n)
public class _4NonRepeatingElement {

	static int NonRepeatingElement(int[] arr) {
		
		int xorSum = 0;
		for(int e : arr) {
			
			xorSum ^= e;
		}
		return xorSum;
	}
	public static void main(String[] args) {

		int [] arr = {2,1,4,1,2,3,4};
		System.out.println(NonRepeatingElement(arr));
	}

}
