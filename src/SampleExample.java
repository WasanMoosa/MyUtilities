import java.awt.Taskbar.State;
import java.util.ArrayList;
import java.util.HashMap;

import javax.naming.spi.DirStateFactory.Result;

public class SampleExample {

	public static void main(String[] args) {

		// Task1
		Integer array[] = { 2, 3, 7, 6, 9, 4, 5, 7 };
		HashMap<String, ArrayList<Integer>> evenOdd = new HashMap<>();
		evenOdd = evenOddFunction(array);
		displayResult(evenOdd);

		// Task 2
		System.out.println("======================");
		HashMap<String, Integer> power = new HashMap<>();
		power = powerFunction();
		for (String currentkey : power.keySet()) {
			System.out.println(currentkey + " " + power.get(currentkey));
		}

		// Task 3
		System.out.println("======================");
		String sentence = "This is sentence";
		reverse(sentence);

		// Task 4
		System.out.print("\n");
		int result = 0;
		int num = 5;
		System.out.println("======================");
		result = factorialNum(num);
		System.out.println(num + "! " + " = " + result);

		// Task 4
		String word = "misim";
		boolean checker;
		System.out.println("======================");
		checker = palindrome(word);
		if (checker) {
			System.out.println("The word " + word + " is palindrome");
		} else {
			System.out.println("The word " + word + " is not palindrome");

		}
		System.out.println("======================");
		// Task 5
		ArrayList<Integer> fabonacciArrayList = new ArrayList<>();
		fabonacciArrayList = fabonacci(8);
		for (Integer numb : fabonacciArrayList) {
			System.out.println(numb);
		}

	}

	/**
	 * This Function take the array of integers, process it and produce HashMap that
	 * includes even and odd arrays
	 * 
	 * @return HashMap
	 */
	public static HashMap<String, ArrayList<Integer>> evenOddFunction(Integer[] inputarray) {
		HashMap<String, ArrayList<Integer>> evenOdd = new HashMap<>();
		ArrayList<Integer> evenArrayList = new ArrayList<>();
		ArrayList<Integer> oddArrayList = new ArrayList<>();
		int temp = 2;

		for (int i = 0; i < inputarray.length; i++) {
			if (inputarray[i] % temp == 0) {
				evenArrayList.add(inputarray[i]);
			} else {
				oddArrayList.add(inputarray[i]);

			}
			evenOdd.put("even", evenArrayList);
			evenOdd.put("odd", oddArrayList);

		}

		return evenOdd;
	}

	/**
	 * This Function take Hashmaps for exponential.
	 * 
	 * @return HashMap
	 */
	public static HashMap<String, Integer> powerFunction() {
		HashMap<String, Integer> power = new HashMap<>();
		power.put("base", 2);
		power.put("exponent", 3);
		power.put("result", 1);
		for (int i = 0; i < power.get("exponent"); i++) {
			power.put("result", power.get("result") * power.get("base"));

		}

		return power;
	}

	/**
	 * This Function take sentence and reverse it .
	 * 
	 * @return string of reversed sentence
	 */
	public static void reverse(String sentence) {
		for (int i = sentence.length() - 1; i >= 0; i--) {
			System.out.print(sentence.charAt(i));

		}

	}

	/**
	 * This Function calculate the factorial of specific number .
	 * 
	 * @return Integer of factorial number
	 */
	public static int factorialNum(int number) {
		int result = 1;
		for (int i = number; i > 0; i--) {
			result = result * i;
		}

		return result;
	}

	/**
	 * This Function check if the word is palindrome.
	 * 
	 * @return boolean
	 */
	public static boolean palindrome(String word) {
		boolean palindromeCheck = true;
		int wordLength = word.length();
		for (int i = 0; i < (wordLength / 2) && true; i++) {
			if (word.charAt(i) != word.charAt(wordLength - 1 - i)) {

				palindromeCheck = false;

			}

		}

		return palindromeCheck;
	}

	/**
	 * This Function is calculate the Fabonacci series.
	 * 
	 * @return
	 */
	public static ArrayList<Integer> fabonacci(int number) {
		ArrayList<Integer> fabonacciArrayList = new ArrayList<>();

		int state = 1;
		int result = 0;
		int temp = 0;
		for (int i = 0; i < number; i++) {

			fabonacciArrayList.add(result);
			temp = state;
			state = result;
			result = result + temp;

		}

		return fabonacciArrayList;
	}

	private static void displayResult(HashMap<String, ArrayList<Integer>> evenodd) {
		for (String currentkey : evenodd.keySet()) {
			System.out.println(currentkey + evenodd.get(currentkey));
		}

	}

}
