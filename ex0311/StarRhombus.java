package ex0311;
import java.util.Scanner;
public class StarRhombus {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner scanner=new Scanner(System.in);
		System.out.print("마름모 한변의 별의 수를 입력해주세요. : ");
		int s=scanner.nextInt();
		while(s<0) {
			System.out.print("양수로 입력해주세요. : ");
			s = scanner.nextInt();
		} 
		for(int i=0; i<=2*(s-1); i++) { //n행 m꼴로 다듬음
			for(int j=0; j<=2*(s-1); j++) {
				if (Math.abs(i-j)==(s-1)) {
					System.out.print("*");
				}
				else if (Math.abs(i+j)==(s-1)) {
					System.out.print("*");
				}
				else if (Math.abs(i+j)==3*(s-1)) {
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
