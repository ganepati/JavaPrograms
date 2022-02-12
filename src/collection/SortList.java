package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortList{
	public static void main(String[] args) {
		/*
		 * String str="AABBBCCCCCCD"; //AA2BBB3CCCCC6D1 //A2B3C6D1
		 * 
		 * for(int i=0;i<str.length();i++) { if() System.out.println(str.charAt(i)); }
		 */
		List<Integer> li=new ArrayList<>();
		li.add(20);
		li.add(25);
		li.add(10);
		li.add(5);
		System.out.println(li);
		Collections.sort(li);
		System.out.println(li);
		
		List l=li.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("Sorted using Strem"+l);
	}

}
