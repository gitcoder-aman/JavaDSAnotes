package _16LinkedList;


class DDLNode{
	
	DDLNode next;
	int data;
	DDLNode prev;
	DDLNode(int data) {
		this.prev = null;
		this.data = data;
		this.next = null;
	}
}

public class DoublyLinkedList {

	static DDLNode NodeinsertTail(DDLNode tail,int data) {
		
		//if(head == null || head.next == null) return head;
		DDLNode newNode = new DDLNode(data);
		
		if(tail == null) {
			tail = newNode;
			return tail;
		}
		else {

			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		
		return tail;
	}
	static DDLNode NodeinsertHead(DDLNode head,int data) {
		
		DDLNode newNode = new DDLNode(data);
		if(head == null) {
			head = newNode;
			return head;
		}
		else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
			
		}
		return head;
	}
	static DDLNode NodeinsertAtPos(DDLNode head,int pos,int data) {
		
		if(pos == 0) {
	    	DDLNode newHead = NodeinsertHead(head, data);
			return newHead;
		}
		else {
			DDLNode curr = head;
			int cnt = 1;
			while(cnt != pos) {
				curr = curr.next;
				cnt++;
			}
			if(curr == null) 
				return head;
			
			 if(curr.next == null) {
			   DDLNode newNode = new DDLNode(data);
			   //link in last position
			   curr.next = newNode;
			   newNode.prev = curr;
			   curr = newNode;
			   return head;
			}
		
			
			//creating a node for any specific position
			
          DDLNode nodeToinsert = new DDLNode(data);
          
          //before right side link in next node (Don't loss forward data)
          nodeToinsert.next = curr.next;
          curr.next.prev = nodeToinsert;
          
          //then left side link in previous node
          curr.next = nodeToinsert;
          nodeToinsert.prev = curr;
		}
		return head;
	}
	static DDLNode deleteNode(DDLNode head,int pos) {
		
		if(pos == 0) {
			DDLNode curr = head;
			curr.next.prev = null;
			head = curr.next;
			curr.next = null;
			return head;
		}
		else {
			DDLNode curr = head;
			int cnt = 1;
			while(cnt != pos) {
				curr = curr.next;
				cnt++;
			}
			if(curr == null) 
				return head;
			
			curr.next.prev = null;
			curr.next = curr.next.next;
		}
		return head;
	}
	static void printDoublyLL(DDLNode head) {
		if(head == null) return;
		
		DDLNode curr = head;
		while(curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
	
		}
	}
	public static void main(String[] args) {

		DDLNode head = null;
//		DDLNode tail = null;
		
//		  tail = NodeinsertTail(tail, 10);
////		  head = tail; // first head Node store in head
//		  tail =  NodeinsertTail(tail, 20);
//		  tail =  NodeinsertTail(tail, 30);
//		  tail =  NodeinsertTail(tail, 40);
//		  tail =  NodeinsertTail(tail, 50);
//		
//		printDoublyLL(head);

//		head = NodeinsertHead(head, 10);
//		head = NodeinsertHead(head, 20);
//		head = NodeinsertHead(head, 30);
//		head = NodeinsertHead(head, 40);
//		
//		printDoublyLL(head);
		
		head = NodeinsertAtPos(head, 0, 10);
		head = NodeinsertAtPos(head, 1, 20);
		head = NodeinsertAtPos(head, 2, 30);
		head = NodeinsertAtPos(head, 3, 40);
		head = NodeinsertAtPos(head, 4, 50);
		
		
		head = NodeinsertAtPos(head,5, 100);
		
		printDoublyLL(head);
		
		System.out.println();
		head = deleteNode(head, 5);
		printDoublyLL(head);
	
		
	}

}
