package ex0324;

interface PhoneInterface{ //인터페이스 클래스 선언
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

class SamsungPhone implements PhoneInterface{
	//오버라이딩으로 인터페이스 클래스의 모든 추상 메소드 구현
	@Override
	public void sendCall() {
		System.out.println("띠리리링");
	}
	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}
	//구현 뿐만 아니라 추가 메소드 작성도 가능
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}
}

public class InterfaceEx {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
	}

}
