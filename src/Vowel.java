import java.util.*;
public class Vowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int countA=0;
		int countI=0;
		int countO=0;
		int countU=0;
		int countE=0;
		String sentence=" h";
		System.out.print("Write sentence");
		sentence= sc.nextLine();
		System.out.print("Number of vowels are: ");
		for (int i=0; i<sentence.length(); i++) {
			
			if(sentence.charAt(i) == 'a' ||sentence.charAt(i) == 'A' ) {
				
				countA++;
			}
			
			if(sentence.charAt(i) == 'i' ||sentence.charAt(i) == 'I' ) {
				
				countI++;
			}
			
			if(sentence.charAt(i) == 'o' ||sentence.charAt(i) == 'O' ) {
				
				countO++;
			}
			
			if(sentence.charAt(i) == 'u' ||sentence.charAt(i) == 'U' ) {
				
				countU++;
			}
			
			if(sentence.charAt(i) == 'e' ||sentence.charAt(i) == 'E' ) {
				
				countE++;
			}
			
			
			}
		System.out.println("a presents "+ countA + " times");
		System.out.println("i presents "+ countI + " times");
		System.out.println("o presents "+ countO + " times");
		System.out.println("u presents "+ countU + " times");
		System.out.println("e presents "+ countE + " times");
		
		}
		

	}

