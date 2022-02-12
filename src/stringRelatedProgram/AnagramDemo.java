package stringRelatedProgram;

import java.util.Arrays;

public class AnagramDemo {
	public static void main(String[] args) {
		// Java Program to Check if two strings are anagram
		String str1 = "Race";
		String str2 = "care";

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		if (str1.length() == str2.length()) {
			char[] charArray1 = str1.toCharArray();
			char[] charArray2 = str1.toCharArray();

			Arrays.sort(charArray1);
			Arrays.sort(charArray2);

			if (Arrays.equals(charArray1, charArray2)) {
				System.out.println(str1 + " and " + str2 + " are anagram.");
			} else {
				System.out.println(str1 + " and " + str2 + " are not anagram.");
			}

		} else {
			System.out.println(str1 + " and " + str2 + " are not anagram.");
		}

	}

}
