package scartchPad.ch09.생성자;
class A{
	A(){
		System.out.println("A 생성자1");
	}
	A(int a){
		this();
		System.out.println("A 생성자2");
	}
}

class B extends A{
	B(){
		System.out.println("B 생성자1");
	}
	B(int a){
		super(a);
		System.out.println("B 생성자2");
	}
}


public class exexex {
	public static void main(String[] args){
		B bb = new B(5);
	}
}
