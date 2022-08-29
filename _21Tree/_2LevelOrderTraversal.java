package _21Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import _21Tree.BinaryTree.Node;

public class _2LevelOrderTraversal {


	 List<List<Integer>> levelOrder(Node root) {
	       
	        List<List<Integer>>ans = new ArrayList<List<Integer>>();
	        
	        if(root == null) return ans;
	        Queue<Node>q = new LinkedList<>();
	        
	        q.add(root);
	        q.add(null);
	        
	        ArrayList<Integer>currList = new ArrayList<>();
	    
	        while(!q.isEmpty()){
	            
	            Node curr =  q.poll();
	            if(curr == null){
	                ans.add(currList);
	                if(q.isEmpty()) return ans;
	                q.add(null);
	                
	               currList =  new ArrayList<>();
	                
	            }else{
	                
	                currList.add(curr.data);
	                if(curr.left != null)
	                    q.add(curr.left);
	                    
	                if(curr.right != null)
	                    q.add(curr.right);
	                
	            }
	        }
	     return ans;   
	    }
	public static void main(String[] args) {
	
          BinaryTree bTree = new BinaryTree();
		 
		 Node root = bTree.createBinaryNode();
		 
		_2LevelOrderTraversal btree = new _2LevelOrderTraversal();
		List<List<Integer>>ans = btree.levelOrder(root);
		
		System.out.println(ans);
		
				
		
	}

}
