package ex0412_Ch8.sec02_staticmodifier.Ex01_StaticField_1;

class A{
	int m = 3;
	static int n =5;
}

public class StaticField_1 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//인스턴스 필드 활용법 : 객체를 생성한 후 사용가능
		A a1 = new A();
		System.out.println(a1.m);
		
		//정적 필드 활용법
		//1.객체 생성없이 클래스명으로 바로 활용 가능
		System.out.println(A.n);
		//2.인스턴스 필드처럼 객체 생성후 사용도 가능 (권장 안함)
		A a2 = new A();
		System.out.println(a2.n);
		//두방법에서 활용하는 필드는 동일함
		a2.n = 55;
		System.out.println(a2.n);
		System.out.println(A.n);
	}

}
