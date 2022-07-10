package _3Array;

public class DeleteElement {
	
	public static boolean delete(int a[],int deleteElement) {
		
		int i = 0;
		int n = a.length;
      while(i < n) {
    	  if(a[i] == deleteElement) {
    		  break;
    	  }
    	  i++;
      }
      if(i == n) {
    	  return false;
      }
      for(int j = i; j<n-1; j++) {
    	  a[j] = a[j+1];
      }
      return true;
	}
	public static void main(String[] args) {
		
		int[] a = {2,1,6,4,5};
		int deleteElement = 1;
		
		boolean ans = delete(a,deleteElement);
		
		if(ans) {
			
		for(int i = 0; i < a.length-1; i++) {
			System.out.print(a[i] + " ");
		 }
		}
		else {
			System.out.println("Not Elemnt in this Array");
		}
	}

}
