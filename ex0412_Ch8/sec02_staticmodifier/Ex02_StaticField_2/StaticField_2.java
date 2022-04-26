package ex0412_Ch8.sec02_staticmodifier.Ex02_StaticField_2;

class A{
	int m =3;
	static int n =5;
}

public class StaticField_2 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		A a1 = new A();
		A a2 = new A();
		
		//인스턴스 필드 작동 방식 확인
		a1.m = 5;
		a2.m = 6;
		System.out.println(a1.m);
		System.out.println(a2.m);
		//각각의 객체를 만들어서 사용하는 방식이라 각각 다른 값 갖는게 가능
		
		//정적 필드 작동 방식 확인
		a1.n = 7;
		a2.n = 8;
		System.out.println(a1.n);
		System.out.println(a2.n);
		A.n  = 9;
		System.out.println(a1.n);
		System.out.println(a2.n);
		//값이 공유되어 어떤방법으로 접근하든 똑같은 값이 됨
	}

}
