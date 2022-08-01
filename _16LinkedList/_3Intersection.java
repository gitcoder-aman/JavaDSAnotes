package _16LinkedList;

public class _3Intersection {
		
	//Traversal Linked List
		static void printLL(Node headNode) {
			
			Node currNode = headNode;
			
			while(currNode != null) {
				
				System.out.print(currNode.data + " -> ");
				currNode = currNode.next;
			}
			
		}
	static Node intersection(Node l1,Node l2){
		
		Node headNode = null;
		Node currNode = null;
		
		while(l1 != null && l2 != null) {
			if(l1.data == l2.data) {
				if(headNode == null) { // only first time execute
					headNode = new Node(l1.data);
					currNode = headNode;
				}
				else {
					currNode.next = new Node(l1.data);
					currNode = currNode.next;
				}
				l1 = l1.next;
				l2 = l2.next;
			}
			else if(l1.data < l2.data) {
				l1 = l1.next;
			}
			else {
				l2 = l2.next;
			}
		}
		return headNode;
	}
	public static void main(String[] args) {
		
		//first linked list created
		Node n1 =  new Node(10);
		Node n2 =  new Node(20);
		Node n3 =  new Node(30);
		Node n4 =  new Node(40);
		Node n5 =  new Node(50);
		Node n6 =  new Node(60);
		
		//second linked list created
		Node n7 =  new Node(40);
		Node n8 =  new Node(50);
		Node n9 =  new Node(30);
		Node n10 =  new Node(60);
		Node n11 =  new Node(70);
		Node n12 =  new Node(80);
		
		
		Node headNode1 = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		
		printLL(headNode1);
		System.out.println();
		
		Node headNode2 = n7;
		n7.next = n8;
		n8.next = n9;
		n9.next = n10;
		n10.next = n11;
		n11.next = n12;
		
		printLL(headNode2);
		System.out.println();
		
		Node ansHeadNode = intersection(headNode1,headNode2);
				
	    printLL(ansHeadNode);
	}
}
