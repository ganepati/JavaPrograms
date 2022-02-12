package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("VVV");
		al.add("RRR");
		al.add("GGG");
		al.add("AAA");
		al.add("SSS");
		
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		
	}

}
