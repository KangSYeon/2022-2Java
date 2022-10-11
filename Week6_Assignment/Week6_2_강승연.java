package Week6_Assignment;

import java.util.Scanner;

public class Week6_2_강승연 {

	public static void main(String[] args) {
		
		System.out.println("============");
		System.out.println("전공 : 사이버보안");
		System.out.println("학번 : 2171056");
		System.out.println("성명 : 강승연");
		System.out.println("============");
	
		//Scanner 생성
		Scanner kbd = new Scanner(System.in);
		
		while(true) {
			System.out.println("What kind of Emergency?");
			System.out.println("1.Fire   2.Patient   3.Thief   4.Record   5.End");
			int num = kbd.nextInt();
			if(num == 5) {
				break;
			}
			switch(num) {
			case 1:
				Car car = new FireEngine();
			case 2:
			case 3:
			case 4:
				default:
			}
		}

	}

}

class Car{
	String emgType;
	int number;
	String carType;
	String reqPerson;
	
	Car(){
		
	}
	
	Car(String emgType, int number, String carType, String reqPerson){
		this.emgType = emgType;
		this.number = number;
		this.carType = carType;
		this.reqPerson = reqPerson;
	}
	
	String getEmgType() {
		return emgType;
	}
	int getNumber() {
		return number;
	}
	String getCarType() {
		return carType;
	}
	String getReqPerson() {
		return reqPerson;
	}
	String getStr() {
		return getEmgType()+getNumber()+getCarType()+getReqPerson();
	}
}

class FireEngine extends Car{
	
	public String toString() {
		return getStr();
	}
}

class Ambulance extends Car{
	
	public String toString() {
		return getStr();
	}
}

class PoliceCar extends Car{
	
	public String toString() {
		return getStr();
	}
}

class Emergency{
	int i;
	Car emgList[] = new Car[10];
	
	void EM_Call(Car car) {
		System.out.println("Call " + car.getNumber());
		emgList[i++] = car;
	}
	
	void EM_record() {
		for(int i = 0; i < emgList.length; i++) {
			System.out.println(emgList[i]);
		}
	}
}