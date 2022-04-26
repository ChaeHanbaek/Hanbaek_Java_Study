package ex0304;

public class BitOperator {
	public static void main(String[] args) {
		short a = (short)0x55ff;
		short b = (short)0x00ff;
		
		System.out.println("[비트 연산 결과]");
		System.out.printf("%04x\n",(short)(a&b)); //비트 AND
		System.out.printf("%04x\n",(short)(a|b)); //비트 OR
		System.out.printf("%04x\n",(short)(a^b)); //비트 XOR
		System.out.printf("%04x\n",(short)(~a)); //비트 NOT
		
		byte c = 20;
		byte d = -8;
		System.out.println("[시프트 연산 결과]");
		System.out.println(c<<2); //c를 2비트 왼쪽 시프트
		System.out.println(c>>2); //c를 2비트 오른쪽 시프트, 빈칸에 0 삽입
		System.out.println(d>>2); //c를 2비트 왼쪽 시프트, 1삽입
		System.out.printf("%x\n",(d>>>2)); //d를 2비트 오른쪽으로 시프트 0삽입
	}

}
