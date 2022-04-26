package ex0412_Ch8.sec02_staticmodifier.Ex03_StaticMethod;

class A {
	void abc() {
		System.out.println("instance 메서드");
	}
	static void bcd() {
		System.out.println("static 메서드");
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//instance method 사용법
		A a1 = new A();
		a1.abc();
		//객체를 만든 다음 사용
		
		//static method 사용법
		A.bcd();
		//클래스 명을 이용해 바로 호출
		A a2 = new A();
		a2.bcd();
		//객체를 만든 다음 사용(권장 안함)
	}

}
