package ex0411;

//클래스 구성(정의): 붕어빵 기계
class AA{
	int m = 3;
	void print() {
		System.out.println("객체 생성 및 활용");
	}
}


public class CreateObjectUsageOFMembers {
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//클래스로 부터 객체 생성 : 붕어빵
		AA a = new AA();
		
		//클래스 멤버 활용 : 붕어빵 먹기
		a.m=5;
		System.out.println(a.m);
		
		//클래스 메소드 활용(호출)
		a.print();

		
	}

}
