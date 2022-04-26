package ex0408_ch4;

public class Ex13_PlusOperationOfString {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//문자열의 +연산자
		//문자열 + 문자열
		String s1= "안녕"+"하세요"+"!";
		System.out.println(s1);
		System.out.println();
		
		String s2 = "반갑";
		s2 += "습니다";
		s2 += "!";
		System.out.println(s2);
		System.out.println();
		
		//문자열 + 기본자료형 //기본자료형 + 문자열
		String s3 = "안녕"+1; //기본자료형이 자동으로 String으로 변해서 합쳐짐
		String s4 = "안녕"+String.valueOf(1);
		String s5 = "안녕"+"1";
		
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println();
		
		//혼용
		System.out.println(1+"안녕");
		System.out.println(1+"안녕"+2);
		System.out.println("안녕"+1+2);
		System.out.println(1+2+"안녕"); 
		//순차대로 계산해서 int값끼리 연산할때는 int값으로 값이 합쳐지고 그다음 string으로 변해서 합쳐짐
	}

}
