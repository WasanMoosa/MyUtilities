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
		System.out.println("======================");

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
	 * This Function take Hashmaps, and base power.
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
	public static int facturialNum (int number) {
		int result=0;
		for (int i=number; i>0; i--) {
			
		}
		

		return 0;
		}


	private static void displayResult(HashMap<String, ArrayList<Integer>> evenodd) {
		for (String currentkey : evenodd.keySet()) {
			System.out.println(currentkey + evenodd.get(currentkey));
		}

	}

}
