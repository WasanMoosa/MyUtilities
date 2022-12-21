import java.util.ArrayList;
import java.util.Arrays;

public class MatchSecondApproach {
	static Integer[] couple = new Integer[2];
	static ArrayList<Integer[]> fullCouple = new ArrayList<>();
	static int[] array = { 2, 3, 1, 8, 4, 6, 3 };
	static int target = 5;
	static boolean same = false;

	public static void main(String[] args) {

		for (int i = 0; i < array.length; i++) {
			for (int r = 0; r < array.length; r++) {

				if (array[i] + array[r] == target && r != i) {
					Integer[] couple = new Integer[2];
					couple[0] = array[i];
					couple[1] = array[r];

					// Check if the array is already exist in the arraylist
					same = check(couple, fullCouple);
					// Add the array of arraylist only if it is not available before
					if (!same) {
						fullCouple.add(couple);
					}

				}

			}
		}
		// print arrays from ArrayList
		for (Integer p[] : fullCouple) {
			System.out.println(Arrays.toString(p));

		}
	}

	// Check if the array is already exist in the arraylist
	static boolean check(Integer[] arr, ArrayList<Integer[]> fullCouple) {
		boolean same = false;
		for (int i = 0; i < fullCouple.size(); i++) {
			if (fullCouple.get(i)[0] == arr[0] && fullCouple.get(i)[1] == arr[1]) {
				same = true;
			}

		}

		return same;

	}

}