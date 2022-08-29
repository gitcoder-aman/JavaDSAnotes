package _21Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

import _21Tree.BinaryTree.Node;

public class _5PreOrderTraversal_iterative {

	 public List<Integer> preorderTraversal(Node root) { //NLR
	        
	        List<Integer>ans = new ArrayList<>();
	        if(root == null) return ans; //because arrayDeque is not allowed insert null.
	        ArrayDeque<Node>stack = new ArrayDeque<>(); 
	        
	        //but pushes element first Right then left;
	        
	        stack.push(root);
	        while(!stack.isEmpty()){
	            
	            Node pop = stack.pop();
	            ans.add(pop.data);
	            
	            if(pop.right != null){
	                stack.push(pop.right);
	            }
	            if(pop.left != null){
	                stack.push(pop.left);
	            }
	        }
	        return ans;
	    }
	public static void main(String[] args) {
		
		BinaryTree bTree = new BinaryTree();
		Node node = bTree.createBinaryNode();
		
		_5PreOrderTraversal_iterative obj = new _5PreOrderTraversal_iterative();
		List<Integer>ans = obj.preorderTraversal(node);
		
		System.out.println(ans);
	}
}
