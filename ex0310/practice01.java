package ex0310;
// 사용자의 이름을 물어보고 이어서 2개의 정수를 받아서 덧셈을 한 후에 결과를 출력하는 다음과 같은 프로그램을 작성하시오.
/* 이름을 입력하시오 : 홍길동
 * 홍길동 씨, 안녕하세요?
 * JAVA에 오신 것을 환영합니다.
 * 첫번째 정수를 입력하시오 : 300
 * 두번째 정수를 입력하시오 : 400
 * 300과 400의 합은 700입니다.
 */
import java.util.Scanner; //Scanner 도구를 자바 유틸에서 가져옴

public class practice01 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner scanner= new Scanner(System.in); // 스캐너 클래스를 생성 선언
		System.out.print("이름을 입력하시오 : ");
		String name = scanner.next();
		System.out.println(name+" 씨, 안녕하세요?");
		System.out.println("JAVA에 오신 것을 환영합니다.");
		System.out.print("첫번째 정수를 입력하시오 : ");
		int num1 = scanner.nextInt(); // scanner.nextInt() 정수값을 받아오는 메서드
		System.out.print("두번째 정수를 입력하시오 : ");
		int num2 = scanner.nextInt();
		System.out.println(num1+" 과"+num2+"의 합은 "+(num1+num2)+" 입니다.");
		scanner.close(); // Scanner 닫기,
	}

}
