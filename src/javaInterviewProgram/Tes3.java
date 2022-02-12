package javaInterviewProgram;

class H{
	public static void m1() {
		System.out.println("M1 in H");

	}
}
class hi extends H{
//	public void m1() throws ClassCastException{
//		// TODO Auto-generated method stub
//
//	}
}
public class Tes3 {
	public static void main(String[] args) {
		H h=new hi();
		h.m1();
	}

}
