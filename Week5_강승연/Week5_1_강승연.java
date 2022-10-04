package Week5_assignment;

import java.util.Scanner;

public class Week5_1_강승연 {

	public static void main(String[] args) {
		
		System.out.println("============");
		System.out.println("전공 : 사이버보안");
		System.out.println("학번 : 2171056");
		System.out.println("성명 : 강승연");
		System.out.println("============");
	
		//Scanner 생성
		Scanner kbd = new Scanner(System.in);
		
		//Play 와 Film 객체 생성 및 참조변수 선언
		Play play = new Play();
		Film film = new Film();
		
		//play 클래스의 멤버변수 title을 Scanner 로 입력받아 저장한다.
		System.out.println("Input Title for Play");
		play.setTitle(kbd.next());
		
		//play 클래스의 멤버변수 director를 Scanner 로 입력받아 저장한다
		System.out.println("Input Director for Play");
		play.setDirector(kbd.next());
		
		//play 클래스의 멤버변수 writer를 Scanner 로 입력받아 저장한다
		System.out.println("Input Writer for Play");
		play.setWriter(kbd.next());
		
		//film 클래스의 멤버변수 title을 Scanner 로 입력받아 저장한다
		System.out.println("Input Title for Flim");
		film.setTitle(kbd.next());
		
		//film 클래스의 멤버변수 director를 Scanner 로 입력받아 저장한다
		System.out.println("Input Director for Film");
		film.setDirector(kbd.next());
		
		//film 클래스의 멤버변수 writer를 Scanner 로 입력받아 저장한다
		System.out.println("Input Writer for Film");
		film.setWriter(kbd.next());
		
		//play 클래스의 멤버변수 performanceCost를 Scanner 로 입력받아 저장한다
		System.out.println("Input Performance Cost for Play");
		play.setPerformanceCost(kbd.nextInt());
		
		//film 클래스의 멤버변수 boxOfficeGross를 Scanner 로 입력받아 저장한다
		System.out.println("Input boxOfficeGross for Film");
		film.setBoxOfficeGross(kbd.nextInt());
		
		//출력한다.
		play.display();
		System.out.println(); //줄바꿈
		film.display();
		
		kbd.close();


	}

}

class Production{
	
	//멤버변수 선언
	private String title;
	private String director;
	private String writer;
	
	Production(){
		
	}
	
	Production(String title, String director, String writer){
		setTitle(title);
		setDirector(director);
		setWriter(writer);
	}
	
	//멤버변수에 대한 Get, Set
	public String getTitle(){
		return this.title;
	}
	
	public String getDirector() {
		return this.director;
	}
	
	public String getWriter() {
		return this.writer;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	//멤버변수 출력함수
	public void display() {
		System.out.println("Title:" + getTitle());
		System.out.println("Director:" + getDirector());
		System.out.println("Writer:"+ getWriter());
	}
}

class Play extends Production{ //Production 상속

	//멤버변수 선언
	private int performanceCost;
	
	Play(){
		
	}
	
	Play(String title, String director, String writer, int performanceCost){
		super(title, director, writer);
		setPerformanceCost(performanceCost);
	}
	
	//멤버변수에 대한 Get, Set
	public int getPerformanceCost() {
		return this.performanceCost;
	}
	
	public void setPerformanceCost(int performanceCost) {
		this.performanceCost = performanceCost;
	}
	
	//멤버변수 출력함수
	public void display(){
		super.display(); //부모 클래스의 display() 내용이 중복되므로 실행
		System.out.println("Performance cost:" + getPerformanceCost());
	}

}

class Film extends Production{
	
	//멤버변수 선언
	private int boxOfficeGross;
	
	
	Film(){
		
	}
	
	Film(String title, String director, String writer, int boxOfficeGross){
		super(title, director, writer);
		setBoxOfficeGross(boxOfficeGross);
	}
	
	//멤버변수에 대한 Get, Set
	public int getBoxOfficeGross() {
		return this.boxOfficeGross;
	}
	
	public void setBoxOfficeGross(int boxOfficeGross) {
		this.boxOfficeGross = boxOfficeGross;
	}
	
	//멤버변수 출력함수
	public void display(){
		super.display(); //부모 클래스의 display() 내용이 중복되므로 실행
		System.out.println("boxOfficeGross:" + getBoxOfficeGross());
	}

}
