import java.util.HashMap;

public class UnigueAlphabetHash {
	static char[] alphabet = { 'c', 'a', 'c', 't', 'r', 'a', 't', 'z' };
	static HashMap<Character, Integer> alphabetUnique = new HashMap<>();

	public static void main(String[] args) {

		alphabetUnique = alphabetUnique(alphabet);
		for (Character currentkey : alphabetUnique.keySet()) {
			
			//Only print keys which has only one count
			if (alphabetUnique.get(currentkey) == 1) {
				System.out.println(currentkey);

			}

		}

	}

	// To make Hashmap only for unique letters

	static HashMap<Character, Integer> alphabetUnique(char[] array) {
		for (int i = 0; i < alphabet.length; i++) {

			// If the key available, increment the count
			if (alphabetUnique.containsKey(alphabet[i])) {
				alphabetUnique.put(alphabet[i], alphabetUnique.get(alphabet[i]) + 1);

				// If the key not available, create it
			} else {
				alphabetUnique.put(alphabet[i], 1);
			}
		}
		return alphabetUnique;
	}

}
