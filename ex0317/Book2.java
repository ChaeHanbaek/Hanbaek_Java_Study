package ex0317;

public class Book2 {
	String title;
	String author;
	void show() {
		System.out.println(title+" "+author);
	}
	
	public Book2() {
		this("","");
		System.out.println("생성자 호출됨");
	}
	
	public Book2(String t) {
		this(t,"작자미상");
	}
	
	public Book2(String t, String a) {
		this.title =t; this.author = a;
	}
	
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Book2 littlePrince = new Book2("어린왕자","생텍쥐베리");
		Book2 loveStory = new Book2("춘항전");
		Book2 emptyBook= new Book2();
		loveStory.show();
		
	}

}
