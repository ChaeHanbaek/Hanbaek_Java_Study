package ex0310;
// 중첩 if else문 연습
import java.util.Scanner;

public class Nestedif {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요(0~100): ");
		int score=scanner.nextInt();
		System.out.print("학년을 입력하세요(1~4): ");
		int year=scanner.nextInt();
		
		if(score>=60) {
			if(year!=4) System.out.println("합격!");//4학년이 아니면 60점 이상이 합격
			else if(score >=70) System.out.println("합격!");//4학년이면 70점 이상이 합격
			else System.out.println("불합격!");} //4학년이면 70점 미만은 불합격
			else System.out.println("불합격!"); //60점 미만은 불합격
		scanner.close();
		
	}

}
