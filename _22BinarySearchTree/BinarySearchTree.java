package _22BinarySearchTree;

public class BinarySearchTree {
	
	//insert binary search node
	 public BSTNode insertBstNode(BSTNode root,int val) {
		
		if(root == null) return new BSTNode(val);
		
		if(val > root.data) {
			root.right = insertBstNode(root.right,val);
		}else if(val < root.data) {
			root.left = insertBstNode(root.left,val);
		}
		
		return root;
	}
	 void inOrderTraversal(BSTNode root) {
		 
		 if(root == null) return;
		 
		 inOrderTraversal(root.left);
		 
		 System.out.print(root.data + " ");
		 
		 inOrderTraversal(root.right);
	 }

}
