package _16LinkedList;

public class _4ReverseLL {

	static Node reversLL(Node head) {
		
		Node curr = head,prev = null;
		
		while(curr != null) {
			
			Node temp = curr.next; //kho n jaye aage wala linkedlist
			curr.next = prev;
			prev = curr;
			curr = temp; //move second element of linked list
		}
		return prev;
	}
	static Node reverseRecursiveLL(Node head) {
		
		if(head == null || head.next == null) {
			return head;
		}
		Node temp = head.next;
		
		Node newHeadNode = reverseRecursiveLL(head.next);
		temp.next = head;
		head.next = null;
		return newHeadNode;
	}
	public static void main(String[] args) {
		
		
		Node head = null;
		
		InsertElement obj = new InsertElement();
		head = obj.InsertNode(head, 10, 0);
	    head = obj.InsertNode(head, 11, 1);
		head = obj.InsertNode(head, 12, 2);
		head = obj.InsertNode(head, 13, 3);
		head = obj.InsertNode(head, 14, 4);
		head = obj.InsertNode(head, 15, 5);
		
		System.out.println("Before Reversing Linked List");
		obj.printLL(head);

		Node afterReverseHead = reversLL(head);
		
		System.out.println();
		System.out.println("After Reversing Linked List");
		obj.printLL(afterReverseHead);
		
		System.out.println();
		System.out.println("After Again Reverse through Recursive method");
		Node newHeadNode = reverseRecursiveLL(afterReverseHead);
		obj.printLL(newHeadNode);
		
		
	}

}
