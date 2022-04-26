package ex0411_ch6;

public class Ex08_MethodOverLoading {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		print();
		print(3);
		print(5.8);
		print(2,5);
	}
	
	public static void print() {
		System.out.println("데이터 없음");
	}
	
	public static void print(int a) {
		System.out.println(a);
	}


	public static void print(double a) {
		System.out.println(a);
	}
	
	//인자의 자료형과 숫자가 같은 메소드는 중복 불가
	/*
	 * public static void print(double a) { System.out.println(a); }
	 */
	
	public static void print(int a,int b) {
		System.out.println("a:" + a + ", b: "+ b);
	}
	
	/*
	 * public static void print(int a,int b) { System.out.println("a:" + a + "b: "+
	 * b); return a+b; }
	 */
}
