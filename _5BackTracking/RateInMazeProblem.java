package _5BackTracking;

//Time Complexity = O(2^n^2)
//Only go to right and bottom
public class RateInMazeProblem {

	static boolean rateInMaze(int a[][], boolean vis[][],int i,int j) {
		
		//base case
		if(i == a.length || j == a.length || a[i][j] == 0) {
			return false;
		}
		//Base Condition for successfully reached
		if(i == a.length-1 && j == a.length - 1) return true;
		
		//Mark this cell as visited
		vis[i][j] = true;
		
		//Check if a path is possible from down
		if(rateInMaze(a,vis,i+1,j)) return true;
		
		//Check if a path is possible from right
		if(rateInMaze(a,vis,i,j+1)) return true;
		
		//backTrack
		
		//Mark this call as unvisited & Backtrack
		vis[i][j] = false;
		
		//Kuchh Nhi mila then return false
		return false;
		
}
	public static void main(String[] args) {

		int a[] [] = {{1,1,0,1},
				      {1,1,1,1},
				      {0,0,1,0},
				      {1,1,1,1}
				      };
		
		//0 Blocked 1 Open 
		
		boolean vis[][] = new boolean[a.length][a.length];
		
		boolean isPathPossible = rateInMaze(a,vis,0,0);
		
		System.out.println(isPathPossible);
	}

}
