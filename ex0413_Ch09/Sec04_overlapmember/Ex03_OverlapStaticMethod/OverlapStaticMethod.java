package ex0413_Ch09.Sec04_overlapmember.Ex03_OverlapStaticMethod;

class A{
	static void print() {
		System.out.println("A 클래스");
	}
}

class B extends A{
	static void print() {
		System.out.println("B 클래스");
	}
}

public class OverlapStaticMethod {
	public static void main(String[] args) {
		//static method는 바로 접근 가능
		A.print();
		B.print();
		System.out.println();
		
		//객체 생성
		A aa = new A();
		B bb = new B();
		A ab = new A();
		
		aa.print();
		bb.print();
		ab.print();//static 메서드도 오버라이딩 안됨
	}
}
