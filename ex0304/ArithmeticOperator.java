package ex0304;
import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수로 초를 입력하세요: ");
		int time =scanner.nextInt();
		int hour = time/3600;
		int minute = time%3600/60;
		int second = time%3600%60;
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		System.out.println("현재 시간은 "+hour+"시 "+minute+"분 "+second+"초 입니다");
		scanner.close();
		
	}

}
