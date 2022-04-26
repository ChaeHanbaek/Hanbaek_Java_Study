package ex0406;

public class Ex04_TypeCasting_1 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//캐스팅 방법1 (데이터 타입)값
		int v1 = (int)5.3;
		long v2 = (long)10;
		float v3 = (float)5.8;
		double v4 = (double)16;
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println("---------------------------");
		
		//캐스팅 방법2 값L, 값F or 값l, 값f //왜냐하면 정수는 기본이 int, 실수는 double로 정해져있기 떄
		long v5 = 10L;
		long v6 = 10l;
		float v7 = 5.8F;
		float v8 = 5.8f;
		
		System.out.println(v5);
		System.out.println(v6);
		System.out.println(v7);
		System.out.println(v8);
		
	}

}
