package ex0406;

public class Ex02_PrimaryDateType_1 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//Boolean 실험
		System.out.println("boolean 값");
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println("-----------------------");
		
		//byte, short, int, long
		System.out.println("정수 타입들 실험");
		byte val1 = 10;
		short val2 = -10;
		int val3 = 100;
		long val4 = -100L; //정수값의 기본형은 int라서 L을 통해 타입 지정
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		System.out.println(val4);
		System.out.println("-----------------------");
		
		//float double
		System.out.println("실수 타입들 실험");
		float val5 = 1.2F;
		double val6 = -1.5;
		double val7 = 5;
		System.out.println(val5);
		System.out.println(val6);
		System.out.println(val7);
	}

}
