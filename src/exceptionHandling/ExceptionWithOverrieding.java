package exceptionHandling;

class P{
	public void m1() {
		System.out.println("Parent m1");

	}
}
public class ExceptionWithOverrieding extends P{
	
	@Override
	public void m1() throws RuntimeException {
		System.out.println("Child m1");
	}

	public static void main(String[] args) {
		
	}

}
