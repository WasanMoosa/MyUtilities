
public class DuplicateNumber {

	public static void main(String[] args) {
		int[] array = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 6, 6, 0 };
		int count = 0;
		boolean stop = false;

		for (int i = 0; i < array.length; i++) {
			stop = false;
			for (int r = 0; r < i; r++) {
				if (array[i] == array[r]) {

					stop = true;
				}
			}

			count = 0;
			for (int p = 0; p < array.length && !stop; p++) {
				if (array[i] == array[p]) {
					count++;
				}
			}
			if (count != 0) {
				System.out.print(array[i] + " appears ");
				System.out.println(count + " times");
			}
		}

	}
}
