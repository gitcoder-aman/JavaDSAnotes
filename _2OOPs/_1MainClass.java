package _2OOPs;

class Animal{
	int legs;
	String name;
	void walk() {
		System.out.println(name + " is walking");
	}
	void walk(int steps) {  //Method OverLoading
		System.out.println(steps + " Step Counting:");
	}
	public Animal() {
		System.out.println("Default Calling the constructor");
	}
	public Animal(String newName) { //Constructor OverLoading
		System.out.println(newName +" was passed while creating");
	}
}
public class _1MainClass {
	
	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		Animal a2 = new Animal("Bob");
		
		a1.name = "Simbha";
		a1.legs = 4;
		a1.walk();
		a1.walk(6);
		
		a2.name = "Bob";
		a2.legs = 3; 
		
	   System.out.println(a1.name + " " + a1.legs);
	}

}
