package ex0311;
import java.util.Scanner;
public class StarSquare {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner scanner=new Scanner(System.in);
		System.out.println("n x m꼴의 사각형을  *로 그립니다.");
		System.out.print("만들 사각형의 n값을 알려주세요. : ");
		int n = scanner.nextInt();
		System.out.print("m값을 알려주세요. : ");
		int m = scanner.nextInt();
		for (int i =0; i<n;i++) {
			for(int j=0; j<m;j++) {
				if((i==0)||(i==(n-1))){
					System.out.print("* ");
				}
				else if((j==0)||(j==(m-1))){
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		scanner.close();
	}

}
