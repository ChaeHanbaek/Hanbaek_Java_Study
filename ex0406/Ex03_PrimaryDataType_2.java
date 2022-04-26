package ex0406;

public class Ex03_PrimaryDataType_2 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//문자, 정수
		System.out.println("char의 특징");
		char val1 = 'A';
		char val2 = '가';
		char val3 = '3';
		
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		System.out.println("----------------------------"); //System.out.println 단축키 syso+ctrl+space
		
		//정수로 입력
		System.out.println("char값 유니코드표를 거쳐 정수로 저장");
		char val4 = 65;
		char val5 = 0xac00;
		char val6 = 51;
		System.out.println(val4);
		System.out.println(val5);
		System.out.println(val6);
		System.out.println("------------------------");
		
		//유니코드로 입력
		System.out.println("char값 유니코드로 직접 입력도 가능");
		char val7 = '\u0041';
		char val8 = '\uac00';
		char val9 = '\u0033';
		
		System.out.println(val7);
		System.out.println(val8);
		System.out.println(val9);
		
	}

}
