package ex0310;
/* 원의 중심ㅇ르 나타내는 한 점 과 반지름을 실수 값으로 입력받고, 실수 값으로 다른 (x,y)를 입력받아 이 점이 원의 내부에 있는지 판별하여 출력하시오.
 * 원의 중심과 반지름을 입력하시오. : 10, 10, 6.5
 * 점을 입력하시오 : 13 13
 * 점 (13.0,13.0)은 원 안에 있습니다.
 */
import java.util.Scanner;
public class practice09 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner scanner = new Scanner(System.in);
		System.out.print("원의 중심 좌표 (a,b)와 반지름 r을 입력하시오. : ");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double r = scanner.nextDouble();
		System.out.print("점 (x,y)의 좌표를 입력하시오. : ");
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		if ((a-x)*(a-x)+((b-y)*(b-y))<=r*r){
			System.out.println("점 ("+x+","+y+")은 원 안에 있습니다.");}
		else System.out.println("점 ("+x+","+y+")은 원 밖에 있습니다.");
		scanner.close();
		}
	}


