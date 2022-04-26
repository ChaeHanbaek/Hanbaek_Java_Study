package ex0413_Ch09.Sec01_inheritancepolymorphism.Ex02_Polymorphism;

//상속을 이용한 객체의 다형적 표현
class A{
	A(){
		System.out.println("A로딩");
	}
}
class B extends A{
	B(){
		System.out.println("B로딩");
	}
}
class C extends B{
	C(){
		System.out.println("C로딩");
	}
}
class D extends B{
	D(){
		System.out.println("D로딩");
	}
}


public class Polymorphism {
	public static void main(String[] args) {
		//A타입의 다형적 표현
		System.out.println("A타입의 다형적 표현");
		A a1 = new A();
		A a2 = new B();
		A a3 = new C();
		A a4 = new D();
		
		//B타입의 다형적 표현
		System.out.println("B타입의 다형적 표현");
		//B b1 = new A();
		B b2 = new B();
		B b3 = new C();
		B b4 = new D();
		
		//C타입의 다형적 표현
		System.out.println("C타입의 다형적 표현");
		//C c1 = new A();
		//C c2 = new B();
		C c3 = new C();
		//C c4 = new D();
		
		//D타입의 다형적
		System.out.println("D타입의 다형적 표현");
		//D d1 = new A();
		//D d2 = new B();
		//D d3 = new C();
		D d4 = new D();
	}
}
