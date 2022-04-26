package ex0413_Ch11.sec02_interface.Ex04_CreateObjectOfInterface_1;
// 자식 클래스 생성자로 인터페이스 객체 생성
interface A{
	int a = 3;
	void abc();
}

class B implements A{
	public void abc() {
		System.out.println("방법 1. 자식 클래스 생성자로 객체 생성");
	}
}

public class CreateObjectOfInterface {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		A b1 = new B();
		A b2 = new B();
		
		b1.abc();
		b2.abc();
	}

}
