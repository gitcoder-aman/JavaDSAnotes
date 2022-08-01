package _17DoubtHashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.print.attribute.standard.MediaSize.Other;

import org.w3c.dom.html.HTMLTableColElement;

public class ComparatorComparable {

	static class Student implements Comparable<Student>{
		int rollNo;
		String nameString;
		
		public Student(int rollNo, String nameString) {
	
			this.rollNo = rollNo;
			this.nameString = nameString;
		}

		@Override
		public String toString() {
			return "Student [rollNo=" + rollNo + ", nameString=" + nameString + "]";
		}

		@Override
		public int compareTo(Student that) {
			
//			if(this.rollNo < that.rollNo) return -1; //doesn't matter whatever you return number just check +ve or -ve
//			if(this.rollNo > that.rollNo) return 1;
			
			return this.rollNo - that.rollNo;
		}
	}
	
	static class StudentNameComparator implements Comparator<Student>{

		@Override
		public int compare(Student s1, Student s2) {
			
			return s1.nameString.compareTo(s2.nameString);
		}
		
	}
	public static void main(String[] args) {

		Student s2 = new Student(2,"Bob");
		Student s1 = new Student(1,"Rakesh");  
		Student s3 = new Student(3,"Anuj"); 
		Student s4 = new Student(8,"Anuj");
		Student s5 = new Student(12,"Anuj"); 
		Student s6 = new Student(11,"Aman"); 
		
		ArrayList<Student>list = new ArrayList<>();
		
		list.add(s4);
		list.add(s5);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s6);
		
		//Collections.sort(list);
		
		//Collections.sort(list,new StudentNameComparator());
		//through anonymous class make
		
		//ek baar rista bnao fir saare riste nate khatam kro thats work of anonymous class
		Collections.sort(list,new Comparator<Student>() {
			

			@Override
			public int compare(Student o1, Student o2) {
				
				if(o1.nameString.equals(o2.nameString)) //StringNames are equals then sort rollNo wise.
				return o1.rollNo - o2.rollNo;
				
				return o1.nameString.compareTo(o2.nameString); //Otherwise sort alphabetically
			}
			
		});
		
		//lambda Expression when you use only one method is present then use lambda Expression
		
		//Collections.sort(list,(o1,o2) -> o1.nameString.compareTo(o2.nameString));
	
			
		System.out.println(list);
	}

}
