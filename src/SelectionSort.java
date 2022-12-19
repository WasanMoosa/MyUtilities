/**
 * 
 */

/**
 * @author TRA0004
 *
 */
public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {4,3,2,1};
		int temp=0;
		for (int i=0; i<arr.length; i++) {
		System.out.print(arr[i]);
	}
		System.out.print("\n");
		temp=arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
		
		for (int i=0; i<arr.length; i++)
		System.out.print(arr[i]);

	}

}
