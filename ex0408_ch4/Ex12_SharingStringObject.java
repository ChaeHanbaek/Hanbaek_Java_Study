package ex0408_ch4;

public class Ex12_SharingStringObject {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//같은 리터럴로 바로 객체를 생성한 경우 문자열 객체 공유
		//new 키워드로 객체를 생성한 경우 리터럴이 같더라도 별도의 객체를 생성한거라 공유 안됨
		String str1 = new String("안녕");
		String str2 = "안녕";
		String str3 = "안녕";
		String str4 = new String("안녕");
		
		//값이 어떤지 비교
		System.out.println(str1==str2);
		System.out.println(str2==str3);
		System.out.println(str3==str4);
		System.out.println(str4==str1);
	}

}
