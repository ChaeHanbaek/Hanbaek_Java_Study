//멤버앞 참조변수를 생략 했을때(this.)의 메서드 호출
package ex0413_Ch09.Sec05_superkeywordsupermethod.Ex01_SuperKeywords_1;

class A{
	void abc() {
		System.out.println("A클래스의 abc()");
	}
}

class B extends A{
	void abc() {
		System.out.println("B클래스의 abc()");
	}
	void bcd() {
		abc();//멤버앞 참조변수 생략
	}
}


public class SuperKeyword_1 {
	public static void main(String[] args) {
		B bb = new B();
		bb.bcd();//생략해도 컴파일러가 자동으로 넣어줌
	}
}
