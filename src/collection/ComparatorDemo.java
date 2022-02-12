package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Emp1{
	private int eid;
	private String name;

	public int getEid() {
		return eid;
	}

	public String getName() {
		return name;
	}

	public Emp1(int eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Emp1 [eid=" + eid + ", name=" + name + "]";
	}
	


}
class Emp1Comp implements Comparator<Emp1>{
	@Override
	public int compare(Emp1 o1, Emp1 o2) {
		Emp1 e1 = (Emp1) o1;
		Emp1 e2 = (Emp1) o2;
		if (e1.getEid() == e2.getEid()) {
			return 0;
		} else if (e1.getEid() > e2.getEid()) {
			return 1;
		} else {
			return -1;
		}
	}
}

public class ComparatorDemo {
	public static void main(String[] args) {
		ArrayList<Emp1> al = new ArrayList<Emp1>();
		al.add(new Emp1(20, "Ganesh"));
		al.add(new Emp1(19, "Kiran"));
		al.add(new Emp1(18, "Mahesh"));
		al.add(new Emp1(22, "Ram"));

		System.out.println(al);
//
		Collections.sort(al, new Emp1Comp());
		System.out.println(al);
//
//		Collections.sort(al, Collections.reverseOrder());
//		System.out.println(al);

	}
}
