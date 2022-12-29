import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Given an array of names, remove the duplicate names. With and Without
 * HashSets INPUT: ["Mr A", "Mr B", "Mr A", "Mr C", "Mr A", "Mr D", "Mr B", "Mr
 * C"] OUTPUT: ["Mr A", "Mr B", "Mr C", "MR D"]
 *
 */
public class DuplicateHashSet {

	public static void main(String[] args) {
		String[] names = { "Mr A", "Mr B", "Mr A", "Mr C", "Mr A", "Mr D", "Mr B", "Mr C" };

		// without HashSet using Queue
		Queue<String> nameQueue = name(names);
		while (!nameQueue.isEmpty()) {
			System.out.println(nameQueue.poll());
		}

		System.out.println("---------------");
		// with HashSet
		HashSet<String> nameHashSet = namesHashSet(names);
		for (String name : nameHashSet) {
			System.out.println(name);
		}

	}

	/**
	 * Remove duplicated name without Hashset
	 * 
	 * @param String array
	 * @return Queue<string>
	 */
	public static Queue<String> name(String[] str) {
		Queue<String> nameQueue = new LinkedList<>();
		for (int i = 0; i < str.length; i++) {
			if (!nameQueue.contains(str[i])) {
				nameQueue.add(str[i]);
			}
		}
		return nameQueue;

	}

	/**
	 * Remove duplicated name with Hashset
	 * 
	 * @param String array
	 * @return String HashSet
	 */
	public static HashSet<String> namesHashSet(String[] str) {
		HashSet<String> nameHashSet = new HashSet<>();
		for (int i = 0; i < str.length; i++) {
			nameHashSet.add(str[i]);
		}
		return nameHashSet;

	}
}
