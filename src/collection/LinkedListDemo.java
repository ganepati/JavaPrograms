package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Ganesh");
		al.add("Ramesh");
		al.add("Rakesh");
		
		System.out.println(al);
		LinkedList<String> ll=new LinkedList<>(al);
		ll.add("AAAA");
		System.out.println(ll);
	}

}
