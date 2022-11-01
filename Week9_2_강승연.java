import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.EOFException;
import java.io.File;
import java.io.Serializable;



public class Week9_2_강승연 {

	public static void main(String[] args) {
		
		System.out.println("============");
		System.out.println("전공 : 사이버보안");
		System.out.println("학번 : 2171056");
		System.out.println("성명 : 강승연");
		System.out.println("============");
		
		Scanner kbd = new Scanner(System.in);
		
		Dog myDog[] = new Dog[10];
		
		myDog[0] = new Dog("Merry", 3, 2.5, "Bulldog", false);
		myDog[1] = new Dog("JJong", 5, 5.5, "Mix", false);
		myDog[2] = new Dog("Kong", 4, 3, "Poodle", true);
		myDog[3] = new Dog("Apple", 2, 2.5, "Collie", true);
		myDog[4] = new Dog("Candy", 5, 5.5, "Coca", false);
		myDog[5] = new Dog("Cutie", 7, 2.5, "Chiwawa", true);
		myDog[6] = new Dog("Peace", 3, 2.5, "Huskey", false);
		myDog[7] = new Dog("Lion", 9, 1.5, "Shepard", true);
		myDog[8] = new Dog("Windy", 2, 9, "Jindo", true);
		myDog[9] = new Dog("Sweetie", 1, 2.5, "Maltiz", false);
		
		String outputFile = null;
		
		try {
			System.out.println("Input File name to write Dog data");
			outputFile = kbd.next();
			
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(outputFile));
			outputStream.writeObject(myDog);
			outputStream.close();
		}
		catch(IOException e) {
			System.out.println("Error writing to file "+ outputFile + ".");
		}
		
		Dog anotherArray[] = null;
		try {
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(outputFile));
			anotherArray = (Dog[])inputStream.readObject();
			inputStream.close();
			
			System.out.printf("%-10s" + "%-10s" + "%-10s" + "%-20s" + "%-20s", "Name", "Age", "Weight", "Bread", "BoosterShot");
			for(int i = 0; i < anotherArray.length; i++) {
				System.out.println(anotherArray[i]);
			}
			
			System.out.println("Dogs older than 2 years and did not get the boosterShot.");
			for(int i = 0; i < anotherArray.length; i++) {
				if(!anotherArray[i].boosterShot) {
					System.out.printf("%-10s" + "%-10s", anotherArray[i].getName(), anotherArray[i].getBread());
				}
			}
			
		}
		catch(EOFException e) {
			System.out.println("End of File Exception\n");
		}
		catch(FileNotFoundException e) {
			System.out.println("Cannot find file\n");
		}
		catch(IOException e) {
			System.out.println("Problem with input from file\n");
		}
		catch(Exception e) {
			System.out.println("Problem Occurs");
		}

	}

}

class Pet implements Serializable{
	private String name;
	private int age;
	private double weight;
	
	Pet(){
		
	}
	
	Pet(String name, int age, double weight){
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public void setPet(String newName, int newAge, double newWeight) {
		name = newName;
		age = newAge;
		weight = newWeight;
	}
	
	public void setAge(int newAge) {
		age = newAge;
	}
	
	public void setweight(double newWeight) {
		weight = newWeight;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getWeight() {
		return weight;
	}
}

class Dog extends Pet implements Serializable{
	String bread;
	boolean boosterShot;
	
	Dog(){
		
	}
	
	Dog(String newName, int newAge, double newWeight, String bread, boolean boosterShot){
		super(newName, newAge, newWeight);
		this.bread = bread;
		this.boosterShot = boosterShot;
	}
	
	public String getBread() {
		return bread;
	}
	public void setBread(String bread) {
		this.bread = bread;
	}
	public boolean isBoosterShot() {
		return boosterShot;
	}
	public void setBoosterShot(boolean boosterShot) {
		this.boosterShot = boosterShot;
	}
	
	public String getBoosterShotInString() {
		if(boosterShot) {
			return "O";
		}
		return "X";
	}
	
	public String toString() {
		System.out.printf("%-10s" + "%-10d" + "%-10.2f" + "%-20s" + "%-20s", super.getName(), super.getAge(), super.getWeight(), bread, getBoosterShotInString());
		return null;
	}
	
}
