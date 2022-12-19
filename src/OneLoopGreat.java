
import java.util.*;
import java.util.concurrent.CountDownLatch;

public class OneLoopGreat {
	static Scanner sc = new Scanner(System.in);
	static int number = 0;
	static int[] greatNum = new int[3];
	static int ref1=0;
	static int ref2=0;
	static int ref3=0;

	public static void main(String[] args) {

		int[] arr = {1000, 900,1001, -1, -2, -3, 9, 7, 88, -1, 0 , 999, 8,77,-1,0, 9889, 999,1001};
		
		greatNum[0] = 0;
		greatNum[1] = 0;
		greatNum[2] = 0;

		int[] greatestN = great(arr);

		System.out.printf(" %d is the largest number, %d is 2nd largest number, %d is 3rd largest number.",
				greatestN[0], greatestN[1], greatestN[2]);

	}

	static int[] great(int arr[]) {
		int count=0;
		for (int i = 0; i < arr.length && count<4; i++) {
			if (greatNum[0]>arr[i]) {
				greatNum[0]=arr[i];	
				count++;}
		}
		greatNum[1] =greatNum[0];
		greatNum[2] =greatNum[0];
		

		for (int i = 0; i < arr.length; i++) {

			if (greatNum[0] < arr[i]) {
				greatNum[1]=greatNum[0];
				greatNum[0] = arr[i];
			}
			if (greatNum[1] < arr[i] && greatNum[0] != arr[i] ) {
				greatNum[2] = greatNum[1];
				greatNum[1] = arr[i];
		}
			if (greatNum[2] < arr[i] && greatNum[0] != arr[i] && greatNum[1] != arr[i]) {
					greatNum[2] = arr[i];
					}
				}


		return greatNum;
}

}
