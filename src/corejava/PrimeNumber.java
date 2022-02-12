package corejava;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println(prime(23) ? "Prime Number" : "Not prime Number");
	}

	private static boolean prime(int no) {
		boolean result = true;
		for (int i = 2; i < no; i++) {

			if (no % i == 0) {
				result = false;
				break;
			}
		}
		return result;
	}

}
