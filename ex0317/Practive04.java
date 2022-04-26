package ex0317;
//Scanner를 이용하여 소문자 알파벳을 하나 입력받아 다음과 같이 출력하는 프로그램을 작성하시오.
//소문자 알파벳 하나를 입력하시오.
//힌트 Scanner는 문자를 입력받는 기능이 없다. 그러므로 문자열을 입력받아야 한다 다음 코드 참조
// String s = scanner.next(); //문자열 읽기
// char c = s.charAt(); //문자열의 첫번째 문자 가져오기
import java.util.Scanner;

public class Practive04 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		char alphabet []= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','w','x','y','z'};
		System.out.print("소문자 알파벳 하나를 입력하시오.");
		Scanner scanner = new Scanner(System.in);
		char a = scanner.next().charAt(0); //스캐너는 문자를 바로 입력받는 기능이 없다.
		int b = 0;
		for (int i=0;i<alphabet.length;i++) {
			if (a==alphabet[i]) {
				b=i;
			}
		}
		for(int j=b;j>=0;j--) {
			for(int k=0;k<=j;k++) {
				System.out.print(alphabet[k]);
			}
		System.out.println();
		}
	scanner.close();
	}
}
