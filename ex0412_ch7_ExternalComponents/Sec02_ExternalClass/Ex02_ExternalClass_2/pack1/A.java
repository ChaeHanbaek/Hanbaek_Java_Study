//외부 클래스를 별도의 파일로 분리
package ex0412_ch7_ExternalComponents.Sec02_ExternalClass.Ex02_ExternalClass_2.pack1;

//별도의 파일(A.java)로 분리해 A를 public 클래스로 선언하면 다른 패키지에서 임포트 가능
public class A {
	int m = 3;
	int n = 4;
	
	public void print() {
		System.out.println(m+"//"+n);
	}
}
