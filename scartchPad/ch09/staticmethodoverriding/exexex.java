package scartchPad.ch09.staticmethodoverriding;
class A{
	int m = 2;
	static int n = 4;
	void method1() {
		System.out.println("A클래스 instance method");
	}
	static void method2() {
		System.out.println("A클래스 static method");
	}
}

class B extends A{
	int m = 6;
	static int n = 8;
	void method1() {
		System.out.println("B클래스 instance method");
	}
	static void method2() {
		System.out.println("B클래스 static method");
	}
}
public class exexex {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		A ab = new B();
		System.out.println(ab.m);
		System.out.println(ab.n);
		ab.method1();
		ab.method2();
	}

}
