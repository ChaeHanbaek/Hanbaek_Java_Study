package ex0325;
//기본 타입의 값으로 Wrapper객체 생성

public class WrapperEx {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//'A'를 소문자로 변환해 출력
		System.out.println(Character.toLowerCase('A'));
		
		
		char c1='4', c2='F';
		//c1이 숫자이면 출력 Character.isDigit(c1)
		if(Character.isDigit(c1)) {
			System.out.println(c1+"는 숫자");
		}
		//c2가 영문자이면 출력 Character.isAlphabetic(c2)
		if(Character.isAlphabetic(c2)) {
			System.out.println(c2+"는 영문자");
		}
		
		//10진수 변환
		System.out.println(Integer.parseInt("-123"));
		//2진수 변환
		System.out.println(Integer.toHexString(28));
		//16진수 변환
		System.out.println(Integer.toBinaryString(28));
		//2진수로 변환했을때 1의개수
		System.out.println(Integer.bitCount(28));
		
		
		Double d = Double.valueOf(3.14);
		//double 자료형을 String으로 변환
		System.out.println(d.toString());
		//String을 double로 변환
		System.out.println(Double.parseDouble("3.14"));
		
		
		boolean b = (4>3);
		//true를 문자열로 변환
		System.out.println(Boolean.toString(b));
		//false 문자열을 boolean으로 변환
		System.out.println(Boolean.parseBoolean("false"));
	}

}
