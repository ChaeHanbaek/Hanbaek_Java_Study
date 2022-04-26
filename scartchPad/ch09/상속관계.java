package scartchPad.ch09;


class A{}
class B extends A{}
class C extends B{}
class D extends C{}
class E extends B{}

public class 상속관계 {
	public static void main(String[] args){
		System.out.println("A타입의 다형적 표현");
		A a1 = new A();
		//B b1 = (B)a1;
		//C c1 = (C)a1;
		//D d1 = (D)a1;
		//E e1 = (E)a1;
		
		A a2 = new B();
		B b2 = (B)a2;
		//C c2 = (C)a2;
		//D d2 = (D)a2;
		//E e2 = (E)a2;
		
		A a3 = new C();
		B b3 = (B)a3;
		C c3 = (C)a3;
		//D d3 = (D)a3;
		//E e3 = (E)a3;
	}
}
