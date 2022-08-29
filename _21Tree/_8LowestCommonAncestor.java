package _21Tree;

import _21Tree.BinaryTree.Node;

public class _8LowestCommonAncestor {

	public Node LCA(Node root,int p,int q) {
		
		if(root == null) return null;
		
		if(root.data == p || root.data == q) return root;
		
		Node leftAns = LCA(root.left, p, q);
		Node rightAns = LCA(root.right, p, q);
		
		if(leftAns != null && rightAns != null) return root;
		
		else if(leftAns != null && rightAns == null) return leftAns;
		
		else if(leftAns == null && rightAns != null) return rightAns;
		
		else {
			return null;
		}
	}
	public static void main(String[] args) {
		
		BinaryTree bTree = new BinaryTree();
		Node node = bTree.createBinaryNode();
		
		_8LowestCommonAncestor obj = new _8LowestCommonAncestor();
		
		Node ans = obj.LCA(node, 5, 4);
		
		System.out.println(ans.data);

	}

}
