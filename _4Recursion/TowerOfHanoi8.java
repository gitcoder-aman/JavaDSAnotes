package _4Recursion;

public class TowerOfHanoi8 {
	
	static void towerOfHanoi(int n,char from, char to, char aux) {
		
		if(n == 0) return;
		
		towerOfHanoi(n-1,from,aux, to);
		System.out.println("Move "+n+" from "+ from+" to "+ to);
		towerOfHanoi(n-1,aux,to,from);
	}
	public static void main(String args[]) {
		
		towerOfHanoi(2,'A','C','B');
		
		//No of step  = 2^n - 1;
	}

}
