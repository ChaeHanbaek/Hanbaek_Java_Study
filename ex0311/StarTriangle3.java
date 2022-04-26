package ex0311;
import java.util.Scanner;
public class StarTriangle3 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner scanner=new Scanner(System.in);
		System.out.print("몇행의 삼각형을 만들까요?(자연수로만 입력): ");
		int t=scanner.nextInt();
		while(t<0) {
			System.out.print("자연수로 입력해주세요. : ");
			t=scanner.nextInt();
		} 
		for(int i=1; i<=t; i++) { //1부터 시작하는 i행 j열꼴로 다듬음
			for(int j=1; j<(2*t); j++) {
				if(j==(t-(i-1))) {
					System.out.print("*");
				}
				else if(j==(t+(i-1))) {
					System.out.print("*");
				}
				else if(i==t) {
					System.out.print("*");
				}
				if(j==i) {
					System.out.print("*");
				}
				else if((j+i)==(t*2-2)) {
					System.out.print("*");
				}
				else if(i==0) {
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
