package _20Queue;

public class _1QueueUsingLL {

	
	private Node front, rear;
	
	void enqueue(int data) {
		
		Node newNode = new Node(data);
		if(isEmpty()) {
			front = rear = newNode;
			return;
		}
		rear.next = newNode;
		rear = rear.next;
	}
	boolean isEmpty() {
		return front == null;
	}
	
	int dequeue() throws Exception{
		
		if(isEmpty()) throw new Exception("Queue is Empty");
		
		int frontData = front.data;
		front = front.next;
		return frontData;
	}
	
	int getFront() throws Exception{ //Just like peek
		if(isEmpty()) throw new Exception("Queue is Empty");
		
		return front.data;
	}
	class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data = data;
		}
	}

}
