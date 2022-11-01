import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class BinaryOutputDemo {

	public static void main(String[] args) {
		String fileName = "numbers.dat";
		
		try {
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
			
			Scanner kbd = new Scanner(System.in);
			
			System.out.println("Enter nonnegative integers");
			System.out.println("Place a negative number at the " + "end.");
			
			int anInteger;
			do {
				anInteger = kbd.nextInt();
				outputStream.writeInt(anInteger);
			}while(anInteger >= 0);
			System.out.println("Numbers and sentinel value");
			System.out.println("written to the file " + fileName);
			outputStream.close();
		}
		catch(IOException e) {
			System.out.println("Problem with output to fild " + fileName);
		}

	}

}
