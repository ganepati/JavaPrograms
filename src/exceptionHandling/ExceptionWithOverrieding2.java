package exceptionHandling;

import java.io.IOException;

class P1{
	public void m1() throws IOException{
		System.out.println("Parent m1");

	}
}
public class ExceptionWithOverrieding2 extends P{
	
	@Override
	public void m1() {
		System.out.println("Child m1");
	}

	public static void main(String[] args) {
		
	}

}
