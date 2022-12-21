import java.util.*;

public class Match {
	static Integer[] couple = new Integer[2];
	static ArrayList<String> fullCouple = new ArrayList<>();
	static int[] array = { 2, 3, 1, 8, 4, 6, 3 };
	static int target = 5;

	public static void main(String[] args) {

		for (int i = 0; i < array.length; i++) {
			for (int r = 0; r < array.length; r++) {

				if (array[i] + array[r] == target && r != i) {

					couple[0] = array[i];
					couple[1] = array[r];
					if (!fullCouple.contains(Arrays.toString(couple))) {
						fullCouple.add(Arrays.toString(couple));
						// System.out.println((fullCouple.get(0)));
					}

				}

			}

		}
		// print arrays from ArrayList
		for (String p : fullCouple) {
			System.out.println(p);

		}

	}
}
