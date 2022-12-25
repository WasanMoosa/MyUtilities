public class RecursionPractise {

	public static void main(String[] args) {

		// Task 1: Factorial using recursion
		int r = Factorial(5);
		System.out.println(r);

		System.out.println("--------------");

		// Task 2: Reverse string using recursion
		String sentence = "This is sentence";
		reversion(sentence, sentence.length());

		System.out.print("\n");
		System.out.println("--------------");

		// Task 3: Suppose you have num=4
		// print 0 1 2 3 3 2 1 0
		pattern(4, 0);

		System.out.print("\n");
		System.out.println("--------------");

		// Task 4: palindrome
		String word = "madama";
		palindrome(word, word.length(), 0, true);
		
		System.out.print("\n");
		System.out.println("--------------");
		
		// Task 4: Fabonaki series 

	}

	/**
	 * Factorial Task using recursion
	 */

	public static int Factorial(int i) {
		if (i == 0) {

			return 1;
		}

		return i * Factorial(i - 1);
	}

	/**
	 * Reverse string Task using recursion
	 */

	public static String reversion(String sentence, int length) {
		if (length == 0) {

			return " ";
		}
		System.out.print(sentence.charAt(length - 1));

		return reversion(sentence, length - 1);
	}

	/**
	 * Task 3: Suppose you have num=4 print 0 1 2 3 3 2 1 0
	 */

	public static String pattern(int num, int start) {

		if (num == 0) {
			return " ";

		}
		if (start >= num) {
			System.out.print(num - 1);
			return pattern(num - 1, start);

		}

		System.out.print(start);

		return pattern(num, start + 1);

	}

	/**
	 * Task 4: Palindrome
	 */

	public static String palindrome(String word, int length, int start, boolean check) {

		if (start == length / 2) {

			if (check) {
				System.out.print("It is palindrome");
			}
			if (!check) {
				System.out.print("It is not palindrome");
			}
			return " ";
		}

		if (word.charAt(start) != word.charAt(length - 1 - start)) {
			check = false;
		}

		return palindrome(word, length, start + 1, check);
	}
	
	/**
	 * Task 5: Palindrome
	 */

}
