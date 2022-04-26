//인스턴스 필드의 중복
package ex0413_Ch09.Sec04_overlapmember.Ex01_OverlapInstanceField;

class A{
	int m = 3;
}

class B extends A{
	int m = 4;
}

public class OverlapInstanceField {
	public static void main(String[] args) {
		A aa = new A();
		B bb = new B();
		A ab = new B();
		
		System.out.println(aa.m);
		System.out.println(bb.m);
		System.out.println(ab.m); //인스턴스 필드는 오버라이딩 안됨
	}
}
