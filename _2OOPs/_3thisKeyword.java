package _2OOPs;
	
class Person1 {
	String name;
	int age;
	
	static int count;
	Person1() {
		count++;
		System.out.println("Person is being created");
	}
	Person1(String name,int age){
	//	this(); // Located previous Constructor
		this.name = name;
		this.age = age;
		walking(this);
	}
	void walking(Person1 obj) {
		System.out.println(name +" is walking");
		age += 10;
	}
}
public class _3thisKeyword {

	public static void main(String [] args) {
		
       Person1 p1 = new Person1("Aman",25);
       System.out.println(p1.name+ " "+ p1.age);
       System.out.println(Person.count);

    }
}
