package _15InternalWorkingOfHashMap;

import java.util.Objects;

public class MainClass {

	public static void main(String[] args) {

		String s1 = "CAT";
		String s2 = "ACT";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
	}

}
class Student{
	String nameString;
	int rollNo;
	@Override
	public int hashCode() {
		return Objects.hash(nameString, rollNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(nameString, other.nameString) && rollNo == other.rollNo;
	}
}