import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class HashMapp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int countA = 0;
		int countI = 0;
		int countO = 0;
		int countU = 0;
		int countE = 0;
		String sentence = " h";
		System.out.println("Write sentence");
		sentence = sc.nextLine();
		for (int i = 0; i < sentence.length(); i++) {

			if (sentence.charAt(i) == 'a' || sentence.charAt(i) == 'A') {

				countA++;
			}

			if (sentence.charAt(i) == 'i' || sentence.charAt(i) == 'I') {

				countI++;
			}

			if (sentence.charAt(i) == 'o' || sentence.charAt(i) == 'O') {

				countO++;
			}

			if (sentence.charAt(i) == 'u' || sentence.charAt(i) == 'U') {

				countU++;
			}

			if (sentence.charAt(i) == 'e' || sentence.charAt(i) == 'E') {

				countE++;
			}

		}

		HashMap<String, Integer> vowel = new HashMap<>();
		vowel.put("vowel a", countA);
		vowel.put("vowel i", countI);
		vowel.put("vowel o", countO);
		vowel.put("vowel u", countU);
		vowel.put("vowel e", countE);

		for (Map.Entry<String, Integer> pair : vowel.entrySet()) {
			System.out.print(pair.getKey());
			System.out.print(": ");
			System.out.println(pair.getValue());
		}

//				for (String currentkey: vowel.keySet()) {
//				System.out.println(currentkey);
//		   
//				}
//		for(Integer currentkey: vowel.values()){
//			System.out.println(currentkey);
//		}
//

//
//
//		}
//		vowel.forEach((k,v) -> System.out.println(k+" :"+v));

	}

}
