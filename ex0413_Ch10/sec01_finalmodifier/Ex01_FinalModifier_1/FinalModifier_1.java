package ex0413_Ch10.sec01_finalmodifier.Ex01_FinalModifier_1;
//final 필드와 final 지역변수의 특징 실습
class A1{
	int a = 3;
	final int b = 5;
	A1(){
		
	}
}

class A2{
	int a;
	final int b;
	A2(){
		a=3;
		b=5; //생성자에서 final 필드를 초기화해주면 에러 안발생함
	}
}

class A3{
	int a = 3;
	final int b = 5;
	A3(){
		a=5;
		//b=5; //final 필드가 선언과 동시에 초기화되면 생성자에서도 값을 못바꿈
	}
}

class B{
	void bcd() {
		int a =3 ;
		final int b =5;
		a= 7;
		//b=9; //final 지역변수도 초기화된 이후 값 대입 불가.
	}
}

public class FinalModifier_1 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		A1 a1 = new A1();
		A2 a2 = new A2();
		
		a1.a=7;
		//a1.b=7;
		a2.a=7;
		//a2.b=9;
		//final 필드는 객체생성하고도 값을 못바꿈
	}

}
