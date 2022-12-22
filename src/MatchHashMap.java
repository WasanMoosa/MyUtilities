import java.util.*;

/**
 * This class can be used to process a list of numbers to generate a set of
 * pairs that adds up to a specific target (sum).
 *
 */
public class MatchHashMap {

	public static void main(String[] args) {
		Integer target = 10;
		ArrayList<Integer[]> resultStore = new ArrayList<>();
		

        // Case 1
        resultStore = getMatchingPairsArrayList(new Integer[] { 6, 6, 6, 4, 4, 4, 4, 6, 6}, target);
        System.out.println("The pairs are");
        displayResult(resultStore);
        
        // Case 2
        resultStore = getMatchingPairsArrayList(new Integer[] { 6, 6, 6, 4, 4, 4, 5 }, target);
        System.out.println("The pairs are");
        displayResult(resultStore);
        
        // Case 3
        resultStore = getMatchingPairsArrayList(new Integer[] { 3, 7, 5, 5, 2, 8, 9 }, target);
        System.out.println("The pairs are");
        displayResult(resultStore);
        
        // Case 4
        resultStore = getMatchingPairsArrayList(new Integer[] { 6, 7, 4, 3, 4, 5, 6 }, target);
        System.out.println("The pairs are");
        displayResult(resultStore);
        
	
		//resultStore = getMatchingPairsArrayList(array, target);

//		for (Integer[] currentPair : resultStore) {
//			System.out.println(currentPair[0] + " - " + currentPair[1]);
//		}

	}
	
	
	/** This method will process an array of integers, then will generate pairs that
     * will add up to a specific target.
     * 
	 * @param array collection of numbers
	 * @param target Number that would be acquired by adding up a pair.
	 * @return ArrayList of array
	 */

	public static ArrayList<Integer[]> getMatchingPairsArrayList(Integer[] array, Integer target) {
		boolean notStop = false;
		Integer[] couple = new Integer[2];
		ArrayList<Integer[]> resultStore = new ArrayList<>();
		HashMap<Integer, Integer> numbers = new HashMap<>();

		for (int i = 0; i < array.length; i++) {
			notStop = false;

			Integer temp = target - array[i]; // To find the second pair

			if (numbers.containsKey(array[i])) {
				numbers.put(array[i], numbers.get(array[i]) + 1); // Increment the number of appearance of number
			} else
				numbers.put(array[i], 1);

			// Print only if find pairs
			if (temp == array[i] && numbers.get(temp) < 2) {
				notStop = true;
			}

			if (numbers.get(temp) != null && numbers.get(temp) != 0 && numbers.get(array[i]) != 0 && !notStop) {
				numbers.put(array[i], numbers.get(array[i]) - 1); // Decrement the number of appearance of number
				numbers.put(temp, numbers.get(temp) - 1); // Decrement the number of appearance of number
				couple[0] = temp;
				couple[1] = array[i];
				resultStore.add(new Integer[] { couple[0], couple[1] });

			}

		}
		return resultStore;
	}
	
	private static void displayResult(ArrayList<Integer[]> inputArrayList) {
		for (Integer[] currentPair : inputArrayList) {
			System.out.println(currentPair[0] + " - " + currentPair[1]);
		}

	}
}
