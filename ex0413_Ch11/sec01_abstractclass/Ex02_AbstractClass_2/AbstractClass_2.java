//추상 클래스의 객체 생성 방법 2. 익명 이너클래스 활용
package ex0413_Ch11.sec01_abstractclass.Ex02_AbstractClass_2;

abstract class A{
	abstract void abc();
}

public class AbstractClass_2 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//객체 생성
		A a1 = new A() {
			void abc() {
				System.out.println("방법 2. 익명 이너클래스 활용");
			}			
		};
		//객체를 생성할 때 마다 오버라이딩 해줘야함
		A a2 = new A() {
			void abc() {
				System.out.println("방법 2. 익명 이너클래스 활용");
			}
		};
		
		//호출
		a1.abc();
		a2.abc();
	}

}
