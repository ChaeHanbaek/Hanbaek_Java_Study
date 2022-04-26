package ex0310;
//Scanner 클래스를 이용하여 정수로 된 돈의 액수를 입력받아 
//오만원권, 만원권,천원권, 500원짜리 동전, 100원짜리동전,50원짜리동전,10원짜리동전,1원짜리동전 각 몇개로 변환되는지 출력하시오.
/*금액을 입력하시오 : 65376원
 * 오만원권 1매
 * 만원권 1매
 * 천원권 5매
 * 백원 3개
 * 오십원 1개
 * 십원 2개
 * 일원 6개
 */
import java.util.Scanner;
public class practice06 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액을 입력하시오. : ");
		int money = scanner.nextInt();
		int 오만원 = money/50000;
		int 만원 = money%50000/10000;
		int 천원 = money%50000%10000/1000;
		int 백원 = money%50000%10000%1000/100;
		int 오십원 = money%50000%10000%1000%100/50;
		int 십원 = money%50000%10000%1000%100%50/10;
		int 일원 = money%50000%10000%1000%100%50%10;
		System.out.println("5만원권 "+오만원+"매");
		System.out.println("만원권 "+만원+"매");
		System.out.println("천원권 "+천원+"매");
		System.out.println("백원 "+백원+"개");
		System.out.println("오십원 "+오십원+"개");
		System.out.println("십원 "+십원+"개");
		System.out.println("일원 "+일원+"개");
	scanner.close();
	}

}
