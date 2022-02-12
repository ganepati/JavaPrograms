package collection;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push("A");
		s.push("B");
		s.push("C");
		System.out.println(s);
		s.pop();
		System.out.println(s.search("D"));
		System.out.println(s);
		System.out.println(s.peek());

	}

}
