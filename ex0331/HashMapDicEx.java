package ex0331;

import java.util.*;

public class HashMapDicEx {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁

		HashMap <String, String> dic = new HashMap <String, String>(); //영어, 한글 쌍을 가지는 HashMap 컬렉션 생성
		
		//컬렉션에 저장
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		
		//영어 단어를 입력받으면 한글 단어를 반환하는 무한 반복 메소드, exit입력하면 종료
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("찾고 싶은 단어는? ");
			String eng = scanner.next();
			if(eng.equals("exit")){
				System.out.println("종료합니다...");
				break;
			}
		
			String kor = dic.get(eng);
			if(kor==null) {
				System.out.println(eng+"는 없는 단어 입니다.");
			}
			else {
				System.out.println(kor);
			}
		}
		
		scanner.close();
	}

}
