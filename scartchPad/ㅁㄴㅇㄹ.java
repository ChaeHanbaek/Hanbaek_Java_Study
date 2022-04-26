package scartchPad;

class A{
	boolean a; //bolean을 초기화 안하면 false를 기본값으로 갖게된다.
	int b;
	double c;
	String d;
	
	void abc() {
		System.out.println(b+c);
		System.out.println(c+d);
		System.out.println(d+a);
	}
}

public class ㅁㄴㅇㄹ {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(a.c);
		System.out.println(a.d);
		System.out.println();
		
		a.abc();
	}
}
