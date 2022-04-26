package ex0413_Ch10.sec01_finalmodifier.Ex02_FinalModifier_2;
//final 메서드와 final 클래스의 특징 실습

class A{
	void abc() {}
	final void bcd() {}
}

class B extends A{
	void abc() {}
	// void bcd() {} //final 메서드는 상속해서 오버라이딩 불가
}

final class C{}

//class D extends C{} //final 클래스는 상속불가

public class FinalModifier_2 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁

	}

}
