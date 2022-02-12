package PracticeDemo;


abstract class AAA{
	abstract Object m1();
	public void m2() {
		System.out.println("AAA class m2");
		
	}
	
}

/*
 * abstract class BBB extends AAA{
 * 
 * @Override public String m1() { System.out.println("m1"); return "ddd";
 * 
 * } public static void main(String[] args) {
 * System.out.println("A class Main method"); AAA a=new AB1(); a.m1(); a.m2(); }
 * 
 * }
 */
public class AB1 extends AAA{
	public void m2() {
		System.out.println("AB1 class m2");
		
	}
	@Override
	public String m1() {
		System.out.println("m1");
		return "ddd";
		
	}
	public static void main(String[] args) {
		System.out.println("A class Main method");
		AAA a=new AB1();
		a.m1();
		a.m2();
	}
	

}
