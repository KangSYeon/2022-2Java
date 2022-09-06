import java.util.Scanner;
public class Week1_3_강승연 {

	public static void main(String[] args) {
		
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171056");
		System.out.println("성명: 강승연");
		System.out.println("============");
		
		//Scanner Class 선언
		Scanner input = new Scanner(System.in);
		
		//변수 선언 및 초기화
		int temF = 0;
		float temC = 0.0f;
		
		//화씨온도 입력
		System.out.print("화씨온도 입력:");
		temF = input.nextInt();
		
		System.out.println("화씨온도:" + temF);
		
		//섭씨온도 계산 + 형변환
		temC = (float)5/9 * (temF - 32);
		
		System.out.printf("섭씨온도:" + "%.1f", temC);
		
		//Scanner close
		input.close();

	}

}
