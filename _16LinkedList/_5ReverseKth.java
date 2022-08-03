package _16LinkedList;

public class _5ReverseKth {

	static Node reverseK(Node head,int k) {
		Node curr = head,prevFirst = null,newHead = null;
		
		while(curr != null) {
			int count = 0;
			Node prev = null,first = curr;
			
			while(curr != null && count < k) {
				Node temp = curr.next;
				curr.next = prev;
				prev = curr;
				curr = temp;
				count++;
			}
			if(newHead == null) {
				newHead = prev;
			}else {
				prevFirst.next = prev;
			}
			prevFirst = first;
		}
		return newHead;
		
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
		head = obj.InsertNode(head, 16, 6);
		head = obj.InsertNode(head, 17, 7);
		
		System.out.println("Before Linked List");
		obj.printLL(head);
		
		System.out.println();
		
		Node newHead = reverseK(head, 3);
		
		System.out.println("After Linked List");
	    obj.printLL(newHead);
	}

}
