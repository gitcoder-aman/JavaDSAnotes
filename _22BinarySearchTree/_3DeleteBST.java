package _22BinarySearchTree;

public class _3DeleteBST {

	static class TreeNode{
		
		int data;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(int data) {
			this.data = data;
		}
	}
	static void inorder(TreeNode root) {
		
		if(root != null) {
			
			inorder(root.left);
			System.out.println(root.data + " ");
			inorder(root.right);
		}
	}
	static TreeNode insert(TreeNode root,int key) {
		
		if(root == null) {
			TreeNode temp = new TreeNode(key);
			return temp;
		}
		if(key < root.data) {
			
			root.left = insert(root.left, key);
		}
		else {
			root.right = insert(root.right, key);
		}
		return root;
	}
	//Iterative Function of Delete key from the BST
	static TreeNode deleteIterative(TreeNode root,int key) {
		
		TreeNode curr = root;
		TreeNode parent = null;
		
		while(curr != null && curr.data != key) {
			parent = curr;
			
			if(key < curr.data) {
				curr = curr.left;
			}
			else {
				curr = curr.right;
			}
		}
		if(curr == null) {
			System.out.println("Key "+ key + " not found in the BST");
			return root;
		}
		
		//check if the node to be
		//delete has at most one child.leaf node
		
		if(curr.left == null || curr.right == null) {
			//newCurr will replace
			//the node to be deleted
			
			TreeNode newCurr;
			
			//if the left child does not exist.
			
			if(curr.left == null) {
				newCurr = curr.right;
			}else {
				newCurr = curr.left;
			}
			
			if(parent == null) return newCurr; //if you want to delete the root then handle
			
			if(curr == parent.left)
				parent.left = newCurr;
			else 
				parent.right = newCurr;
		}
		else {
			//Node to be deleted has two children
			TreeNode p = null;
			TreeNode temp;
			
			//compute the inorder successor
			
			temp = curr.right;
			while(temp.left != null) {
				p = temp;
				temp = temp.left;
			}
			if(p != null)
				p.left = temp.right;
			else
				//unlink the who want to delete the node
				curr.right = temp.right;
			
			//replace data 
			curr.data = temp.data;
		}
		return root;
	}
	public static void main(String[] args) {
		
		TreeNode root = null;
		
		root = insert(root, 10);
		root = insert(root, 7);
		root = insert(root, 5);
		root = insert(root, 8);
		root = insert(root, 15);
		root = insert(root, 11);
		root = insert(root, 18);
		
		System.out.println("Inorder traversal of original BST.");
		inorder(root);
		System.out.println("\n");
		
		//delete node with data value l1(leaf)
		
		root = deleteIterative(root, 15);
		System.out.println("Deletion of 11");
		System.out.println("Inorder traversal after deletion:");
		inorder(root);
		
	}

}
