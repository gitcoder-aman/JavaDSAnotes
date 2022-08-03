package _16LinkedList;

public class _7ReverseKthRecursive {

	static Node Reverse(Node head,int k) {
		
		if(head == null) {
			return null;
		}
		Node current = head;
		Node prev = null;
		Node temp = null;
		
		
		int count = 0;
		
		//Reverse first k nodes of linked list
		while(count < k && current != null) {
			
			temp = current.next; //safe lose my data
			current.next = prev;
			prev = current; //prev this is head of k window
			current = temp;
			count++;
		}
		
		if(temp != null) {
			head.next = Reverse(temp, k);
		}
		return prev;
	}
	
	public static void main(String[] args) {

        Node head = null;
		
		InsertElement obj = new InsertElement();
		head = obj.InsertNode(head, 1, 0);
	    head = obj.InsertNode(head, 2, 1);
		head = obj.InsertNode(head, 3, 2);
		head = obj.InsertNode(head, 4, 3);
		head = obj.InsertNode(head, 5, 4);
		head = obj.InsertNode(head, 6, 5);
		head = obj.InsertNode(head, 7, 6);
		head = obj.InsertNode(head, 8, 7);
		
		int k = 3;
		Node afterRecusiveHead = Reverse(head,k);
		obj.printLL(afterRecusiveHead);
	}

}
