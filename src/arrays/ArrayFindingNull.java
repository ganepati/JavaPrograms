package arrays;

public class ArrayFindingNull {
	public static void main(String[] args) {
		String[] str = { "Ganesh", null, "Max", null, "Rahul" };
		for (int i = 0; i < str.length; i++) {
			// System.out.println(a[i]);
			if(str[i]==null) {
				System.out.println(i);
			}
		}
	}

}
