package ex0311;
import java.util.Scanner;
public class WhileSample {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int count=0;
		int sum=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("-1을 제외한 평균을 구할 정수들을 입력하고 마지막에 -1을 입력하세요.");
		
		int n = scanner.nextInt(); //조건을 무조건 먼저 보기때문에 값을 받아야 작동, int n 값을 저리 둬야 된다.
		//do -while 을 통해서 작업하고 조건을 보게 바꿔쓸수 있음
		while(n!=-1) { //-1이 입력되야 탈출
			sum+=n;
			count++;
			n=scanner.nextInt();
		}
		if(count==0) { //특별한 경우를 if문이 체크
			System.out.println("입력된 수가 없습니다.");
		}
		else {
			System.out.println("평균은 "+(double)sum/count+"입니다.");
		}
		scanner.close();
	}

}
