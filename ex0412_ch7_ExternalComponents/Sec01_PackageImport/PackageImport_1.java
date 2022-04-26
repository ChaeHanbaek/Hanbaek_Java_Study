package ex0412_ch7_ExternalComponents.Sec01_PackageImport;
//하위패키지로 공통의 패키지 폴더를 만들고 이를 참고하는 클래스 실습
//하위패키지를 만드려면 패키지 이름뒤에 .을 찍고 이를 보려면 이클립스 패키지 프리젠테이션 옵션을 계층별보기로 바꾸면 된다.
public class PackageImport_1 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//객체 생성
		//다른 패키지의 클래스를 사용할 때는 패키지명을 포함한 풀네임을 사용해야 한다.
		ex0412_ch7_ExternalComponents.Sec01_PackageImport.common.A a = new ex0412_ch7_ExternalComponents.Sec01_PackageImport.common.A();
		//패키지 경로 자체를 이용해 가져오는 방법
		System.out.println(a.m);
		System.out.println(a.n);
		a.print();
	}

}
