//인터페이스 내의 정적 메서드 실습
//인터페이스에는 public final static 필드, public abstract 메서드
//default 메서드, static 메서드가 들어간다.
package ex0413_Ch11.sec02_interface.Ex08_StaticMethod;

interface A{
	static void abc() {
		System.out.println("A인터페이스의 정적메서드 abc()");
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		A.abc(); //정적 메서드 호출
	}

}
