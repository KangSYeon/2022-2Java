import java.util.Scanner;

public class Week3_3_강승연 {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("전공 : 사이버보안");
		System.out.println("학번 : 2171056");
		System.out.println("성명 : 강승연");
		System.out.println("============");
		
		Scanner kbd = new Scanner(System.in);
		
		String title;
		int page;
		MyFile fOld = new MyFile();
		MyFile fNew = new MyFile();
		
		System.out.println("--File정보입력(제목, 페이지수)--");
		fOld.setTitle(kbd.nextLine());
		fOld.setPage(kbd.nextInt());
		fOld.fileCopy(fNew);
		System.out.println("<원래 File>");
		fOld.fileInfo();
		System.out.println("<복사된 File>");
		fNew.fileInfo();
		
		kbd.close();

	}

}

class MyFile{
	
	private String title;
	private int page;
	
	public void setTitle (String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setPage(int page) {
		this.page = page;
	}
	
	public int getPage() {
		return this.page;
	}
	
	public void fileCopy(MyFile file) {
		file.title = this.title;
		file.page = this.page;
	}
	
	public void fileInfo() {
		System.out.println("파일제목:" + this.title);
		System.out.println("페이지:" + this.page);
	}
}
