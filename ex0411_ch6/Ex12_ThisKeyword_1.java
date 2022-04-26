package ex0411_ch6;

class A5{
	int m;
	int n;
	
	void init(int a, int b) {
		int c;
		c=3;
		//메소드의 변수와 매개변수가 다른 경우 this빼먹어도 자동생성
		this.m=a;
		this.n=b;
	}
	
	void work() {
		this.init(2,3);
	}
}
public class Ex12_ThisKeyword_1 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		A5 a5 = new A5();
		
		a5.work();
		System.out.println(a5.m);
		System.out.println(a5.n);
	}

}
