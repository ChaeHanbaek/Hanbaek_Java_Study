//1개의 소스파일에 외부 클래스 구성

package ex0412_ch7_ExternalComponents.Sec02_ExternalClass.Ex01_ExternalClass_1;

class A{
	int m = 5;
	int n = 6;
	
	void print() {
		System.out.println(m+", "+n);
	}
}

public class ExternalClass_1 {

	
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		A a = new A(); //public이 아니어도 같은 패키지 내에서는 객체의 생성및 활용 가능
		a.print();
	}

}
