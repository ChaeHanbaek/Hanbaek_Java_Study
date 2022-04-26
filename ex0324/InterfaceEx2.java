package ex0324;

interface PhoneInterface2{ //인터페이스 클래스 선언
		//상수 필드
		public static final int TIMEOUT =10000; //public static 생략가능
		//추상 메소드
		public abstract void sendCall();  //public abstract 생략가능
		void receiveCall();
		//default 메소드
		public default void printLogo() {//public 생략 가능
			System.out.println("** Phone **");
		}
}

interface MobilePhoneInterface extends PhoneInterface2{
	void sendSMS();
	void receiveSMS();
}

interface MP3Interface{
	void play();
	void stop();
}

class PDA{
	public int calculate(int x, int y) {
		return x+y;
	}
}

class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface{
	//오버라이딩으로 인터페이스 클래스의 모든 추상 메소드 구현
	@Override
	public void sendCall() {
		System.out.println("따르릉 따르릉");
	}
	@Override
	public void receiveCall() {
		System.out.println("전화가 왔어요.");
	}
	@Override
	public void sendSMS() {
		System.out.println("문자갑니다.");
	}
	@Override
	public void receiveSMS() {
		System.out.println("문자왔어요.");
	}
	//
	@Override
	public void play() {
		System.out.println("음악 연주합니다.");
	}
	@Override
	public void stop() {
		System.out.println("음악 중단합니다.");
	}
	//추가
	public void schedule() {
		System.out.println("일정 관리합니다.");
	}
}

public class InterfaceEx2 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println("3과 5를 더하면 "+ phone.calculate(3,5));
		phone.schedule();
	}

}
