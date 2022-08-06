package _16LinkedList;

public class _8MergedTwoSortedLinkedList {

	static Node mergeTwoSortedLL(Node head1,Node head2) {
		
		Node head = null, tail = null;
		Node a = head1, b = head2;
		
		if(a == null) return b;
		if(b == null) return a;
		
		if(a.data <= b.data) {
			head = a;
			tail = a;
			a = a.next;
		}else {
			head = b;
			tail = b;
			b = b.next;
		}
		
		while(a != null && b != null) {
			if(a.data <= b.data) {
				tail.next = a;
				tail = a;
				a = a.next;
			}
			else {
				tail.next = b;
				tail = b;
				b = b.next;
			}
		}
		
		if(a == null) tail.next = b;
		if(b == null) tail.next = a;
			
			return head;
	}
	public static void main(String[] args) {

		    Node head1 = null;
			
			InsertElement obj = new InsertElement();
			head1 = obj.InsertNode(head1, 1, 0);
		    head1 = obj.InsertNode(head1, 3, 1);
			head1 = obj.InsertNode(head1, 5, 2);
			head1 = obj.InsertNode(head1, 6, 3);
			
			Node head2 = null;
			
			head2 = obj.InsertNode(head2, 7, 0);
			head2 = obj.InsertNode(head2, 10, 1);
			head2 = obj.InsertNode(head2, 13, 2);
			head2 = obj.InsertNode(head2, 15, 3);
			
			Node afterMergeHeadNode = mergeTwoSortedLL(head1, head2);
		
			obj.printLL(afterMergeHeadNode);
	}

}
