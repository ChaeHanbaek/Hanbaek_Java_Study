package ex0310;
//Scanner 클래스를 이용하여 원화를 입력받아 달러로 바꾸어 다음 예시와 같이 출력하는 프로그램을 작성하시오. (1$=1,200원)
/* 원화를 입력하세요(단위 원) : 3300
 * 3300원은 $3.0입니다.
 */
import java.util.Scanner;

public class practice05 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner scanner = new Scanner(System.in);
		System.out.print("원화를 입력하세요.(단위 원) : ");
		double won = scanner.nextDouble();
		double dollar = won/1200;
		System.out.println(won+"원은 $"+dollar+"입니다.");
		scanner.close();
	}

}
