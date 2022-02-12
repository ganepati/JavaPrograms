package javaInterviewProgram;

import java.util.LinkedList;
import java.util.TreeSet;

public class Test {
	public static void main(String args[]) {
		/*
		 * String s1 = new String("Hello"); String s2 = new String("Hellow");
		 * System.out.println(s1 + s2);
		 */
		
		//System.out.println(s1 + s2);
		/*
		 * int a[]= {12,}; System.out.println(a.length);
		 */
		TreeSet<String> t=new  TreeSet<String>();
		t.add("acd");
		t.add("aaa");
		t.add("bas");
		t.add("cac");
		t.add("acd");
		System.out.println(t.floor("abc"));
		System.out.println(t.ceiling("aca"));
		System.out.println(t.higher("aab"));
		
		System.out.println(t.floor("abc")+t.ceiling("aca")+t.higher("aab"));
		
		/*
		 * LinkedList<String> o=new LinkedList<>(); o.add("A"); o.add("B");
		 * o.addLast("C"); o.add(2, "D"); o.add("E"); o.add("F"); o.remove("B");
		 * o.remove(3); o.removeFirst(); o.removeLast(); int size=o.size(); Object
		 * e=o.get(1); o.set(1, "Y"); System.out.println(o);
		 */
		
		
		
		
	}

}
/*
 * class test1 extends Test{
 * 
 * }
 */
