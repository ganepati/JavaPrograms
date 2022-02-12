package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Ganesh");
		al.add("Ramesh");
		al.add("Rakesh");
		al.add("Sainath");
		al.add("Sainath1");
		
		//String str=al.get(0);
		//System.out.println(str);
		System.out.println(al);
		ArrayList<String> al2=new ArrayList<String>(al.subList(1, 4));
		System.out.println(al2);
		Collections.swap(al2, 1, 2);
		System.out.println(al2);
		
		
	}

}
