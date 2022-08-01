package _16LinkedList;


public class _1BasicLinkedList {
	
	//Traversal Linked List
	static void printLL(Node headNode) {
		
		Node currNode = headNode;
		
		while(currNode != null) {
			
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}
		
	}

	public static void main(String[] args) {
	
		Node n1 =  new Node(10);
		Node n2 =  new Node(20);
		Node n3 =  new Node(30);
		Node n4 =  new Node(40);
		Node n5 =  new Node(50);
		Node n6 =  new Node(60);
		
		Node headNode = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		
		
		printLL(headNode);
		

	}

}

