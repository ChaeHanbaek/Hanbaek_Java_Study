package ex0411;

class A{
	int m;
	void method() {
		System.out.println("A의 메서드");
	}
}

public class Scartch {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		A a = new A();
		a.m=5;
		System.out.println(a.m);
		a.method();
	}

}
