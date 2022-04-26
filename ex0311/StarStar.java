package ex0311;
import java.util.Scanner;
public class StarStar {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner scanner=new Scanner(System.in);
		System.out.print("몇행의 별을 만들까요?(7이상 홀수로만 입력): ");
		int f=scanner.nextInt();
		while(f%2!=1||(f<7)) {
			System.out.print("7이상 홀수로 입력해주세요. : ");
			f=scanner.nextInt();
		} 
		int t=f-2;
		for(int i=0; i<(1.5*t-0.5); i++) { //0부터 시작하는 i행, j열
			for(int j=0; j<(2*t-1); j++) {
				if(j==(t-1)-i) {
					System.out.print("*");
				}
				else if(j==(t-1)+i) {
					System.out.print("*");
				}
				else if(i==(t-1)) {
					System.out.print("*");
				}
				else if(j==(i-((t-1)/2))) {
					System.out.print("*");
				}
				else if((j+(i-(t-1)/2))==(t*2-2)) {
					System.out.print("*");
				}
				else if(i==t/2-1) {
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
