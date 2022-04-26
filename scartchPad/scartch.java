package scartchPad;

public class scartch {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		String a = new String("안녕");
		String b = new String("안녕");
		System.out.println(a==b);
		
		int d=3;
		System.out.println(d<<1);
		System.out.println(d&=5);
		d -=1;
		System.out.println(d *=2);
		
		System.out.println(7<<2);
		System.out.println(7>>2);
		System.out.println(-7<<2);
		System.out.println(-7>>2);
		
		System.out.println(5&3);
		System.out.println(5|3);
		System.out.println(5^3);
		System.out.println(~5);
		System.out.println(0b00000011);
		System.out.println(0b00000101);
		System.out.println((byte)0b11111010);	//빈자리는 0으로 채워서 계산하기때문에 8자리로 이진수 음수 출력하려면 byte타입을 붙여줘야한다.
		System.out.println(Integer.toBinaryString(-6));

	}

}
