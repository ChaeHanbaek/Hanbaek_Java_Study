package ex0316;
//소수는 1과 그 자신만을 약수로 가지는 수이다.
import java.util.Scanner;

public class EX02변형_소수판정 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁

		System.out.print("아무 자연수를 입력해주세요 : ");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int 약수[]=new int[x] ; //약수 모을 배열 선언 //유동적으로 배열크기 늘리는건 불가능?
		int n = 0; //배열위치 변수
		for(int i=1;i<=x;i++) {
			if(x%i==0) {
				약수[n]=i;
				n++;
			}
		}
		if(약수[1]==x) {
			System.out.println(x+" 은/는 소수입니다.");
		}
		else {
			System.out.println(x+" 은/는 소수가 아닙니다.");
		}
		scanner.close();
	}

}
