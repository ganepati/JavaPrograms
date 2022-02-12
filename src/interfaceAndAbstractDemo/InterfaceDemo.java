package interfaceAndAbstractDemo;

interface A {
	String name = "Ganesh";
}

interface B {
	String name = "Mangesh";
}

public class InterfaceDemo implements A, B {
	public void xyz() {
		//System.out.println(name);
		System.out.println(A.name);
	}
	
	public static void main(String[] args) {
		System.out.println(A.name);
		InterfaceDemo d=new InterfaceDemo();
		d.xyz();
	}
}

