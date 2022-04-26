package ex0310;
import java.util.Scanner;
public class GradingSwitch {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner scanner = new Scanner(System.in);
		char grade;
		System.out.print("점수를 입력하세요(0~100): ");
		int score = scanner.nextInt();
		switch (score/10) { //여기서 부터 시작
		case 10: score=100;
		case 9: score=9; grade='A'; break;
		case 8: score=8; grade='B'; break;
		case 7: score=7; grade='C'; break;
		case 6: score=6; grade='D'; break;
		default: grade='F';
		}
		System.out.println("학점은 "+grade+"입니다.");
		scanner.close();
	}

}
