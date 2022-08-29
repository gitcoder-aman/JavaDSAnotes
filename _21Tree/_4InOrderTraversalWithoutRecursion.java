package _21Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

import _21Tree.BinaryTree.Node;

public class _4InOrderTraversalWithoutRecursion {

	  public List<Integer> inorderTraversal(Node root) { //LNR
	        
	        List<Integer>ans = new ArrayList<>();
	        ArrayDeque<Node>stack = new ArrayDeque<>();
	        
	        Node curr = root;
	        
	        while(curr != null || !stack.isEmpty()){

	            while(curr != null){
	                stack.push(curr);
	                curr = curr.left;
	            }
	            Node pop = stack.pop();
	            ans.add(pop.data);
	            
	            curr = pop.right;
	        }
	        return ans;
	    }
	public static void main(String[] args) {
		
		//creating binary Tree
		BinaryTree bTree = new BinaryTree();
		Node root = bTree.createBinaryNode();
		
		//Calling the function
		_4InOrderTraversalWithoutRecursion obj = new _4InOrderTraversalWithoutRecursion();
		List<Integer>ans = obj.inorderTraversal(root);
		
		System.out.println(ans);

	}

}
