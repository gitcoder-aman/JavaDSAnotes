package _6MathematicsBasic;

//Zero No of Present in last  
public class TrallingZeroInFactorial {

	
	static String zeroCount(int n) {
		
       int res = 0;
		while(n != 0)
		{
			res =res+ (n/5);
			n = n/5;
		}
		return res +" zeroes will be come in factorial.";
	}
	public static void main(String[] args) {

		System.out.println(zeroCount(125));
	}

}
