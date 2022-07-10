package _2package1;

import _2package2.Class2;

public class Class1 {
        
	public static void main(String[] args) {
		
		Class2 obj = new Class2();
		obj.check();
		//obj.method2(); //no access because method2 is private in Class2
	}
	void method1() {
		
		
	}
}
