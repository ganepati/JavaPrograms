package interfaceAndAbstractDemo;

class Parent {
	static int geti() {
		return (1);
	}
}

public class Chaild extends Parent {
	Parent p = null;

	public void myMethod() {
		System.out.println(p.geti());
		System.out.println(Parent.geti());
	}

	public static void main(String[] args) {
		Chaild c = new Chaild();
		c.myMethod();
	}
}
