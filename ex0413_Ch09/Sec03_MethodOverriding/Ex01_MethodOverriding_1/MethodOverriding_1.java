package ex0413_Ch09.Sec03_MethodOverriding.Ex01_MethodOverriding_1;

class A{
	void print() {
		System.out.println("A클래스");
	}
}

class B extends A{
	@Override
	void print() {
		System.out.println("B클래스");
	}
}

public class MethodOverriding_1 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		A aa = new A();
		aa.print();
		
		System.out.println("메소드 오버라이딩");
		B bb = new B();
		bb.print();
		
		System.out.println("업캐스팅때도 메소드 오버라이딩");
		A ab = new B();
		ab.print();
	}

}
