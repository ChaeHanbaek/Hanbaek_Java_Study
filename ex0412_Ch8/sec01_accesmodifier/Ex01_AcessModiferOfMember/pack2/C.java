package ex0412_Ch8.sec01_accesmodifier.Ex01_AcessModiferOfMember.pack2;

import  ex0412_Ch8.sec01_accesmodifier.Ex01_AcessModiferOfMember.pack1.A;

public class C {
	public void print() {
		A a = new A();
		System.out.print(a.a);
		// b,c,d는 다른 패키지라서 접근 불가능
		System.out.println();
	}
}
