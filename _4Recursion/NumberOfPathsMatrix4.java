package _4Recursion;

public class NumberOfPathsMatrix4 {

	//Rule : Right or Down 
	static int countPathsInMatrix(int n,int m) {
		
		if(n == 1 || m == 1) return 1;
		
		int rightSideAns = countPathsInMatrix(n,m-1);
		int downSideAns = countPathsInMatrix(n-1,m);
		
		return rightSideAns + downSideAns;
	}
	public static void main(String[] args) {

		System.out.println(countPathsInMatrix(7,3));
	}

}
