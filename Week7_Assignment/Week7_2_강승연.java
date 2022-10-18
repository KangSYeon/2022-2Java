package Week7_Assignment;

import java.util.Scanner;
import java.math.*;

public class Week7_2_강승연 {

	public static void main(String[] args) {
		
		System.out.println("============");
		System.out.println("전공 : 사이버보안");
		System.out.println("학번 : 2171056");
		System.out.println("성명 : 강승연");
		System.out.println("============");
	
		//Scanner 생성
		Scanner kbd = new Scanner(System.in);
		
		
		
		kbd.close();

	}

}

interface Geometry {
	final double PI = 3.14159;
	
	double area();
	double perimeter();
}

class Circle implements Geometry{
	
	Circle(){
		
	}
	
	Circle(double radius){
		
	}
	
	double area() {
		
	}
	double perimeter() {
		
	}
}

class Square implements Geometry{
	
	Square(){
		
	}
	
	Square(double side){
		
	}
	
	double area() {
		
	}
	double perimeter() {
		
	}
}

class Triangle implements Geometry{
	
	Triangle(){
		
	}
	
	Triangle(double a, double b,double c){
		double s = (a+b+c)/2;
		sqrt(s*(s-a)*(s-b)*(s-c));
	}
	
	double area() {
		
	}
	double perimeter() {
		
	}
}
