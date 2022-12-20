import java.util.ArrayList;

public class UniqueAlphabet {
	static char[] alphabet = { 'c', 'a', 'c', 't', 'r', 'a', 't', 'z' };
	static ArrayList<Character> alphabetUnique = new ArrayList<>();
	static char compare = alphabet[0];
	static boolean stop = false;

	public static void main(String[] args) {

		alphabetUnique = alphabetUnique(alphabet);

		System.out.println("The unique letters are");
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

			// Skipping count and print if the number is already counted before
			for (int r = 0; r < i; r++) {
				if (alphabet[i] == alphabet[r]) {
					stop = true;
				}
			}
			for (int j = i; j < alphabet.length && !stop; j++) {
				// Check similarity and increment
				if (alphabet[i] == alphabet[j]) {
					count++;
				}
			}
			if (count == 1) {

				alphabetUnique.add(alphabet[i]);
			}

		}
		return alphabetUnique;

	}

}
