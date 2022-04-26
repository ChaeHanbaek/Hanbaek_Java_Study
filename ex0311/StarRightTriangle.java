package ex0311;
import java.util.Scanner;
public class StarRightTriangle {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner scanner=new Scanner(System.in);
		System.out.print("몇행의 직각삼각형을 만들까요?(양수로만 입력): ");
		int t=scanner.nextInt();
		while(t<0) {
			System.out.print("양수로 입력해주세요. : ");
			t=scanner.nextInt();
		} 
		for(int i=1; i<=t; i++) { //n행 m꼴로 다듬음
			for(int j=1; j<=t; j++) {
				if(j==1) {
					System.out.print("*");
				}
				else if(j==i) {
					System.out.print("*");
				}
				else if(i==t) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}				
			}
			System.out.println();	
		}
		scanner.close();
	}
}
