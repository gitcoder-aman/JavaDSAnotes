package _21Tree;

import java.util.ArrayList;

import _21Tree.BinaryTree.Node;

public class _7AncestorBinaryTree {

	public  ArrayList<Integer>Ancestor(Node root, int target){
		
		ArrayList<Integer>ans = new ArrayList<>();
		
		isPresent(root, target, ans);
		return ans;
	}
	public static boolean isPresent(Node root,int target,ArrayList<Integer>ans) {
		
		if(root == null) return false;
		
		if(root.data == target) {
			return true;
		}
		if(isPresent(root.left, target, ans) || isPresent(root.right, target, ans)) {
			
			ans.add(0,root.data);
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		
		BinaryTree bTree = new BinaryTree();
		Node node = bTree.createBinaryNode();
		
		_7AncestorBinaryTree obj = new _7AncestorBinaryTree();
		ArrayList<Integer>ans = obj.Ancestor(node, 7);
		System.out.println(ans);

	}

}
