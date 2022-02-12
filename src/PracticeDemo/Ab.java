package PracticeDemo;

abstract class A {
	protected abstract void m1();

	public void m2() {
		System.out.println("m2");

	}

	
}

public class Ab extends A {

	@Override
	protected void m1() {
		System.out.println("m1");

	}

	public static void main(String[] args) {
		System.out.println("Ab class Main method");
		A a = new Ab();
		a.m2();
		a.m2();
	}

}
