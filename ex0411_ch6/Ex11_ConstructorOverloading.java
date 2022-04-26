package ex0411_ch6;

class A4{
	A4(){
		System.out.println("첫 번째 생성자");
	}
	A4(int a){
		System.out.println("두 번째 생성자");
	}
	A4(int a, int b){
		System.out.println("세 번째 생성자");
	}
}

public class Ex11_ConstructorOverloading {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		A4 a = new A4();
		A4 b = new A4(3);
		A4 c = new A4(3,5);
	}

}
