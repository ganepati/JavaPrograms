package arrays;

import java.util.Arrays;

public class ArrayMinMax {
	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 25, 15 };
		int min = a[0], max = a[0];

		for (int i = 1; i < a.length; i++) {
			// System.out.println(a[i]);
			if (a[i] > max) {
				max = a[i];
			}
		}
		for (int i = 1; i < a.length; i++) {
			// System.out.println(a[i]);
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Array Max element:" + max);
		System.out.println("Array Min element:" + min);

		int maxx = Arrays.stream(a).max().getAsInt();
		
		System.out.println(maxx);
		int minn = Arrays.stream(a).min().getAsInt();
		System.out.println(minn);
	}

}
