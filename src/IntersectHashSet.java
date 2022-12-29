import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Given the names of people working in 2 different restaurants. Figure out
 * which employees work for both of the resturatns. With and Without HashSets
 * INPUT 1: ["Mr A", "Mr B", "Mr C", "Mr Y", "Mr E"] INPUT 2: ["Mr X", "Mr Z",
 * "Mr B", "Mr A", "Mr Y", "Mr S", "Mr T"] OUTPUT: ["Mr A", "Mr B", "MR Y"]
 */
public class IntersectHashSet {

	public static void main(String[] args) {
		String[] input1 = { "Mr A", "Mr B", "Mr C", "Mr Y", "Mr E" };
		String[] input2 = { "Mr X", "Mr Z", "Mr B", "Mr A", "Mr Y", "Mr S", "Mr T" };

		// Without HashSet
		ArrayList<String> intersection = intersect(input1, input2);
		for (String i : intersection) {
			System.out.println(i);
		}
		System.out.println("---------------");
		// With HashSet
		HashSet<String> intersectionHash = intersectHashSet(input1, input2);
		for (String j : intersectionHash) {
			System.out.println(j);
		}

	}

	/**
	 * 
	 * Check the intersection between two arrays and print the intersection without
	 * HashSet
	 * 
	 * @param input1
	 * @param input2
	 * @return ArrayList
	 */

	public static ArrayList<String> intersect(String[] input1, String[] input2) {
		ArrayList<String> intersection = new ArrayList<>();

		for (int i = 0; i < input1.length; i++) {
			for (int j = 0; j < input2.length; j++) {
				if (input1[i] == input2[j]) {
					intersection.add(input1[i]);
				}
			}
		}

		return intersection;
	}

	/**
	 * 
	 * Check the intersection between two arrays and print the intersection with
	 * HashSet
	 * 
	 * @param input1
	 * @param input2
	 * @return HashSet
	 */

	public static HashSet<String> intersectHashSet(String[] input1, String[] input2) {
		HashSet<String> inp1 = new HashSet<>(Arrays.asList(input1));
		HashSet<String> inp2 = new HashSet<>(Arrays.asList(input2));
		inp1.retainAll(inp2);

		return inp1;
	}

}
