package scartchPad;
//static 필드 관련 실험
class AAA2{
	int m = 3;
	static int n = 5;
}

public class Test_Static {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		System.out.println(AAA2.n);
		//static 필드는 새 클래스를 생성하는 식으로 접근도 가능
		AAA2 a = new AAA2();
		System.out.println(a.n);
		//이미 static 필드는 올라간 상태라 이렇게 생성해도 같은 필드에 접근하게됨
		a.n = 343;
		System.out.println(AAA2.n);
		System.out.println(a.n);
	}

}
