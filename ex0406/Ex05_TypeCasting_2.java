package ex0406;

public class Ex05_TypeCasting_2 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//자동 타입 변환 (업케스팅)
		float v1 = 3;
		long v2 = 5;
		double v3 = 7;
		byte v4 = 9;
		short v5= 11;
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
		System.out.println("------------------------");
		
		//수동 타입 변환
		byte v6 = (byte)128; //오버플로우로 128이 아니라 -128
		int v7 = (int)3.5; //정수부분만 가져감
		float v8 = (float)7.5;
		
		System.out.println(v6);
		System.out.println(v7);
		System.out.println(v8);
	}

}
