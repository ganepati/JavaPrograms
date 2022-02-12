package collection;

import java.util.ArrayList;
import java.util.Collections;

class Emp implements Comparable<Emp> {
	private int eid;
	private String name;

	public int getEid() {
		return eid;
	}

	public String getName() {
		return name;
	}

	/*
	 * @Override public int compareTo(Emp o) { Emp e = (Emp) o; if (eid ==
	 * e.getEid()) { return 0; } else if (eid > e.getEid()) { return 1; } else {
	 * return -1; }
	 * 
	 * }
	 */

	@Override
	public int compareTo(Emp o) {
		return name.compareTo(o.name);
	}

	public Emp(int eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", name=" + name + "]";
	}

}

public class ComparableDemo2 {
	public static void main(String[] args) {
		ArrayList<Emp> al = new ArrayList<Emp>();
		al.add(new Emp(20,"Ganesh"));
		al.add(new Emp(19,"Kiran"));
		al.add(new Emp(18,"Mahesh"));
		al.add(new Emp(22,"Ram"));
		
		System.out.println(al);

		Collections.sort(al);
		System.out.println(al);

		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);

	}

}
