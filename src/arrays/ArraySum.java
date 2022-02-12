package arrays;

import java.util.Arrays;

public class ArraySum {
	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 25, 15 };
//		int[] b = new int[5];
//		b[0] = 120;
//		b[1] = 220;
//		b[2] = 320;
//		b[3] = 420;
//		b[4] = 520;

		// Scanner sc = new Scanner(System.in);
		// System.out.println("Enter 5 elements");
		// System.out.println("length: a :" + a.length);
		// System.out.println("length: b :" + b.length);
//		int a[] = new int[5];
//
//		for (int i = 0; i < a.length; i++) {
//			// System.out.println(a[i]);
//			a[i] = sc.nextInt();
//		}
		System.out.println("-------------");
		int sum = 0;
		for (Integer aa : a) {
			// System.out.println(aa);
			sum += aa;
		}
		System.out.println("Sum :" + sum);
		//using java 8
		int maxx=Arrays.stream(a).sum();
		System.out.println(maxx);
//		System.out.println("-------------");
//		for (Integer bb : b) {
//			System.out.println(bb);
//		}
	}

}
