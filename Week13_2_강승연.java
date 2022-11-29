import java.lang.Thread;
import javax.swing.JOptionPane;

class SharedArea2{
	String nowWord;
}

class WordThread extends Thread{
	SharedArea2 sharedArea;
	String[] words = {"red", "orange", "yellow", "green", "blue", "pupple", "rainbow", "skyblue", "gray", "black", "white"};
	
	public void run() {
		for(int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
			sharedArea.nowWord = words[i];
			try {
				sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("실패");
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
}

public class Week13_2_강승연 {

	public static void main(String[] args) {
		
		System.out.println("------------");
		System.out.println("사이버보안전공");
		System.out.println("2171056");
		System.out.println("강승연");
		System.out.println("------------");
		
		WordThread th = new WordThread();
		SharedArea2 SH = new SharedArea2();
		th.sharedArea = SH;
		th.start();
		
		while(true) {
			String st = JOptionPane.showInputDialog("Enter a string");
			System.out.println("You entered <" + st + ">");
			if(st.equalsIgnoreCase(SH.nowWord)) {
				System.out.println("성공");
				break;
			}
		}

	}

}
