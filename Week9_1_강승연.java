import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.EOFException;
import java.io.File;
import java.util.Scanner;


public class Week9_1_강승연 {

	public static void main(String[] args) {
		
		System.out.println("============");
		System.out.println("전공 : 사이버보안");
		System.out.println("학번 : 2171056");
		System.out.println("성명 : 강승연");
		System.out.println("============");
		
		
		try {
			Scanner kbd = new Scanner(System.in);
			
			System.out.println("File name for input:");
			String inputFile = kbd.next();
			System.out.println("File name for output");
			String outputFile = kbd.next();
			
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(outputFile));
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(inputFile));
			
			System.out.println("The numbers in File, " + inputFile);
			try {
				while(true) {
					int anInt = inputStream.readInt();
					outputStream.writeInt((2 * anInt));
					System.out.println(anInt);
				}
			}
			catch(EOFException e) {
				System.out.println("End of reading from 2nd File, " + inputFile);
			}
			inputStream.close();
			outputStream.close();
			
			ObjectInputStream inputStream2 = new ObjectInputStream(new FileInputStream(outputFile));
			
			System.out.println("The numbers in new File, " + outputFile);
			
			try {
				while(true) {
					int anInt = inputStream2.readInt();
					System.out.println(anInt);
				}
			}
			catch(EOFException e) {
				System.out.println("End of reading from 2nd File, " + outputFile);
			}
			inputStream2.close();

		}
		catch(FileNotFoundException e) {
			System.out.println("Cannot find file");
		}
		catch(IOException e) {
			System.out.println("Problem with input from file");
		}
		catch(Exception e) {
			System.out.println("Problem Occurs");
		}

	}

}
