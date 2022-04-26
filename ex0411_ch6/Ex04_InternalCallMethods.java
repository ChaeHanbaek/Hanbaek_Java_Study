package ex0411_ch6;

public class Ex04_InternalCallMethods {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		print();
		
		int a = twice(3);
		System.out.println(a);
		
		double b = sum(a,5.8);
		System.out.println(b);
	}
	
	
	//static method들은 사용하는거보다 나중에 있어도 컴파일러가 먼저 처리해서 가능
	public static void print() {
		System.out.println("안녕안녕");
	}
	
	public static int twice(int k) {
		return k*2;
	}
	
	public static double sum(int m,double n) {
		return m+n;
	}
}
