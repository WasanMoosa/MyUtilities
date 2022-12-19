import java.util.*;

public class SelectionSort2 {
	static int[] arr = { 50, 12, 8, 10, 1001, 6, 87, 24 };
	static int[] arr2 = new int[arr.length];
	static int i = 0;

	public static void main(String[] args) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println("\nDecending");

		arr2 = sorting(arr);
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}

	}
	// function to make the array in decending

	static int[] sorting(int[] arr) {

		int y = 0;
		int index = 0; // To know the index of max element
		int max = arr[0]; // assign randomly

		// Repeat till the end of array
		for (int i = 0; i < arr.length; i++) {
			max = arr[i];

			// Loop for checking max
			for (y = i; y < arr.length; y++) {
				if (arr[y] > max) {
					index = y;
					max = arr[y];
				}

			}
			// swap the index
			if (arr[i] < max) {
				int tem = arr[i];
				arr[i] = max;
				arr[index] = tem;
			}

		}
		return arr;
	}
}
