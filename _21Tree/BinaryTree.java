package _21Tree;

import java.util.Scanner;

public class BinaryTree {

	Scanner sc;
	Node rootNode;
	
	public BinaryTree() {
		sc = new Scanner(System.in);
	}
	class Node{
		int data;
		Node left,right;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	//create a binary tree and returns the root node
	Node createBinaryNode() {
		
		System.out.println("Enter Node data");
		int data = sc.nextInt();
		
		if(data == -1) return null;
		
		Node node = new Node(data);
		
		System.out.println("Enter " +data + "'s left data");
		node.left = createBinaryNode();
		
		System.out.println("Enter " +data + "'s right data");
		node.right = createBinaryNode();
		
		return node;
	}
	
	void inOrderTraversal(Node root) { // LNR
		
		if(root == null) return;
		
		inOrderTraversal(root.left);
		
		System.out.print(root.data + " ");
		
		inOrderTraversal(root.right);
	}
	
	void preOrderTraversal(Node root) { // NLR
		
		if(root == null) return;
		
		System.out.print(root.data + " ");
		
		preOrderTraversal(root.left);
		
		preOrderTraversal(root.right);
	}
	
	void postOrderTraversal(Node root) { // LRN
		
		if(root == null) return;
		
		postOrderTraversal(root.left);
		
		postOrderTraversal(root.right);
		
		System.out.print(root.data + " ");
	}
	//Time O(n) Space O(n)
	int heightOfBinaryTree(Node root) {
		
		if(root == null) return 0;
		
		int lh = heightOfBinaryTree(root.left);
		int rh = heightOfBinaryTree(root.right);
	   
		return Math.max(lh, rh) + 1;
	}
	
	void printNodesAtKDistance(Node root,int k) {
		
		if(root == null) return;
		
		if(k == 0) {
			System.out.println(root.data);
			return;
		}
		
		printNodesAtKDistance(root.left, k-1);
		printNodesAtKDistance(root.right, k-1);
	}
}
