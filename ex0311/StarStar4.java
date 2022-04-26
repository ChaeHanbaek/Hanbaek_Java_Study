package ex0311; //숫자커졌을때 제대로 대응안되서 좀 더 고쳐야됨
import java.util.Scanner;
public class StarStar4 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner scanner=new Scanner(System.in);
		System.out.print("몇행의 별을 만들까요?(8이상 짝수로만 입력): ");
		int f=scanner.nextInt();
		while(f%2==1||(f<8)) {
			System.out.print("8이상 짝수로 입력해주세요. : ");
			f=scanner.nextInt();
		} 
		int t=f*3/4;
		for(int i=0; i<f; i++) { //0부터 시작하는 i행, j열
			for(int j=0; j<(2*t+1); j++) {
				if(j==f*1/4) {
					System.out.print("*");
				}
				if(j==f*3/4) {
					System.out.print("*");
				{
			}
		}
			}
		scanner.close();
	}
	}
	}
