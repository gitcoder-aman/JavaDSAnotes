package _16LinkedList;


class root{
	
	int data;
	root nextNode;
	root prevNode;
	
	public root(int data) {
		this.data = data;
		this.nextNode = null;
	}

	
}
public class _1BasicLinkedList {
	
	//Traversal Linked List
	static void printLL(root headNode) {
		
		root currNode = headNode;
		
		while(currNode != null) {
			
			System.out.print(currNode.data + " -> ");
			currNode = currNode.nextNode;
		}
		
	}

	public static void main(String[] args) {
	
		root n1 =  new root(10);
		root n2 =  new root(20);
		root n3 =  new root(30);
		root n4 =  new root(40);
		root n5 =  new root(50);
		root n6 =  new root(60);
		
		root headNode = n1;
		n1.nextNode = n2;
		n2.nextNode = n3;
		n3.nextNode = n4;
		n4.nextNode = n5;
		n5.nextNode = n6;
		
		
		printLL(headNode);
		

	}

}

