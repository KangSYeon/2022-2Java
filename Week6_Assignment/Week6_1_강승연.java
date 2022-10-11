package Week6_Assignment;

import java.util.Scanner;

public class Week6_1_강승연 {

	public static void main(String[] args) {
		
		System.out.println("============");
		System.out.println("전공 : 사이버보안");
		System.out.println("학번 : 2171056");
		System.out.println("성명 : 강승연");
		System.out.println("============");
	
		//Scanner 생성
		Scanner kbd = new Scanner(System.in);
		
		Buyer Buyer1 = new Buyer();
		
		System.out.println("How much money do you have?");
		
		Buyer1.setMoney(kbd.nextInt());
		
		while(true) {
			System.out.println("What do you want to buy? Input 0 to quit");
			System.out.println("1. TV(100)    2. Computer(200)    3. Vedio(110)    4. Audio(50)    5. NoteBook(300)");
			int num = kbd.nextInt();
			if(num == 0)
				break;
			switch(num) {
			case 1:
				Tv t = new Tv();
				Buyer1.buy(t);
				break;
			case 2:
				Computer c = new Computer();
				Buyer1.buy(c);
				break;
			case 3:
				Video v = new Video();
				Buyer1.buy(v);
				break;
			case 4:
				Audio a = new Audio();
				Buyer1.buy(a);
				break;
			case 5:
				NoteBook n = new NoteBook();
				Buyer1.buy(n);
				break;
			default : System.out.println("No such item.");
			
			}

		}
		
		Buyer1.summary();

	}

}

class Buyer{
	int money = 1000, i;
	int bonusPoint = 0;
	Product item[] = new Product[10];
	
	int getMoney() {
		return money;
	}
	
	void setMoney(int money) {
		this.money = money;
	}
	
	void buy(Product pd) {
		if(pd.price > money) {
			System.out.println("Money is not enough.\n");
			summary();
			System.exit(0);
		}
		System.out.println("You bought " + pd + "(" + pd.price + ")");
		money = money - pd.price;
		bonusPoint = bonusPoint + pd.bonusPoint;
		item[i++] = pd;
	}
	
	public void summary() {
		System.out.println();
		System.out.print("SHOPPING LIST: ");
		for(int j = 0; j < i; j++)
			System.out.print(item[j] + " ");
		System.out.println("\nMONEY LEFT: " + money);
		System.out.println("CURRENT BONUS POINT: " + bonusPoint);
	}
}

class Product{
	int price;
	int bonusPoint;
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv extends Product{
	Tv(){
		super(100);
	}
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product{
	Computer(){
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}

class Video extends Product{
	Video(){
		super(110);
	}
	public String toString() {
		return "Video";
	}
}


class Audio extends Product{
	Audio(){
		super(50);
	}
	public String toString() {
		return "Audio";
	}
}

class NoteBook extends Product{
	NoteBook(){
		super(300);
	}
	public String toString() {
		return "NoteBook";
	}
}




