import java.lang.Thread;
import java.util.Scanner;

//SharedArea 정의
class SharedArea{
	double ratio; //앞면 비율
	boolean isReady; //synchronize용
}

class SimulThread extends Thread {
	SharedArea sharedArea;
	int num; //동전 던지는 수
	int count; //앞면이 몇 번 나왔는지 계산

	//생성자로 동전 던지는 수를 main에서 인자로 받아옴
	SimulThread(int num){
		this.num = num;
	}
	
	public void run() {
		//동전을 던져 앞면 나온 횟수를 count에 저장
		for(int i = 0; i < num; i++)
			if(Math.round(Math.random()) == 0)
				count++;
		//비율 계산
		sharedArea.ratio = ((double)count / num) * 100.0;
		//notify를 통해 PrintThread를 깨움
		sharedArea.isReady = true;
		synchronized (sharedArea) {
			sharedArea.notify();
		}
	}
}

class PrintThread extends Thread {
	SharedArea sharedArea;

	public void run() {
		//false일 경우 wait
		if(sharedArea.isReady == false) {
			try {
			synchronized (sharedArea) {
				sharedArea.wait();
			}
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		//notify 이후에 실행
		System.out.printf("Front Ratio: "+"%.2f", sharedArea.ratio);
	}
}

public class Week13_1_강승연 {

	public static void main(String[] args) {
		
		System.out.println("------------");
		System.out.println("사이버보안전공");
		System.out.println("2171056");
		System.out.println("강승연");
		System.out.println("------------");
		
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("Input the number of coin toss:");
		
		//쓰레드 가져오기 + 몇 번 반복할지 인자 전달
		SimulThread thread1 = new SimulThread(kbd.nextInt());
		PrintThread thread2 = new PrintThread();
		
		//critical area 생성 및 각 쓰레드에 해당 구역 주소 전달
		SharedArea SH = new SharedArea();
		thread1.sharedArea = SH;
		thread2.sharedArea = SH;
		
		//쓰레드 실행
		thread1.start();
		thread2.start();

	}

}
