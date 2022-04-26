//자식 클래스의 부모 인터페이스의 디폴트 메서드 호출
package ex0413_Ch11.sec02_interface.Ex07_DefaultMethod_2;

interface A{
	default void abc() {
		System.out.println("A인터페이스의 abc()");
	}
}

class B implements A{
	public void abc() {
		A.super.abc(); //부모 인터페이스A의 abc()메서드 호출
		System.out.println("B클래스의 abc()"); //자식 클래스에서 추가
	}
}

public class DefaultMethods_2 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		B b = new B();
		b.abc(); //B객체의 abc()를 호출 할때 A인터페이스의 abc()메서드도 같이 호출됨
	}

}
