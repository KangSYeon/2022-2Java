package Week7_Assignment;

import java.util.Scanner;

public class Week7_1_강승연 {

	public static void main(String[] args) {
		
		System.out.println("============");
		System.out.println("전공 : 사이버보안");
		System.out.println("학번 : 2171056");
		System.out.println("성명 : 강승연");
		System.out.println("============");
	
		//Scanner 생성
		Scanner kbd = new Scanner(System.in);
		
		int i = 0;
		Pet pet[] = new Pet[10];
		
		while(true) {
			System.out.println("원하는 작업은 무엇입니까?");
			System.out.println("1. New input 2. Output 3. Exit");
			switch(kbd.nextInt()) {
			case 1:
				System.out.println("종은 무엇입니까?");
				System.out.println("1. Dog 2. Cat 3. Snake 4. Bird");
				
				switch(kbd.nextInt()) {
				case 1: 
					pet[i] = new Dog();
					break;
				case 2: 
					pet[i] = new Cat();
					break;
				case 3: 
					pet[i] = new Snake();
					break;
				case 4: 
					pet[i] = new Bird();
					break;
				default: System.out.println("잘못된 입력");
				}
				System.out.print("Name:");
				pet[i].name = kbd.next();
				System.out.print("Age:");
				pet[i].age = kbd.nextInt();
				i++;
				
			case 2:
				System.out.printf("%-10s"+"%-10s"+"%-10s"+"%-10s", "Species", "Name", "Age", "Movement");
				System.out.println();
				for(int j = 0; j < i; j++) {
					System.out.printf("%-10s"+"%-10s"+"%-10s", pet[j].species, pet[j].name, pet[j].age);
					pet[j].move();
				}
				break;
			case 3:
				System.out.println("종료");
				System.exit(0);
				default:System.out.println("잘못된 입력");
			}
		}

	}

}

abstract class Pet{
	public String species;
	public String name;
	public int age;
	public abstract void move();
	
	Pet(){
		
	}
}

class Dog extends Pet{
	
	Dog(){
		super.species = "Dog";
	}
	
	public void move() {
		System.out.println("run");
	}
}

class Cat extends Pet{
	public void move() {
		System.out.println("jump");
	}
	
	Cat(){
		super.species = "Cat";
	}
}

class Bird extends Pet{
	public void move() {
		System.out.println("fly");
	}
	
	Bird(){
		super.species = "Bird";
	}
}

class Snake extends Pet{
	public void move() {
		System.out.println("crawl");
	}
	
	Snake(){
		super.species = "Snake";
	}
}


