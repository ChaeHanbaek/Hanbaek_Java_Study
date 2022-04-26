package ex0310;
import java.util.Scanner;

public class SuccessOrFail {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("점수를 입력하시오: ");
		int score = scanner.nextInt();
		if (score >=80)
			System.out.println("축하합니다! 합격입니다."); //if문의 실행문이 한줄이면 {}로 영역표시할 필요 없다.
		scanner.close();
	}

}
