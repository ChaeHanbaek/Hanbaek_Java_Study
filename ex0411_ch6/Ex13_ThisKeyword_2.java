package ex0411_ch6;

class A6{
	int m; int n;
	
	void init(int m, int n) { //매개변수명이 같은데 this. 를 빼먹으면 제대로 작동 안됨
		m=m;
		n=n;
	}
}

class B6{
	int m; int n;
	
	void init(int m, int n) {
		this.m = m;
		this.n = n;
	}
}

public class Ex13_ThisKeyword_2 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		A6 a6 = new A6();
		a6.init(2,3);
		System.out.println(a6.m);
		System.out.println(a6.n);
		
		B6 b6 = new B6();
		b6.init(2,3);
		System.out.println(b6.m);
		System.out.println(b6.n);
	}

}
