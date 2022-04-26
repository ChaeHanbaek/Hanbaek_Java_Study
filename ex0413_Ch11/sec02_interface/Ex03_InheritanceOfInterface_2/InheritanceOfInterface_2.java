//인터페이스 상속 자식 클래스의 접근 지정자 실습
package ex0413_Ch11.sec02_interface.Ex03_InheritanceOfInterface_2;

interface A{
	public abstract void abc();
}

interface B{
	void bcd(); //생략해도 자동으로 붙여줌
}

class C implements A{
	public void abc() {} //내용 정의가 비어있어도 {}썼으면 완성취급
}

class D implements B{
	//void bcd() {} //public을 default(자동부여)로 못바꿈, 이건 컴파일러가 자동처리 안함
	public void bcd() {}
}

public class InheritanceOfInterface_2 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁

	}

}
