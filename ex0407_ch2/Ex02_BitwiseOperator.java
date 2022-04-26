package ex0407_ch2;

public class Ex02_BitwiseOperator {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//자바 코드로 진법 변환
		int data = 13;
		System.out.println(Integer.toBinaryString(data));
		System.out.println(Integer.toOctalString(data));
		System.out.println(Integer.toHexString(data));
		System.out.println();
		
		System.out.println(Integer.parseInt("1101",2));
		System.out.println(Integer.parseInt("15",8));
		System.out.println(Integer.parseInt("0D",16));
		System.out.println();
		
		//다양한 진법 표현
		System.out.println(13); //10진법
		System.out.println(0b1101); //0b 이진법
		System.out.println(015); // 0 8진법
		System.out.println(0x0D);// 0x 16진법
		System.out.println();
		
		//비트연산자
		//3  = 00000011;
		//10 = 00001010;
		//
		//AND 비트 연산자
		System.out.println(3&10);
		System.out.println(0b0011 & 0b1010);
		System.out.println(0x03 &0x0A);
		System.out.println();
		
		//OR 비트 연산자
		System.out.println(3|10);
		System.out.println(0b0011 | 0b1010);
		System.out.println(0x03 | 0x0A);
		
		//XOR 비트 연산자
		System.out.println(3^10);
		System.out.println(0b0011 ^ 0b1010);
		System.out.println(0x03 ^ 0x0A);
		
		//NOT 비트 연산자
		System.out.println(~3);
		System.out.println(~0b0011);
		System.out.println(~0x03);
	}

}
