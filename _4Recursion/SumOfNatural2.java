package _4Recursion;

//Time Complexity = O(n)
//space Complexity = O(n) complier makes stack inside the  memory
public class SumOfNatural2 {

    static int SumOfNaturalNumbers(int n) {
    	
    	//base case
    	if(n == 0) {
    		return 0;
    	}
    	
    	return SumOfNaturalNumbers(n-1) + n;
    }
	public static void main(String [] args) {
		
		System.out.println(SumOfNaturalNumbers(5));
	}
}
