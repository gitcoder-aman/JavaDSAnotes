package _20Queue;

public class _3QueueUsingCircularArray {

	int front, rear;
	int a[];
	int n;
	
	public _3QueueUsingCircularArray(int n) {
		front = rear = -1; //here front will be also use in circular Array
		a = new int[n];
		this.n = n;
	}
	//Time Complexity = O(1)
	void enqueue(int data) throws Exception{
		
		if(isFull()) throw new Exception("Queue Array is Full");
		
		if(isEmpty()) {
			front = 0;
		}
		rear = (rear+1) % n; //increase circular way
		a[rear] = data;
	}
	//O(1)
	int dequeue() throws Exception{
		
		if(isEmpty()) throw new Exception("Queue Array is Empty");
		
		if(front == rear) { // to check if one element only
			
		  int ans = a[front];
			front = -1;
			rear = -1;
			return ans;
		}
		int ans = a[front];
		front = (front + 1) % n; //increase circular way
		return ans;
		
	}
	private boolean isFull() {
		return (rear+1) % n == front;
	}
	boolean isEmpty() {
		return front == -1;
	}
	
	int getSize() {
		
		return isEmpty() ? 0 : (n - front + rear) % n + 1;
	}
	
}
