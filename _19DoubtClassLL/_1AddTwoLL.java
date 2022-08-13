package _19DoubtClassLL;

import _16LinkedList.*;

public class _1AddTwoLL {

	static Node reverseNode(Node head) {
		
		Node prev = null;
		Node curr = head;
		Node safe = null;
		
		while(curr != null) {
			safe = curr.next;
			curr.next = prev;
			prev = curr;
			curr = safe;
		}
		return prev;
	}
	static Node AddTwoLL(Node head1,Node head2) {
		
		Node r1 = reverseNode(head1);
		Node r2 = reverseNode(head2);
		
		Node head = null;
		int carry = 0;
		
		while(r1 != null ||  r2 != null || carry == 1) {
			
			int sum = carry;
			if(r1 != null) {
				sum += r1.data;
				r1 = r1.next;
			}
			if(r2 != null) {
				sum += r2.data;
				r2 = r2.next;
			}
			
			int digit = sum % 10;
			carry = sum/10;
			
			Node newNode = new Node(digit);
			if(head == null) {
				head = newNode;
			}else {
				newNode.next = head;
				head = newNode;
			}
			
		}
		return head;
		
	}
	public static void main(String[] args) {

		
		Node head1 = null;
		
		InsertElement obj = new InsertElement();
		
		head1 = obj.InsertNode(head1, 7, 0);
		head1 = obj.InsertNode(head1, 5, 1);
		head1 = obj.InsertNode(head1, 2, 2);
		head1 = obj.InsertNode(head1, 7, 3);
		
		
        Node head2 = null;
		
//		InsertElement list2 = new InsertElement();
		
		head2 = obj.InsertNode(head2, 2, 0);
		head2 = obj.InsertNode(head2, 6, 1);
		head2 = obj.InsertNode(head2, 3, 2);
		head2 = obj.InsertNode(head2, 6, 3);
		head2 = obj.InsertNode(head2, 4, 4);
		
		Node newHeadAfterSum = AddTwoLL(head1,head2);
		
		obj.printLL(newHeadAfterSum);
		
	}

}
