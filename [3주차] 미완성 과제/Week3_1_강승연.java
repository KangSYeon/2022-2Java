import java.util.Scanner;

public class Week3_1_강승연 {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("전공 : 사이버보안");
		System.out.println("학번 : 2171056");
		System.out.println("성명 : 강승연");
		System.out.println("============");
		
		Scanner kbd = new Scanner(System.in);
		
		//첫번째 곡 입력받기
		System.out.println("*Song 1*");
		Song song1 = new Song(); //객체 생성
		
		//첫번째 곡 정보 입력
		System.out.print("곡명입력:");
		song1.title = kbd.next();
		System.out.print("가수입력:");
		song1.singer = kbd.next();
		System.out.print("가격입력:");
		song1.price = kbd.nextInt();
		
		//두번째 곡 입력받기
		System.out.print("*Song 2*");
		Song song2 = new Song(); //객체 생성
		
		//두번째 곡 정보 입력
		System.out.print("곡명입력:");
		song2.title = kbd.next();
		System.out.print("가수입력:");
		song2.singer = kbd.next();
		System.out.print("가격입력:");
		song2.price = kbd.nextInt();
		
		//노래 고르기
		System.out.println("노래를 고르세요");
		System.out.println("1:" + song1.title + " 2:" + song2.title);
		
		//참조변수를 생성
		Song chooseSong = null;
		//어떤 노래를 들을지에 대한 변수 및 변수에 값 입력
		int choose = kbd.nextInt();
		
		//choose 변수에 따라 참조변수가 참조할 객체 전달
		switch(choose) {
		case 1:
			chooseSong = song1;
			break;
		case 2:
			chooseSong = song2;
			break;
		}
		
		//참조변수로 객체에 접근해 Play 함수와 Price 함수 출력
		chooseSong.play();
		chooseSong.price();
		System.out.println("감사합니다.");
		
		kbd.close();

	}

}

class Song{
	//멤버변수 선언
	public String title;
	public String singer;
	public int price;
	
	//가격 출력 메소드 선언
	public void price() {
		System.out.println(price + " 원입니다. ");
	}
	
	//음악 출력 메소드 선언
	public void play() {
		System.out.println("노래들어요: " + "\" + title + \"" + " by " + singer);
	}
}
