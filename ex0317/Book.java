package ex0317;

public class Book {
	String title;
	String author;
	
	public Book(String t) {
		title =t; author="작자미상";
	}
	
	public Book(String t, String a) {
		title =t; author = a;
	}
	
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Book littlePrince = new Book("어린왕자","생텍쥐베리");
		Book loveStory = new Book("춘항전");
		System.out.println(littlePrince.title+" "+littlePrince.author);
		System.out.println(loveStory.title+" "+loveStory.author);
		
	}

}
