package ex0316;

import java.util.Scanner;

public class DivdeByZeroHandling {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			int dividend;
			int divisor;
		
			System.out.print("나뉨수를 입력하시오: ");
			dividend = scanner.nextInt();
			System.out.print("나눗수를 입력하시오: ");
			divisor = scanner.nextInt();
			try {
				System.out.println(dividend+"를 "+divisor+"로 나누면 몫은 "+dividend/divisor+"입니다." );
				break; //break;없으면 안빠져 나와서 scanner.close();가 작동 안함
			}
			catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요");
			}
		}
		scanner.close();
	}
}
