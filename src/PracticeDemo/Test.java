package PracticeDemo;

import java.io.IOException;
import java.util.HashMap;

public class Test {
	public static void main(String[] args) throws IOException {
		
		HashMap<String, String> hm=new HashMap<>();
		hm.put("one", "1");
		
		/*
		 * String obj="hello"; String obj1="hi"; String obj2=new String(obj);
		 * obj2="Word"; System.out.println(obj+" "+obj2);
		 */

		String obj="hello";
		String obj2=new String(obj);
		System.out.println(obj == obj2);
		System.out.println(obj.equals(obj2));

		
		
	}

}