package ex0413_Ch09.Sec02_typecasting.Ex02_Typecasting_2;

class A {
	int m = 3;
	void abc() {
		System.out.println("A클래스");
	}
}

class B extends A{
	int n = 4;
	void bcd() {
		System.out.println("B클래스");
	}
}

public class Typecasting_2 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//A타입 - A생성자
		A aa = new A();
		System.out.println(aa.m);
		aa.abc();
		
		//B타입 - B생성자
		B bb = new B();
		System.out.println(bb.m);
		System.out.println(bb.n);
		bb.abc();
		bb.bcd();
		
		//A타입 - B생성자 : 다형적 표현
		A ab = new B();
		System.out.println(ab.m);
		ab.abc();
	}

}
