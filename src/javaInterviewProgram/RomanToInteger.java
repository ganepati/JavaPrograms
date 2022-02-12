package javaInterviewProgram;

import java.util.HashMap;

public class RomanToInteger {
	public static void main(String[] args) {
		String roman = "IV";
		int result = romanToInteger(roman);
		System.out.println("Roman :" + roman + " To Integer :" + result);
	}

	private static int romanToInteger(String roman) {
		HashMap<Character, Integer> numbersMap = new HashMap<Character, Integer>();
		numbersMap.put('I', 1);
		numbersMap.put('V', 5);
		numbersMap.put('X', 10);
		numbersMap.put('L', 50);
		numbersMap.put('C', 100);
		int result = 0;

		for (int i = 0; i < roman.length(); i++) {
			char ch = roman.charAt(i); // Current Roman Character
			// Case 1
			if (i > 0 && numbersMap.get(ch) > numbersMap.get(roman.charAt(i - 1))) {
				System.out.println("numbersMap.get(ch)" + numbersMap.get(ch));
				System.out.println("numbersMap.get(roman.charAt(i-1))" + numbersMap.get(roman.charAt(i - 1)));
				System.out.println("result" + result);
				System.out.println("roman.charAt(i-1)" + roman.charAt(i - 1));
				result = result + numbersMap.get(ch) - 2 * numbersMap.get(roman.charAt(i - 1));
			}

			// Case 2: just add the corresponding number to result.
			else {
				result += numbersMap.get(ch);
				System.out.println("result :" + result);
			}
		}

		return result;
	}

}
