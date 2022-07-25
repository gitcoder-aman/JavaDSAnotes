package _14Hashing;

import java.util.HashSet;
import java.util.Set;

public class _2HashSetBasic {

	public static void main(String[] args) {

//		HashSet<Integer>set = new HashSet<>();
//		
//		set.add(34);
//		set.add(3);
//		set.add(4);
//		set.add(3);
//		
//		System.out.println(set);
		
		Set<Student>rollCall = new HashSet<>();
		Student s1 = new Student(1, "Aman");
		Student s2 = new Student(2, "Ankit");
		Student s3 = new Student(3, "Aman");
		
		Student s4 = new Student(1, "Aman");
		
		rollCall.add(s1);
		rollCall.add(s2);
		rollCall.add(s3);
		
		rollCall.add(s4);// s1 and s4 different - different reference allocate //set shallow check so duplicate data inserted
		System.out.println(rollCall);
		
		System.out.println(s1.hashCode());
		System.out.println(s1.hashCode());
	}
}
class Student{
	
	int rollNo;
	String nameString;
	
	public Student(int rollNo, String nameString) {
		this.rollNo = rollNo;
		this.nameString = nameString;
	}
	public String toString() {
		
		return "["+rollNo+" , "+nameString+"]";
	}
	
	//HashCode and Equals Contract
	
	@Override
	public int hashCode() {
		
		return rollNo;
	}
	@Override
	public boolean equals(Object obj) {
	
		Student that = (Student)obj;
		if(this.rollNo == that.rollNo) {
			return true;
		}
		return false;
	}
	
}
