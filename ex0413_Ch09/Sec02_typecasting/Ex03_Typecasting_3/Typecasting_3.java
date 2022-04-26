package ex0413_Ch09.Sec02_typecasting.Ex03_Typecasting_3;

class A{}
class B extends A{}

public class Typecasting_3 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//instanceof : 캐스팅 가능 여부를 확인하는 메서드
		//가능하면 true, 불가능하면 false값을 던져줌
		A aa = new A();
		A ab = new B();
		
		System.out.println(aa instanceof A);
		System.out.println(ab instanceof A);
		
		System.out.println(aa instanceof B);
		System.out.println(ab instanceof B);
		
		if(aa instanceof B) {
			B b = (B) aa;
			System.out.println("aa를 B로 캐스팅했습니다.");
		}
		else {
			System.out.println("aa는 B타입으로 캐스팅 불가능");
		}
		if(ab instanceof B) {
			B b = (B) ab;
			System.out.println("ab를 B로 캐스팅했습니다.");
		}
		else {
			System.out.println("ab는 B타입으로 캐스팅 불가능");
		}
		if("안녕" instanceof String) {
			System.out.println("\"안녕\"은 String 클래스입니다.");
		}
		else {
			System.out.println("\"안녕\"은 String 클래스가 아닙니다.");
		}
	}

}
