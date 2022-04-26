package ex0412_ch7_ExternalComponents.Sec01_PackageImport;

//import로 가져오는 방법
import ex0412_ch7_ExternalComponents.Sec01_PackageImport.common.A;

public class PackageImport_2 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
			A a = new A();
			
			System.out.println(a.m);
			System.out.println(a.n);
			a.print();
	}

}
