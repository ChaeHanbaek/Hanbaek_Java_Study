package ex0413_Ch09.Sec02_typecasting.Ex01_Typecasting_1;

class A{
	A(){
		System.out.println("A로딩");
	}
}
class B extends A{
	B(){
		System.out.println("B로딩");
	}
}
class C extends B{
	C(){
		System.out.println("C로딩");
	}
}
class D extends B{
	D(){
		System.out.println("D로딩");
	}
}

public class Typecasting_1 {
	public static void main(String[] args) {
		//업캐스팅 (동적바인딩, 자동변환: 생략해도 컴파일러가 자동으로 처리)
		System.out.println("업캐스팅 실험");
		System.out.println("C->A 업캐스팅");
		A ac = (A) new C(); //C->A 업캐스팅
		System.out.println("C->B 업캐스팅");
		A bc = (B) new C(); //C->B 업캐스팅
		B bb = new B();
		System.out.println("B->A 업캐스팅");
		A a = (A) bb;
		System.out.println("-----------");	
		
		//다운캐스팅(수동변환, 예외발생(다운캐스팅할수 없는 상황) 존재)
		System.out.println("다운캐스팅 실험");
		A aa= new A();
		System.out.println("A->B, A->C 다운캐스팅 불가");
		//B b = (B) aa;
		//C c = (C) aa;
		System.out.println("-----------");
		
		//다운캐스팅 가능환 상황
		System.out.println("A->B 다운캐스팅 가능");
		A ab = new B();
		B b = (B) ab; //A->B 다운캐스팅
		System.out.println("A->C 다운캐스팅 불가");
		//C c = (C) ab;
	
		System.out.println("B->D 다운캐스팅 가능");
		B bd = new D();
		D d = (D) bd;
		
		System.out.println("A->B다운캐스팅후 A->D 다운캐스팅은 가능");
		A ad = new D();
		B b1 = (B) ad;
		D d1 = (D) ad;
	}
}
