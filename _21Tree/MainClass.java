package _21Tree;

import _21Tree.BinaryTree.Node;

public class MainClass {

	public static void main(String[] args) {
		
		 BinaryTree bTree = new BinaryTree();
		 
		 Node root = bTree.createBinaryNode();
//		 bTree.inOrderTraversal(root);
		 
//		 bTree.preOrderTraversal(root);
		 
//		 bTree.postOrderTraversal(root);
		 
//		 System.out.println(bTree.heightOfBinaryTree(root));
	
		 bTree.printNodesAtKDistance(root, 2);
	}

}
