package garbageCollector;

//1)Nullifying the reference variable. 
public class Student {
	public static void main(String[] args) {
		Student s = new Student();
		Student s1 = new Student();
		// No object is eligible for GC
		s = null;
		// one object is eligible for GC
		;
		;
		// Two object is eligible for GC
		s1 = null;
	}

	public Student i;    // this variable created with Test4

}

//2)Reassigning the reference variable
class Test1 {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		// No object is eligible for GC
		s1 = new Student();
		// one object is eligible for GC
		;
		;
		// Two object is eligible for GC
		s2 = s1;
	}
}

//3)Object created inside a method.

class Test2 {
	public static void main(String[] args) {
		// one object is eligible for GC
		Student s = m1();
	}

	private static Student m1() {
		Student s1 = new Student();
		Student s2 = new Student();
		return s1;
	}
}

class Test3 {
	static Student s;

	public static void main(String[] args) {
		// one object is eligible for GC
		m1();
	}

	private static void m1() {
		s = new Student();
		Student s2 = new Student();
	}
}

class Test4 {

		public static void main(String[] args) {
			// one object is eligible for GC
			Student s1 = new Student();
			Student s2 = new Student();
			Student s3 = new Student();
			s1.i = s2;
			s2.i = s3;
			s3.i = s1;
			s1 = null; // no object is eligible for GC
			s2 = null; // no object is eligible for GC
			s3 = null; // after s3=null 3 object are eligible for GC
		}
	}