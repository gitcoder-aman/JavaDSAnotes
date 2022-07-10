package _2OOPs;

class Person{
	static int count;

	
	public Person() {
		count++;
		System.out.println("Person is being created");
	}
}
public class _2StaticKeyword {

	public static void main(String [] args) {
		
		Person p1 = new Person();
        Person p2 = new Person();
		
		System.out.println(Person.count);
		System.out.println(p1.count);

	}
}
