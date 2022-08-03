package _16LinkedList;

//floyd's detection algorithms

public class _6DetectCycleLoop {

	
	static Node detectCycleLoop(Node head) {
		
		Node slow = head;
		Node fast = head;
		
		
		while(fast != null && fast.next != null) {
			
			slow = slow.next;
			fast = fast.next.next;
			
//			System.out.println(slow.data);
//			System.out.println(fast.data);
			
			if(slow == fast) {
				return slow;
			}
		}
		return null;
	}
	static Node getStartingNode(Node head) {
		
		if(head == null) return null;
		
		Node intersection = detectCycleLoop(head);
		
		if(intersection == null) return null;
		
		Node slow = head;
		
		while(slow != intersection) {
			
			slow = slow.next;
			intersection = intersection.next;
		}
		return slow;
	}
	static void removeLoop(Node head) {
		
		if(head == null) return;
		
		Node startOfLoop = getStartingNode(head);
		
		if(startOfLoop == null) return;
		
		Node temp = startOfLoop;
		while(temp.next != startOfLoop) {
			temp = temp.next;
		}
		
		temp.next = null;
	}
	public static void main(String[] args) {

		 Node head = new Node(1);
		 head.next = new Node(2);
		 head.next.next = new Node(3);
		 head.next.next.next = new Node(4);
		 head.next.next.next.next = new Node(5);
		 head.next.next.next.next.next = new Node(6);
		 head.next.next.next.next.next.next = new Node(7);
		 head.next.next.next.next.next.next.next = new Node(8);
		 
		 head.next.next.next.next.next.next.next.next = head.next.next.next;
		 
		 
//		 System.out.println(detectCycleLoop(head).data);
		 System.out.println("Starting cycle at "+getStartingNode(head).data);
		 
		 removeLoop(head);
		 
		 System.out.println(detectCycleLoop(head));
			
	}

}
