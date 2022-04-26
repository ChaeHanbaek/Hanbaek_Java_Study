package ex0310;

public class BitOperator {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		//비트 논리 연산
		short a =(short)0x55ff;
		short b =(short)0x00ff;
		
		System.out.println("[비트 연산 결과]");
		//printf는 출력 형식을 정해줌 ""안에 있는게 출력형식을 나타냄""안에 순서대로 출력물에 적용됨
		//in put: System.out.printf("Color %s", Number %s,Float %4.2f",red,123456,3.14);
		//out put: Color red, Number 123456, Float 03.14
		//%u:unsigned 부호비트 빼고 표현 0~256 1바이트(8비트) 표현 가능해짐
		System.out.printf("%04x\n",(short)a&b); //비트 and
		System.out.printf("%04x\n",(short)a|b); //비트 or
		System.out.printf("%04x\n",(short)a^b); //비트 xor
		System.out.printf("%04x\n",(short)~a); //비트 not
		
	
		//비트 시프트 연산
		byte c = 20; //0x14
		byte d = -8; //0xf8	
		System.out.println("[시프트 연산 결과]");
		System.out.println(c<<2); //c를 2비트 왼쪽 시프트
		System.out.println(c>>2); //c를 2비트 오른쪽 시프트, 0 삽입
		System.out.println(d>>2); //d를 2비트 오른쪽 시프트, 1 삽입
		System.out.printf("%x\n",(d>>>2)); //d를 2비트 오른쪽 시프트, 0삽입

	}

}
