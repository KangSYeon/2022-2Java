import java.util.Scanner;
public class Week1_1_강승연 {

	public static void main(String[] args) {
		
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171056");
		System.out.println("성명: 강승연");
		System.out.println("============");
		
		//Scanner Class 선언
		Scanner input = new Scanner(System.in); 
		
		//변수 선언 및 초기화
		int base = 0;
		int height = 0;
		float area = 0;
		
		System.out.print("Input base:");
		
		//base 입력
		base = input.nextInt();
		
		System.out.print("Input height:");
		
		//height 입력
		height = input.nextInt();
		
		//area 계산 + 형변환
		area = (float)(base * height) / 2;
		
		System.out.println("The area :" + area);
		
		//Scanner close
		input.close();

	}

}
