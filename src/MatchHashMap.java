import java.io.NotActiveException;
import java.util.Arrays;
import java.util.HashMap;

public class MatchHashMap {
	static Integer[] couple = new Integer[2];
	static HashMap<Integer, Integer> numbers = new HashMap<>();
	static Integer[] array = { 6, 7, 4, 7, 4, 3, 6, 4, 5 };
	// static Integer[] array = { 6, 6, 6, 4, 4, 4 };
	static int target = 10;
	static boolean notStop = false;

	public static void main(String[] args) {
		System.out.println("The pairs of " + target + " from " + Arrays.toString(array) + " are");
		for (int i = 0; i < array.length; i++) {
			notStop = false;

			int temp = target - array[i]; // To find the second pair

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
				System.out.println(Arrays.toString(couple));

			}
		}

	}

}
