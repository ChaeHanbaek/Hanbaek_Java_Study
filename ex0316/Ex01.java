package ex0316;
//최대 공약수, 최대 공배수 구하는 프로그램 만들기
//알고리즘: 두 수중 큰수를 나뉨수, 작은수를 나눗수에 놓고 나눈 나머지가 0이면 나눗수가 최대공약수이다. 0이 아니면 둘 중 작은 수를 나뉨수, 두 수를 나눈 나머지를 나눗수로 놓고 반복한다.
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner scanner = new Scanner(System.in);
		System.out.print("최대 공약수와 최대 공배수를 구할 두 자연수를 입력해주세요. : ");
		long x = scanner.nextLong();
		long y = scanner.nextLong();
		long a; //나뉨수
		long b; //나눗수
		if(x>y) {		
			a = x;
			b = y;
		}
		else {
			a = y;
			b = x;
		} //두 수 중 큰 수를 나뉨수 a 작은 수를 나눗수 b로 만듬
		while(a%b!=0) {
			long c;
			c=a; //값이 날아가니 나뉨수를 별도의 변수로 저장
			a=b; //b를 나뉨수로 만듬
			b=c%b; //두 수를 나눈 나머지를 나눗수로 만듬
			//System.out.prlongln(a+"와"+b); // 변수 변화 체크용
		}
		System.out.println(x+"와 "+y+"의 최대공약수는 "+b+"이고, 최대공배수는 "+x*y/b+"입니다");
		scanner.close();
		
	}
}
