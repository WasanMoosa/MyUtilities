import java.util.HashMap;

public class UnigueAlphabetHash {
	static char[] alphabet = { 'c', 'a', 'c', 't', 'r', 'a', 't', 'z' };
	static HashMap<Character, Integer> alphabetUnique = new HashMap<>();

	public static void main(String[] args) {

		alphabetUnique = alphabetUnique(alphabet);
		for (Character currentkey : alphabetUnique.keySet()) {

			// Only print keys which has only one count

			System.out.print(currentkey + " ");

		}

	}

	// To make Hashmap only for unique letters

	static HashMap<Character, Integer> alphabetUnique(char[] array) {
		for (int i = 0; i < alphabet.length; i++) {

			alphabetUnique.put(alphabet[i], 0);

		}
		return alphabetUnique;
	}

}
