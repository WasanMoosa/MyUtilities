
import java.util.*;

public class Greatest {
	static Scanner sc = new Scanner(System.in);
	static int number = 0;
	static int[] greatNum = new int[3];

	public static void main(String[] args) {

		int[] arr = { 100, 1001, 999, 9889, -1, -2, -3, 9, 7, 88, -1, 0, 1000 };
		greatNum[0] = -1;
		greatNum[1] = -1;
		greatNum[2] = -1;
		
	char u='أ';
		int o = (int) u;
		System.out.print(Integer.toHexString(u));

		int[] greatestN = great(arr);

		System.out.printf(" %d is the largest number, %d is 2nd largest number, %d is 3rd largest number.",
				greatestN[0], greatestN[1], greatestN[2]);

	}

	static int[] great(int arr[]) {

		for (int i = 0; i < arr.length; i++) {

			if (greatNum[0] < arr[i]) {
				greatNum[0] = arr[i];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (greatNum[1] < arr[i]) {
				if (arr[i] != greatNum[0]) {
					greatNum[1] = arr[i];
				}

			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (greatNum[2] < arr[i]) {
				if (arr[i] != greatNum[1] && arr[i] != greatNum[0]) {
					greatNum[2] = arr[i];
				}

			}
		}

		return greatNum;

	}
}
