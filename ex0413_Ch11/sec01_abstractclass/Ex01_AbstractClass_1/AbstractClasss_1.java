//추상클래스의 객체 생성방법 1. 자식 클래스 활용
package ex0413_Ch11.sec01_abstractclass.Ex01_AbstractClass_1;

abstract class A{
	abstract void abc();//;으로 끝나는 메서드는 미완성 메서드, {}로 끝나는 메서드는 내용이 없어도 완성 메서드}
}

class B extends A{
	void abc() {
		System.out.println("방법 1. 자식 클래스 생성 및 추상 메서드 구현");
	}
}

public class AbstractClasss_1 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		A b1 = new B();
		A b2 = new B();
		
		b1.abc();
		System.out.println("~~~~~~~~~~~~~~");
		b2.abc();
	}

}
