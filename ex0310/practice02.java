package ex0310;
//사용자로부터 분자와 분모값을 입력받아 몫과 나머지를 출력하는 프로그램을 작성하시오.
/* 분자를 입력하시오 :7
 * 분모를 입력하시오 :4
 * 나눗셈의 몫 = 1
 * 나눗셈의 나머지 =3
 */
import java.util.Scanner; //Scanner 도구를 자바 유틸에서 가져옴

public class practice02 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner scanner= new Scanner(System.in); // 스캐너 클래스를 생성 선언
		System.out.print("분자를 입력하시오 : ");
		int numerator = scanner.nextInt(); // scanner.nextInt() 정수값을 받아오는 메서드
		System.out.print("분모를 입력하시오 : ");
		int denominator = scanner.nextInt(); 
		System.out.println("나눗셈의 몫 = "+(numerator/denominator));
		System.out.println("나눗셈의 나머지 = "+(numerator%denominator));		
		scanner.close(); // Scanner 닫기,
	}

}
