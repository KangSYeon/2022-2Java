import java.util.Scanner;
public class Week1_2_강승연 {

	public static void main(String[] args) {
		
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171056");
		System.out.println("성명: 강승연");
		System.out.println("============");
		
		//Scanner Class 선언
		Scanner input = new Scanner(System.in);
		
		//변수 선언 및 초기화
		int int1 = 0;
		int int2 = 0;
		int int3 = 0;
		float avg = 0.0f;
		
		System.out.println("정수 세 개 입력");
		
		//int1,2,3 입력
		int1 = input.nextInt();
		int2 = input.nextInt();
		int3 = input.nextInt();
		
		//avg 계산 + 형변환
		avg = (float)(int1 + int2 + int3) / 3;
		
		System.out.printf("평균:" + "%.2f", avg);
		
		//Scanner close
		input.close();
	}

}
