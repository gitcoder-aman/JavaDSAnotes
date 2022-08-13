package _16LinkedList;


 class InsertElement {

	 Node InsertNode(Node head,int data,int pos) {
		
		Node newNode = new Node(data);
		
		if(pos == 0) {
			newNode.next = head;
			head = newNode;
			return head;
		}
		
			Node curr = head;
			for(int i = 0; i < pos-1; i++) {
				curr = curr.next;
				if(curr == null) return head;
			}
			newNode.next = curr.next;
			curr.next = newNode;
		    return head;
		
	}
	 void printLL(Node head) {
		Node currNode = head;
		
		while(currNode != null) {
			System.out.print(currNode.data);
			if(currNode.next != null) {
				System.out.print("->");
			}
			currNode = currNode.next;
		}
	}
//	public static void main(String[] args) {
//
//		
//		Node head = null;
//		
//	     head = InsertNode(head, 10, 0);
//		 head = InsertNode(head, 11, 1);
//		 head = InsertNode(head, 12, 2);
//		 head = InsertNode(head, 13, 3);
//		
//		
//		printLL(head);
//	}
	

}
