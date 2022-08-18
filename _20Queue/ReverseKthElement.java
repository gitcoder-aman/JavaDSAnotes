package _20Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class ReverseKthElement {

	static Queue<Integer> reverseKth(Queue<Integer>q,int k) {
		
		if(q.isEmpty() || k <= 0 || k > q.size()) return q;
		
		ArrayDeque<Integer>stack = new ArrayDeque<>();
		
	    //pushes kth element in stack
		for(int i = 0; i<k; i++) {	
			stack.push(q.poll());
		}

		//add all element in queue from stack
		while(!stack.isEmpty()) {
			q.add(stack.pop());
		}
		
		//add kth element poll in queue and add in itself.
		for(int i = 0; i < q.size() - k; i++) {
			q.add(q.poll());
		}
		return q;
		
	}
	public static void main(String[] args) {

		Queue<Integer>q = new LinkedList<Integer>();
		
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(60);
		
		System.out.println("Befor Reverse kth Element");
		System.out.println(q);
		
		Queue<Integer>queue = reverseKth(q,3);
		
		System.out.println("After Reverse kth Element");
		System.out.println(queue);	
	}

}
