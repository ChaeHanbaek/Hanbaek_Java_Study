package ex0411_ch6;

class A2{
	void print() {
		System.out.println("안녕안녕");
	}
	
	int data() {
		return 3;
	}
	
	double sum(int a, double b) {
		return a+b;
	}
	
	void printMonth(int m) {
		if(m<0||m>13) {
			System.out.println("잘못된 입력");
			return;
		}
		System.out.println(m+"월입니다.");
	}
}

public class Ex03_ExtrenalCallMethods {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		A2 a = new A2();
		a.print();
		int k = a.data();
		a.data();
		System.out.println(k);
		double result = a.sum(9,5.2);
		System.out.println(result);a.printMonth(5);
		a.printMonth(15);
	}

}
