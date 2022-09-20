import java.util.Scanner;

public class Week3_4_강승연 {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("전공 : 사이버보안");
		System.out.println("학번 : 2171056");
		System.out.println("성명 : 강승연");
		System.out.println("============");
		
		Scanner kbd = new Scanner(System.in);
		

		
		kbd.close();

	}

}

class MenuOrder{
	private int cokePrice;
	private int lemonadePrice;
	private int coffeePrice;
	private int inputMoney;
	private String drinkSelected;
	
	public void setMoney(int inputMoney) {
		this.inputMoney = inputMoney;
	}
	
	//음료명 : menu, 가격 : price
	public void setPrice(String menu, int price) {
		switch(menu) {
		case "Coke" :
			this.cokePrice = price;
			break;
		case "Lemonade" :
			this.lemonadePrice = price;
			break;
		case "Coffee" :
			this.coffeePrice = price;
			break;
		}
	}
	
	public void showMenu() {
		System.out.println("1. Coke: " + cokePrice);
		System.out.println("2. Lemonade: " + lemonadePrice);
		System.out.println("3. Coffee: " + coffeePrice);
	}
	
	//선택 메뉴 : pick
	public void showResult(int pick) {
		
		//해당 음료의 가격을 받아오기 위함
		int price = 0;
		switch(pick) {
		case 1:
			this.drinkSelected = "Coke";
			price = this.cokePrice;
			break;
		case 2:
			this.drinkSelected = "Lemonade";
			price = this.lemonadePrice;
			break;
		case 3:
			this.drinkSelected = "Coffee";
			price = this.coffeePrice;
			break;
			default : drinkSelected = "없는 메뉴";
		}
		
		System.out.println(drinkSelected + "를 선택하셨습니다.");
		
		if(price > inputMoney) {
			
		}
		else if(price < inputMoney) {
			
		}
		else {
			
		}

	}
}
