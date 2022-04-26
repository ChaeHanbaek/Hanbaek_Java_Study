package ex0310;
import java.util.Scanner;
public class practice06변형 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액을 입력하시오. : ");
		int money = scanner.nextInt();
/*		int 오만원 = money/50000;
		int 만원 = money%50000/10000;
		int 천원 = money%50000%10000/1000;
		int 백원 = money%50000%10000%1000/100;
		int 오십원 = money%50000%10000%1000%100/50;
		int 십원 = money%50000%10000%1000%100%50/10;
		int 일원 = money%50000%10000%1000%100%50%10; */ //위식 개선
		int 일원 = money%10/1;
		int 십원 = money%50/10;
		int 오십원 = money%100/50;
		int 백원 = money%1000/100;
		int 천원 = money%10000/1000;
		int 만원 = money%50000/10000;
		int 오만원 = money/50000;
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
