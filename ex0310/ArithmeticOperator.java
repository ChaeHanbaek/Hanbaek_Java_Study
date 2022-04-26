package ex0310;
import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("초를 정수로 입력하세요: ");
		int time =scanner.nextInt(); //정수입력
		int hour = (time/60)/60; //시간은 60으로 나눈 몫을 다시 60으로 나눈 몫
		int minute = (time/60)%60; //분은 60으로 나눈 몫을 다시 60으로 나는 나머지
		int second = time%60;//초는 60으로 나눈 몫의 나머지
/*		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second); */
		System.out.println(time+"초는 "+hour+"시간 "+minute+"분 "+second+"초 입니다");
		scanner.close();
		
	}

}
