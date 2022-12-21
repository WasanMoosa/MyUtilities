import java.awt.Checkbox;
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

					same = check(couple, fullCouple);
					if (!same) {
						fullCouple.add(couple);
						// System.out.println((fullCouple.get(0)));
					}

				}

			}
		}
		// print arrays from ArrayList
		for (Integer p[] : fullCouple) {
			System.out.println(Arrays.toString(p));

		}
	}

	static boolean check(Integer [] arr, ArrayList<Integer[]> fullCouple) {
		boolean same = false;
		for (int i = 0; i < fullCouple.size(); i++) {
			if (fullCouple.get(i)[0] == arr[0] && fullCouple.get(i)[1] == arr[1]) {
				same = true;
			}

		}

		return same;

	}

}