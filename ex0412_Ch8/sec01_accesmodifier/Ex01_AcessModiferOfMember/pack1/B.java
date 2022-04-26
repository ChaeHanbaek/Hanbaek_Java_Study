package ex0412_Ch8.sec01_accesmodifier.Ex01_AcessModiferOfMember.pack1;

public class B {
	public void print() {
		A a = new A();		
		System.out.print(a.a+" ");
		System.out.print(a.b+" ");
		System.out.print(a.c+" ");
		//System.out.print(a.d+" "); //private 필드는 접근 불가
		System.out.println();
	}
}
