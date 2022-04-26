package ex0325;

public class StringEx {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		String a = new String(" C#");
		String b = new String(",C++ ");
		
		System.out.println(a+"의 길이는 " +a.length());
		System.out.println(a.contains("#"));
		
		a= a.concat(b); //a와 b를 연결 " C#,C++ "
		System.out.println(a);
		
		a=a.trim(); //a의 공백 제거 "C#,C++"
		System.out.println(a);
		
		//여기에서 제대로 안바뀌면 charAt(2)에서 에러뜸 #,이 char타입이 아니어서 에러뜨는듯
		a=a.replace("C#","Java"); //a의 C#을 Java로 변경 "Java,C++"
		System.out.println(a);
		
		//,를 기준으로 나눔 s[0] Java // s[1] C++
		String s[] = a.split(",");
		for (int i=0; i<s.length; i++) {
			System.out.println("분리된 문자열"+i+": "+s[i]);
		}
		
		a=a.substring(5); //a의 인덱스 5부터 끝까지 리턴
		System.out.println(a);
		
		char c = a.charAt(2); // a의 인덱스 2의 문자 리턴
		System.out.println(c);
	}

}
