package ex0310;
//짝수와 홀수 구분 프로그램을 작성하시오.
/* 정수를 입력하시오. : 28
 * 짝수 입니다.
 * 힌트: 조건 연산자를 사용하세요!!!
 */
import java.util.Scanner; //Scanner 도구를 자바 유틸에서 가져옴

public class practice03 {
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner scanner= new Scanner(System.in); // 스캐너 클래스를 생성 선언
		System.out.print("정수를 입력하시오. : ");
		int num = scanner.nextInt(); // scanner.nextInt() 정수값을 받아오는 메서드
		String msg = (num%2==1)?"홀수":"짝수"; // 조건 연산자 ()?T:F ()가 참이면 T를, 거짓이면 F를 반환
				System.out.println(msg+" 입니다.");
		scanner.close(); // Scanner 닫기,
	}
}
