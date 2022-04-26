package ex0316;
//어떤 수의 약수는 1부터 그 수까지로 나누어 나머지가 0인 값이다.
import java.util.Scanner;

public class EX01변형_모든약수찾기 {

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
		System.out.print(x+"의 약수는 ");
		for (int j=0;j<약수.length;j++) {
			if(약수[j]!=0) {
				System.out.print(약수[j]);
			if(약수[j+1]!=0) {
				System.out.print(", ");
			}
			}
		}
		System.out.print("입니다.");
		scanner.close();
	}

}
