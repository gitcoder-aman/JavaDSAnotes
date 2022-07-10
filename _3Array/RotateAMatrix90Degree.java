package _3Array;

public class RotateAMatrix90Degree {

	static void rotateMatrix(int [][] m) {
		
		//transpose first
		int len = m.length;
		for(int i = 0; i < len; i++) {
			for(int j = i; j < len; j++) {
				int swap = m[i][j];
				m[i][j] = m[j][i];
				m[j][i] = swap;
			}
		}
		//Second swap rowwise
		
		for(int i = 0; i < len; i++) {
			for(int j = 0; j < len/2; j++) {
				int swap = m[i][j];
				m[i][j] = m[i][len-j-1];
				m[i][len-j-1] = swap;
			}
		}
		
		for(int i = 0; i < len; i++) {
			for(int j = 0; j < len; j++) {
				
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
        
		int [][]matrix = {{1,2,3,4},
				          {5,6,7,8},
				          {9,10,11,12},
				          {13,14,15,16}};
		
		rotateMatrix(matrix);
	}

}
