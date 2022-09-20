import java.util.Scanner;

public class Week3_2_강승연 {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("전공 : 사이버보안");
		System.out.println("학번 : 2171056");
		System.out.println("성명 : 강승연");
		System.out.println("============");
		
		Scanner kbd = new Scanner(System.in);
		
		//circle 객체 생성
		Circle circle = new Circle();
		
		System.out.print("반지름 입력:");
		
		//반지름 입력 및 circle의 radius에 반지름 전달(set)
		circle.setRadius(kbd.nextDouble());
		//반지름 출력
		System.out.println("반지름:" + circle.getRadius());
		//circleInfo로 원둘레 및 원의 넓이 출력
		circle.circleInfo();

		kbd.close();

	}

}

class Circle{
	//멤버변수 선언
	final double PI = 3.14159;
	private double radius;
	
	//private 인 radius 에 접근할 수 있도록 set, get 메소드 선언
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	//원둘레를 계산하여 반환하는 메소드
	public double perimeter() {
		return PI * 2 * this.radius;
	}
	
	//원넓이를 계산하여 반환하는 메소드
	public double area() {
		return PI * radius * radius;
	}
	
	//원들레와 원넓이를 출력하는 메소드
	public void circleInfo() {
		System.out.printf("원둘레:" + "%.2f", perimeter());
		System.out.println();
		System.out.printf("원넓이:" + "%.2f", area());
	}
}
