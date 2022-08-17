package _20Queue;

public class MainClass {

	public static void main(String[] args) throws Exception {

//		_1QueueUsingLL q = new _1QueueUsingLL();
		
//		_2QueueUsingArray q = new _2QueueUsingArray(4);
		
		_3QueueUsingCircularArray q = new _3QueueUsingCircularArray(4);
	
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.enqueue(50);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		
//		System.out.println(q.dequeue());
		
		
		System.out.println(q.getSize());
		
	}
	

}
