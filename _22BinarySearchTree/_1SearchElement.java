package _22BinarySearchTree;

//Time Complexity = O(log n)
public class _1SearchElement {

	//Space Complexity = O(log n)
	static boolean isPresent(BSTNode root,int key) {
		
		if(root == null) return false;
		
		System.out.println(root.data);
		if(root.data == key) return true;
		
		if(key > root.data) {
			return isPresent(root.right, key);
		}
		else {
			return isPresent(root.left, key);
		}
	}
	//Space Complexity = O(1)
	public  boolean isPresentIterative(BSTNode root,int key) {
		
		BSTNode curr = root;
		
		while(curr != null) {
			if(curr.data == key) return true;
			
			if(key > curr.data) curr = curr.right;
			else curr = curr.left;
		}
		return false;
	}
//	public static void main(String[] args) {
//		
//		Node root = new Node(50);
//		
//		root.left = new Node(30);
//		root.right = new Node(80);
//		root.left.left = new Node(20);
//		root.left.right = new Node(40); 
//		root.right.left = new Node(70);
//		root.right.right = new Node(100);
//		root.right.left.left = new Node(60);
//		
//		int key = 60;
//		
//		System.out.println(isPresent(root, key));
//		System.out.println(isPresentIterative(root, key));
//
//	}
}
//class Node{
//	int data;
//	Node left, right;
//	public Node(int data) {
//		this.data = data;
//	}
//}
