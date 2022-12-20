import java.util.ArrayList;

public class UniqueAlphabet {
	static char[] alphabet = { 'c', 'a', 'c', 't', 'r', 'a', 't', 'z' };
	static ArrayList<Character> alphabetUnique = new ArrayList<>();
	static char compare = alphabet[0];
	static boolean stop = false;

	public static void main(String[] args) {

		alphabetUnique = alphabetUnique(alphabet);

		System.out.println("unique letters ");
		for (Character currentkey : alphabetUnique) {
			System.out.print(currentkey + " ");

		}

	}

	// Function to choose the unique letters
	static ArrayList<Character> alphabetUnique(char[] alphabet) {
		// Repeat alphabet.length times
		for (int i = 0; i < alphabet.length; i++) {
			int count = 0;
			stop = false;

			// Stop if the number is already appear before
			for (int r = 0; r < i; r++) {
				if (alphabet[i] == alphabet[r]) {
					stop = true;
				}
			}
			if (!stop) {
				// add unique letters
				alphabetUnique.add(alphabet[i]);
			}

		}
		return alphabetUnique;

	}
}
