package _18Stack;

//Time Complexity = O(n*m)
//Space Complexity = O(m)
public class MaximumAreaMatrix {

	static int maximumAreaSubMatrix(int a[][]) {
		
		//compute area for first row
		int area = _9MaximumAreaOfHistogram.optimizeHistogram(a[0]);
		
		//for remaining rows
		for(int i = 1; i < a.length; i++) {
			
			for(int j = 0; j < a.length; j++) {
				
				//row update:by adding previous row's value
				if(a[i][j] != 0) {
					
					a[i][j] = a[i][j] + a[i-1][j];
				}
				else {
					a[i][j] = 0;
				}
			}
			//Entire row is updated now
			int newArea = _9MaximumAreaOfHistogram.optimizeHistogram(a[i]);
		    area = Math.max(area, newArea);
		}
		
		return area;
	}
	public static void main(String[] args) {

		int a[][] = {
			     	{1 , 1 , 1 , 1},
			     	{1 , 0 , 1 , 1},
			     	{1 , 1 , 1 , 1},
			     	{1 , 1 , 0 , 1}
		            };
		System.out.println(maximumAreaSubMatrix(a));
	}

}
