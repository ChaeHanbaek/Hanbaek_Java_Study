package ex0412_Ch8.sec02_staticmodifier.Ex04_StaticInitialBlock;

class A{
	int a;
	static int b;
	static {
		b = 5; //스태틱 필드 초기화는 static{}내에서 함
		System.out.println("클래스 A 로딩 완료");
	}
	A(){
		a=3; //인스턴스 필드 초기화는 일반적으로 생성자에서 함
	}
}

public class StaticInitialBlock {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		System.out.println(A.b);
		//A.b가 호출되는 시점에서 클래스 A가 메모리에 로딩된다. 이때 static{}안의 초기화 진행
	}

}
