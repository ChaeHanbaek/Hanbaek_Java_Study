package ex0406;

public class Ex01_FloatVsDouble {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		// float 정밀도 확인 소수점 7자리까지 정확
		System.out.println("Java float타입의 정밀도 확인");
		float f1 = 1.0000001f;
		System.out.println(f1);
		float f2 = 1.00000001f;
		System.out.println(f2);
		
		//
		System.out.println("Java double타입의 정밀도 확인: 소숫점 15자리");
		double d1 = 1.0000001d;
		System.out.println(d1);
		double d2 = 1.00000001d;
		System.out.println(d2);
		double d3 = 1.000000000000001d;
		System.out.println(d3);
		double d4 = 1.0000000000000001d;
		System.out.println(d4);
		
		
		
	}

}
