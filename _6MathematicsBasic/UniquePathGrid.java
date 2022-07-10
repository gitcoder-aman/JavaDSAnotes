package _6MathematicsBasic;

//Time complexity = O(n)
//space complexity = O(1)
public class UniquePathGrid {

	static int uniquePaths(int m,int n) {
		
		int res = 1;
		for(int i = 1; i<n; i++) {
			res = (res * (m+i-1))/i;
		}
		return res;
	}
	public static void main(String[] args) {

		System.out.println(uniquePaths(3,7));
	}

}
