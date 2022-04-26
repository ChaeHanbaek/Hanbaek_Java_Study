package ex0411_ch6;

class A3{
	int m;
	
	//생성자 없으면 알아서 default 생성자 추가됨
	
	void work() {
		System.out.println(m);
	}
}

class B{
	int m;
	void work() {
		System.out.println(m);
	}
	
	B(){ //기본 생성자를 직접 정의
		
	}
}

class C{
	int m;
	void work() {
		System.out.println(m);
	}
	
	C(int a){ //입력 매개변수로 int를 받는 생성자를 직접 정의
		m = a;
	}
	
}

public class Ex10_DefaultConstructor {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		A3 a3 = new A3();
		B b = new B();
		C c = new C(3);
		
		a3.work();
		b.work();
		c.work();
	}

}
