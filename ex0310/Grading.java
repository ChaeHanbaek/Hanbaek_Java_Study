package ex0310;
import java.util.Scanner;
//if else 문 연습
public class Grading {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		char grade;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요(0~100): ");
		int score = scanner.nextInt();
		if(score>90)grade='A'; // 90 < score
		else if(score>=80)grade='B'; // 80<=score<90
		else if(score>=70)grade='C'; // 70<=score<80
		else if(score>=60)grade='D'; // 60<=score<70
		else grade ='F'; // score < 60
		System.out.print("당신의 학점은 "+grade+" 입니다.");
		
		scanner.close();
	}

}
