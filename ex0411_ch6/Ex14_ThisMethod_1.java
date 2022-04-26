package ex0411_ch6;

class A7{
	A7(){
		System.out.println("첫번째 생성자");
	}
	
	A7(int a){
		this(); //this();는 반드시 생성자의 첫줄에 위치해야함, 기존 생성자와 중복되는 부분을 덜기 위해 사용
		System.out.println("두번째 생성자");
	}
	
	/*
	 * void abc() { this(); //메서드에선 this() 메서드 사용불가. }
	 */
}
public class Ex14_ThisMethod_1 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		A7 a1 = new A7();
		System.out.println();
		A7 a2 = new A7(3);
	}

}
