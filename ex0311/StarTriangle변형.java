package ex0311;
import java.util.Scanner;
public class StarTriangle변형 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner scanner=new Scanner(System.in);
		System.out.print("몇행의 삼각형을 만들까요?(양수로만 입력): ");
		int t=scanner.nextInt();
		while(t<0) {
			System.out.print("양수로 입력해주세요. : ");
			t=scanner.nextInt();
		} 
		for(int i=0; i<t; i++) { //0부터 시작하는 i행, j열
			for(int j=0; j<(2*t-1); j++) {
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
