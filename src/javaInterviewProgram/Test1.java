package javaInterviewProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
	/*
	 * public static void main(String[] args) { Thread t =new MyThread(); t.run();
	 * t.start(); System.out.println("M"); }
	 * 
	 * } class MyThread extends Thread{
	 * 
	 * @Override public void run() { System.out.println("Ch"); } }
	 */
	public static void main(String[] args) {
		List<Integer> l =new ArrayList<>();
		//add(list);
		l.add(90);
		l.add(46);
		l.add(40);
		l.add(25);
		l.add(6);
int p=Collections.binarySearch(l, 25, Collections.reverseOrder());
System.out.println(p);
	}

	/*
	 * private static void //add(List<A> list) { // TODO Auto-generated method stub
	 * 
	 * }
	 */
}

class A {
}

class B extends A {

}