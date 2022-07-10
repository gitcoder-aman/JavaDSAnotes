package _3Array;

// For Square Matrix
public class TransposeMatrix {

	static void transpose(int m[][]) {
		
		int len = m.length;
	
		for(int i = 0; i < len; i++) {
			for(int j = i; j < len; j++) {
				int swap = m[i][j];
				m[i][j] = m[j][i];
				m[j][i] = swap;
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

		int [][] matrix = {{1,2,3},
				           {4,5,6},
				           {7,8,9}};
		
		transpose(matrix);
	}

}
