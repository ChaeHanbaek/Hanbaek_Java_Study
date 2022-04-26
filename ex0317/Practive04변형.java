package ex0317;
//배열 안쓰고 만들기
import java.util.Scanner;

public class Practive04변형 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		System.out.print("소문자 알파벳 하나를 입력하시오. : ");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next(); //스캐너는 문자를 바로 입력받는 기능이 없다.
		char alphabet = s.charAt(0);
		char count=alphabet; 
		for(char i='a';i<=alphabet;i++) { //char는 int의 일종이라 +-증감이 먹힌다.
			for(char j='a';j<=count;j++) {
				System.out.print(j);
			}
			count -= 1;
			System.out.println();
		}

		scanner.close();
	}
}
