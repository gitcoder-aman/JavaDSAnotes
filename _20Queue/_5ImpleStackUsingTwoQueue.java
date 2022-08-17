package _20Queue;


public class _5ImpleStackUsingTwoQueue {

	static class myStack{
		
		int rear,front;
		int a[];
		int n;
		
		public myStack(int n) {
			 rear = front = -1;
			 a = new int[n];
			 this.n = n;
			 
		}
		void enqueue(int data) throws Exception{
			
			if(isFull()) throw new Exception("Queue is Full");
			
			if(isEmpty()) {
				front = 0;
			}
			rear = (rear+1)%n;
			a[rear] = data;
 			
		}
		int dequeue() throws Exception{
			
			if(isEmpty()) throw new Exception("Queue is Empty");
			
			int lastElement = a[rear];
			rear--;
			
			return lastElement;
		}
		boolean isFull() {
			
			return (rear+1)%n == front;
		}
		boolean isEmpty() {
			return rear == -1;
		}
	}
	public static void main(String[] args) throws Exception{

		myStack q = new myStack(4);
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		
//		System.out.println(q.dequeue());
		
	}

}
