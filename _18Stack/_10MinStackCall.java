package _18Stack;

public class _10MinStackCall {

	public static void main(String[] args) throws Exception{
		
		MinStackOofN q = new MinStackOofN();
		
		q.push(10);
		q.push(20);
		q.push(30);
		q.push(40);
		q.push(4);
		q.push(60);
		
		System.out.println(q.min());
		System.out.println(q.pop());
	}

}
