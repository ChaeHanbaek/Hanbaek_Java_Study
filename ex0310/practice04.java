package ex0310;

import java.util.Scanner;

//화씨 온도를 받아서 섭씨 온도로 바꾸는 프로그램을 작성하시오.
/*화씨 온도 : 100
 * 섭씨 온도: 37.77777777777778
 * 힌트: 온도 변환 공식 C=(F-32)*5/9
 */
public class practice04 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner scanner= new Scanner(System.in); // 스캐너 클래스를 생성 선언
		System.out.print("화씨온도 : ");
		double Ftemp = scanner.nextDouble(); // scanner.nextInt() 정수값을 받아오는 메서드
		double Ctemp = (Ftemp-32)*5/9;
		System.out.print("섭씨 온도 : "+Ctemp);
		scanner.close(); // Scanner 닫기,
	}

}
