package _21Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

import _21Tree.BinaryTree.Node;

public class _6PostOrderIterative {

	public List<Integer> postOrderTraversal(Node root) { //LRN
		
		List<Integer>ans = new ArrayList<>();
		
		if(root == null) return ans; //because null can't store into arrayDeque
		ArrayDeque<Node>stack = new ArrayDeque<>();
		stack.push(root);
		
		while(!stack.isEmpty()) {
			
			Node curr = stack.pop();
			ans.add(0, curr.data); //reverse the arraylist
			
			if(curr.left != null) {
				stack.push(curr.left);
			}
			if(curr.right  != null) {
				stack.push(curr.right);
			}
		}
		
		return ans;
	}
	public List<Integer>UsingTwoStack(Node root){ //LRN
		List<Integer>ans = new ArrayList<>();
		if(root == null) return ans;
		ArrayDeque<Node>s1 = new ArrayDeque<>();
		ArrayDeque<Node>s2 = new ArrayDeque<>();
		
		s1.push(root);
		while(!s1.isEmpty()){
			
			Node pop = s1.pop();
			s2.push(pop);
			
			if(pop.left != null)
			s1.push(pop.left);
			
			if(pop.right != null)
			s1.push(pop.right);
		}
		while(!s2.isEmpty()) {
			ans.add(s2.pop().data);
		}
		return ans;
	}
	public static void main(String[] args) {
		BinaryTree bTree = new BinaryTree();
		Node node = bTree.createBinaryNode();
		
		_6PostOrderIterative obj = new _6PostOrderIterative();
		List<Integer>ans = obj.postOrderTraversal(node);
		
		System.out.println(ans);

	}

}
