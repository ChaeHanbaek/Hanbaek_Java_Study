//인터페이스 구현 및 디폴트 메서드의 오버라이딩 실습
package ex0413_Ch11.sec02_interface.Ex06_DefaultMethod_1;

interface A{
	void abc();
	default void bcd() { //디폴트 메서드 쓰는 이유 //나중에 메서드 추가할때 이미 기존 인터페이스 구현한 클래스들의 오류 방지하기위해 필요
		System.out.println("A 인터페이스의 bcd()");
	}
}

class B implements A{
	public void abc() {
		System.out.println("B클래스의 abc()");
	}
	//디폴트 메서드는 오버라이딩 안해도 오류 발생 안함
}

class C implements A{
	public void abc() {
		System.out.println("C클래스의 abc()");
	}
	public void bcd() { //디폴트 메서드를 오버라이딩해서 덮어씌우는 거도 가능
		System.out.println("C클래스의 bcd()");
	}
}


public class DefaultMethod_1 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		A a1 = new B();
		A a2 = new C();
		
		a1.abc();
		a1.bcd();
		a2.abc();
		a2.bcd();
		
	}

}
