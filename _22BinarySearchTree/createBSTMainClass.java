package _22BinarySearchTree;

public class createBSTMainClass {

	public static void main(String[] args) {
		
		BinarySearchTree bSearchTree = new BinarySearchTree();
		
		BSTNode root = new BSTNode(50);
	       bSearchTree.insertBstNode(root,70);
	       bSearchTree.insertBstNode(root,10);
	       bSearchTree.insertBstNode(root,60);
	       bSearchTree.insertBstNode(root,30);
		
		_1SearchElement searchElement = new _1SearchElement();
		System.out.println(searchElement.isPresentIterative(root, 20));
		
		System.out.println("Binary Search Tree always sorted order so inOrderTraversal");
		bSearchTree.inOrderTraversal(root);
	}

}
