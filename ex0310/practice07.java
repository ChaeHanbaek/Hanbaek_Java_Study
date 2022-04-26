package ex0310;
/*Scanner를 이용하여 삼각형의 변의 길이를 나타내는 정수를 3개 입력받고 이 3개의 수로 삼각형을 만들 수 있는지 판별하라.
 * (삼각형이 되려면 두변의 합이 다른 한변의 합보다 커야 한다.)
 * 정수 3개를 입력하시오 >>4 3 5
 * 삼각형이 됩니다.
 */
import java.util.Scanner;
public class practice07 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 3개를 입력하시오. : ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		boolean t=false;
		if ((a>=b)&&(a>=c)) {if (a<b+c) t=true;}
		else if ((b>=a)&&(b>=c)) {if (b<a+c) t=true;}
		else if ((c>=a)&&(c>=b)) {if (c<a+b) t=true;}
		if (t==true) System.out.println("삼각형이 됩니다.");
		else System.out.println("삼각형이 안됩니다.");
		scanner.close();
	}

}
