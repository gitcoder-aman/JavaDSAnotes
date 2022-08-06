package _16LinkedList;


public class _9PalindromeLL {

	static Node midFind(Node head) {
		
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null) {
			
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	static boolean palindrome(Node head) {
		
		Node midNode = midFind(head);
		
		Node left = head;
		
		//Reverse LL from Mid Node
		Node curr = midNode;
		Node temp = null;
		Node prev = null;
		while(curr != null) {
			temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		
		Node right = prev;
		
		while(right != null) {
			if(left.data == right.data) {
				left = left.next;
				right = right.next;
			}
			else {
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {

		    Node head = null;
			
			InsertElement obj = new InsertElement();
			head = obj.InsertNode(head, 3, 0);
		    head = obj.InsertNode(head, 1, 1);
			head = obj.InsertNode(head, 2, 2);
			head = obj.InsertNode(head, 2, 3);
			head = obj.InsertNode(head, 1, 4);
			head = obj.InsertNode(head, 3, 5);
			
			
			System.out.println(palindrome(head)); 
		

	}

}
