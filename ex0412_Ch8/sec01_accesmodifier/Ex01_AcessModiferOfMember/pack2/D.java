package ex0412_Ch8.sec01_accesmodifier.Ex01_AcessModiferOfMember.pack2;

import ex0412_Ch8.sec01_accesmodifier.Ex01_AcessModiferOfMember.pack1.A;

public class D extends A {
	public void print() {
		System.out.print(a+" ");
		System.out.print(b+" "); //상속한것이라서 protected까진 가능
		//default인 c, private인 d는 접근 불가
		System.out.println();
	}
}
