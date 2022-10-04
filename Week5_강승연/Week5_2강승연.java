package Week5_assignment;

import java.util.Scanner;

public class Week5_2강승연 {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("전공 : 사이버보안");
		System.out.println("학번 : 2171056");
		System.out.println("성명 : 강승연");
		System.out.println("============");
		
		Scanner kbd = new Scanner(System.in);
		
		Dog []dog = new Dog[3];
		Cat []cat = new Cat[3];
		
		for(int i = 0; i < dog.length; i++) {
			dog[i] = new Dog();
		}
		for(int i = 0; i < cat.length;i++) {
			cat[i] = new Cat();
		}
		
		for(int i = 0; i < dog.length; i++) {
			
			System.out.println("<<Dog " + (i + 1) + ">>");
			
			System.out.print("Name:");
			dog[i].setName(kbd.next());
			
			System.out.print("Age:");
			dog[i].setAge(kbd.nextInt());
			
			System.out.print("Weight:");
			dog[i].setWeight(kbd.nextDouble());
			
			System.out.print("BoosterShot(y/n)");
			//develop 여지 있음...
			if(kbd.next().equalsIgnoreCase("y")) {
				dog[i].setBoosterShot(true);
			}else {
				dog[i].setBoosterShot(false);
			}
		}
		
		for(int i = 0; i < cat.length; i++) {
			
			System.out.println("<<Cat " + (i + 1) + ">>");
			
			System.out.print("Name:");
			cat[i].setName(kbd.next());
			
			System.out.print("Age:");
			cat[i].setAge(kbd.nextInt());
			
			System.out.print("Weight:");
			cat[i].setWeight(kbd.nextDouble());
			
			System.out.print("Color:");
			cat[i].setColor(kbd.next());
		}
		
		for(int i = 0; i < dog.length; i++) {
			dog[i].writeOutput();
			dog[i].move();
			System.out.println();
		}
		
		for(int i = 0; i < cat.length; i++) {
			cat[i].writeOutput();
			cat[i].move();
			System.out.println();
		}
		
		System.out.println("* Dogs older than 2 years and no boostershot are...");
		
		for(int i = 0; i < dog.length;i++) {
			if((dog[i].getAge() > 2) && (dog[i].getBoosterShot() == false)) {
				System.out.println(dog[i].getName());
				System.out.println();
			}
		}
		
		System.out.println("* Black cats weithts more than 3Kg are...");
		
		for(int i = 0; i < cat.length;i++) {
			if((cat[i].getColor().equals("black")) && (cat[i].getWeight() > 3)) {
				System.out.println(cat[i].getName());
				System.out.println();
			}
		}
		
		kbd.close();

	}

}

class Pet{
	
	private String name;
	private int age;
	private double weight;
	
	Pet(){
		
	}
	
	public void writeOutput() {
		System.out.println("Name:" + getName());
		System.out.println("Age:" + getAge());
		System.out.println("Weight" + getWeight());
	}
	
	public void setPet(String name, int age, double weight){
		setName(name);
		setAge(age);
		setWeight(weight);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public void move() {
		System.out.println(getName() + " moves");
	}
	
}

class Dog extends Pet{
	
	private Boolean boosterShot;
	
	Dog(){
		
	}
	
	public void writeOutput() {
		super.writeOutput();
		System.out.print("BoosterShot:");
		if(getBoosterShot())
			System.out.println("O");
		else System.out.println("X");
	}
	
	public void setBoosterShot(boolean boosterShot){
		this.boosterShot = boosterShot;
	}
	
	public Boolean getBoosterShot() {
		return this.boosterShot;
	}
	
	public void move() {
		System.out.println(getName() + " walks and runs");
	}
	
}

class Cat extends Pet{
	
	private String color;
	
	Cat(){
		
	}
	
	public void writeOutput() {
		super.writeOutput();
		System.out.println("Color:" + getColor());
	}
	
	public String getColor(){
		return this.color;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public void move() {
		System.out.println(getName() + " creeps and jumps");
	}
	
}
