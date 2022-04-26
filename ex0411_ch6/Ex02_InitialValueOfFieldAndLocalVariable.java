package ex0411_ch6;

class A1{
	boolean m1;
	int m2;
	double m3;
	String m4;
	
	void printFieldValue() {
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
	}
	
	void printLocalVariable() {
		int k;
		//System.out.println(k); //초기화 안한 변수는 사용불가
	}
}

public class Ex02_InitialValueOfFieldAndLocalVariable {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		A1 a = new A1();
		a.printFieldValue();
	}

}
