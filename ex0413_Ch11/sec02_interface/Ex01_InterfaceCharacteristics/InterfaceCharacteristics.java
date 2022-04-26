//인터페이스내 필드및 메서드의 제어자 실습
package ex0413_Ch11.sec02_interface.Ex01_InterfaceCharacteristics;

interface A{
	public static final int a = 3; //인터페이스내 모든 필드는 public static final
	public abstract void abc(); //인터페이스내 모든 메서드는 public abstract
}

interface B{
	int b = 3;
	void bcd(); //생략했을때 자동으로 붙여준다.
}
public class InterfaceCharacteristics {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//인터페이스내 필드는 static의 특성을 가지고 있음
		System.out.println(A.a);
		System.out.println(B.b);
		
		//final 특성도 있어서 값 수정 불가
		//A.a=5;
		//B.b=5;
	}

}
