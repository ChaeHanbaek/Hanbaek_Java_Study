package ex0311;
import java.util.Scanner;
public class ContinueExample {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 5개 입력하세요.");
		int sum=0;
		for(int i=0; i<5; i++) {
			int n = scanner.nextInt();
			if(n<=0) //음수가 입력되면 증감식 실행하고 for문 반복
				continue;
			else
				sum +=n;
		}
		System.out.println("양수의 합은 "+sum);
		scanner.close();
	}

}
