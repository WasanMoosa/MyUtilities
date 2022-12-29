public class Scope {

	public static void main(String[] args) {
		String firstName = "miuim";
		System.out.println("Main Return: " + isPalindrome(firstName));

	}

	/**
	 * 
	 * @param input
	 * @return
	 */
	public static boolean isPalindrome(String input) {

		if (true) {

			if (true) {
				 i = 101;
				System.out.println(i); // 101
			}
			System.out.println(i); // 0
		}

		System.out.println(i); // 0

		return isPalindrome(input, 0);
	}

	private static boolean isPalindrome(String input, int index) {
		// MadaM
		// Base Case
		if (index > input.length() / 2) {
			return true;
		}

		// Recursive Case
		return (input.charAt(index) == input.charAt(input.length() - (1 + index))) && isPalindrome(input, index + 1);
	}

	 public static int i = 0;

}