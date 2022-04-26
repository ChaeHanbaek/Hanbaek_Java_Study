package ex0304;

public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b= 127;
		int i =100;
		
		System.out.println("b+i 값: "+(b+i));
		System.out.println("10/4 값: "+(10/4));
		System.out.println("10.0/4 값: "+(10.0/4));
		System.out.println("(char)0x12340041) 값: "+((char)0x12340041));
		System.out.println("(char)0x1234141) 값: "+((char)0x1234141));
		System.out.println("(byte)(b+i) 값: "+((byte)(b+i)));//()를 최우선으로 연산한다.
		System.out.println("(byte)b+i) 값: "+((byte)b+i));
		System.out.println("(int)(2.9+1.8) 값: "+((int)(2.9+1.8)));
		System.out.println("(int)2.9+(int)1.8) 값: "+((int)2.9+(int)1.8));

		
	}

}
