import javax.swing.JOptionPane;

class MyThread extends Thread{
	public void run() {
		for(int i = 20; i > 0; i--) {
			System.out.println(i);
			try {
				sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Time Out");
	}
}


public class ThreadJOptionPane {

	public static void main(String[] args) {
		MyThread th = new MyThread();
		th.start();
		
		while(true) {
			String st = JOptionPane.showInputDialog("Enter a string");
			System.out.println("You entered <" + st + ">");
			if(st.equalsIgnoreCase("bye")) break;
		}

	}

}
