//멤버앞 super 키워드 사용때 메서드 호출
package ex0413_Ch09.Sec05_superkeywordsupermethod.Ex02_SuperKeywords_2;

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
		super.abc(); //부모클래스의 abc()메서드 호출
	}
}
public class SuperKeyword_2 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		B bb = new B();
		bb.bcd(); //부모 클래스의 abc()메서드가 호출됨
	}

}
