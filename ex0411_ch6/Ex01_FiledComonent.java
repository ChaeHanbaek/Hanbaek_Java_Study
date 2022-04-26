package ex0411_ch6;

class A{
	//필드 
	int m = 3;
	int n = 4;
	void work1() {
		int k = 5; //지역변수
		System.out.println(k);
		work2(3); //wokr2(){}안에 정의된 지역 변수를 스택 메모리에 추가.
	}
	
	void work2(int i) {
		int j =4;
		System.out.println((i+j));
	}
}

public class Ex01_FiledComonent {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		A a = new A();
		
		System.out.println(a.m);
		System.out.println(a.n);
		
		a.work1(); //work1()안에 정의된 지역변수를 스택메모리에 추가.
	}

}
