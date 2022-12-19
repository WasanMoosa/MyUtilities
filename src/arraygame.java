import java.util.*;

public class arraygame {

	public static void main(String[] args) {
		int[] array = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 6, 6, 0 };
		ArrayList<Integer> number = new ArrayList<>();
		boolean empty = false;
		int count = 0;
		boolean stop = false;

		for (int i = 0; i < array.length; i++) {
			number.add(array[i]);
		}

		for (int i = 0; i < array.length && !empty; i++) {
			stop = false;
			for (int r = 0; r < i; r++) {
				if (array[i] == array[r]) {

					stop = true;
				}
			}

			count = 0;
			if (number.isEmpty()) {
				empty = true;
			}
			for (int p = 0; p < number.size() && !stop;) {
				if (array[i] != number.get(p)) {
					p++;
				} else {
					count++;
					number.remove(p);
				}

			}
			if (!stop) {
				System.out.print(array[i] + " appears ");
				System.out.println(count + " times");
			}
		}

	}
}
