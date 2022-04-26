//메서드 오버라이딩과 메서드 오버로딩 실습
package ex0413_Ch09.Sec03_MethodOverriding.Ex03_MethodOverriding_3;

class A{
	void print1() {
		System.out.println("A클래스 print1");
	}
	void print2() {
		System.out.println("A클래스 print2");
	}
}

class B extends A{
	@Override
	void print1() {
		System.out.println("B클래스 print1");
	}
	void print2(int a) { //부모 클래스에 없던 인자 추가
		System.out.println("B클래스 print2");
	}
}

public class MethodOverriding_3 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		A aa = new A();
		aa.print1();
		aa.print2();
		System.out.println();
		
		B bb = new B();
		bb.print1();
		bb.print2(); //인자없는 print2()를 쓰면 메서드 오버로딩으로 부모 메서드가 호출됨
		bb.print2(3);// 인자 있는 print2()를 쓰면 메서드 오버로딩으로 자식 메서드가 호출됨
		System.out.println();
		
		//A타입 선언 B생성자 사용
		A ab = new B();
		ab.print1();
		ab.print2();
		//ab.print2(3); //부모타입으로 선언해서 메서드 오버로딩 작동 안함
	}

}
