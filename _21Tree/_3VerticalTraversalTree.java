package _21Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

import _21Tree.BinaryTree.Node;

public class _3VerticalTraversalTree {

	  ArrayList <Integer> verticalOrder(Node root)
    {
        Map<Integer,ArrayList<Integer>>map = new TreeMap<>();
        
        if(root == null)return null;
        
        Queue<Pair>q = new LinkedList<>();
        
        q.add(new Pair(0,root));
        while(!q.isEmpty()){
            
            Pair curr = q.poll();
            
            int key = curr.hd;
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<Integer>());
            }
            map.get(key).add(curr.node.data);
            
            if(curr.node.left != null){
                q.add(new Pair(key-1 , curr.node.left));
            }
            if(curr.node.right != null){
                q.add(new Pair(key+1, curr.node.right));
            }   
        }
        ArrayList<Integer>ans = new ArrayList<>();
        for(ArrayList<Integer> e : map.values()){
            ans.addAll(e);
        }
        return ans;
        
    }
    static class Pair{
        int hd;
        Node node;
        
        public Pair(int hd,Node node){
            this.hd = hd;
            this.node = node;
        }
    }
	public static void main(String[] args) {
      
		BinaryTree bTree = new BinaryTree();
		 
		 Node root = bTree.createBinaryNode();
		 _3VerticalTraversalTree obj = new _3VerticalTraversalTree();
		 
		 List<Integer>ans = obj.verticalOrder(root);
		 
		 System.out.println(ans);
	}

}
