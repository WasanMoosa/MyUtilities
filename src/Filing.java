import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Learn about filing
 */

public class Filing {

	public static void main(String[] args) {
		File myFile = new File("Hello.txt");
		
		try {
			myFile.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


//		try {
//
//			Scanner fScanner = new Scanner(myFile);
//			FileWriter writer = new FileWriter(myFile, true);
//			writer.write(" \n Not thinking");
//
//			writer.close();
//
//			while (fScanner.hasNextLine()) {
//
//			System.out.print(fScanner.nextLine());
//			}
//		} catch (Exception e) {
//			try {
//				
//
//			}



		}

	}
