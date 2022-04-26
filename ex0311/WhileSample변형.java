package ex0311;
import java.util.Scanner;
public class WhileSample변형 {  //-1 마지막에 안쳐도 되게 개조시도중
	//string 값 넣어서 종료하게 만드는 건 실패, 메시지 띄우고 평균에 의미없는 0을 더하면 종료하는거로 개조하는거로 타협

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int count =0;
		int sum=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("평균을 구할 정수들을 입력하세요.");
		
		int n = scanner.nextInt();
		while(n!=0) {
			System.out.println("추가로 평균을 구할 값들을 넣어주세요, 값을 다넣었으면 마지막에 0을 입력하세요");
			sum+=(int)n;
			count++;
			n=scanner.nextInt();
		}
		if(count==0) {
			System.out.println("입력된 수가 없습니다.");
		}
		else {
			System.out.println("평균은 "+(double)sum/count+"입니다.");
		}
		scanner.close();
	}

}
