package ex0310;

public class BitOperator2 {
	//비트로 바꿔서 보여주는 함수 만들기
	static String toBinaryString(int x) {
		String zero="000000000000000000000000000000000000";
		String tmp=zero+Integer.toBinaryString(x);
		return tmp.substring(tmp.length()-8);
	}
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁


		int num1=15, num2=20;
		String bit1 = toBinaryString(num1);
		String bit2 = toBinaryString(num2);
		System.out.println(bit1);
		System.out.println(bit2);

		byte c = 20; //0x14
		byte d = -8; //0xf8	
		//비트값 보기
		System.out.println("[비트값으로 보기]");
		System.out.print("c의 비트값: ");
		System.out.println(toBinaryString(c));//c의 비트값 보여줌
		System.out.print("c<<2의 비트값: ");
		System.out.println(toBinaryString((c<<2)));//왼쪽으로 2칸 움직인 c의 비트값 보여줌
		System.out.print("c>>2의 비트값: ");
		System.out.println(toBinaryString((c>>2)));//오른쪽으로 2칸 움직인 c의 비트값 보여줌
		System.out.print("d의 비트값: ");
		System.out.println(toBinaryString(d));//d의 비트값 보여줌
		System.out.print("d>>2의 비트값: ");
		String e= String.format("%8s", Integer.toBinaryString(d>>2).replace(' ','0'));
		System.out.println(e);//오른쪽으로 2칸 움직인 d의 비트값 보여줌
		System.out.print("d>>>2의 비트값: ");
		String f= String.format("%8s", Integer.toBinaryString(d>>>2).replace(' ','0'));
		System.out.println(f);//오른쪽으로 2칸 움직인 d의 비트값 보여줌
		System.out.println(d>>2);
		System.out.printf("%x\n",(d>>>2)); //d에 관해서는 위 함수가 정상작동 안함, 대신해서 보여준 방법도 안통함
	}

}
