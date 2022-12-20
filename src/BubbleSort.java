
public class BubbleSort {
	static int[] array = { 1, 2, 3, 4, 5 };
	static int temp = 0;

	public static void main(String[] args) {

		// Temporary variable to sort element

		for (int number : array) {
			System.out.print(number + " ");
		}
		array = arrange(array);

		System.out.print("\nThe array in descinding order\n");

		for (int number : array) {
			System.out.print(number + " ");
		}
	}

	// Function to sort element in descending order
	static int[] arrange(int[] arr) {
		int repeat = 1;
		// Repeat the sorting array.length-1 times
		while (repeat < array.length) {
			// if element (i-1) greater then element(i), swap between them
			// -repeat will increase performance,
			// since it will not check the elements that are already ordered in the end
			for (int i = 0; i < (array.length - repeat); i++) {
				if (array[i] < array[i + 1]) {
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}

			}
			repeat++;
		}

		return array;
	}

}
