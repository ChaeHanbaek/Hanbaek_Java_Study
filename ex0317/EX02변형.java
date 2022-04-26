package ex0317;
//배열 안쓰고 소수 찾자마자 출력하는 방식

import java.util.Scanner;

public class EX02변형 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁

		System.out.print("소수를 찾을 자연수 범위를 입력해주세요(2,147,483,647이하) : ");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		while(x>y) {
			System.out.println("작은 수, 큰 수 순으로 입력해주세요.");
			x = scanner.nextInt();
			y = scanner.nextInt();
		}
		int s = 0;//소수 찾기 카운트
		
		System.out.println("범위 내 ("+x+"~"+y+") 소수는 다음과 같습니다.");
		
		//약수가 1과 자기 자신이 아니면 소수가 아니니 continue로 바로 다음연산으로 넘어간다.
		boolean ss = true;// 소수인지 확인할 판별값
		for(int i=x;i<=y;i++) {//x~y사이의 값을 i로 대입
			ss = true; //매 반복마다 소수여부 판별값을 초기화
			for(int j=2;j<i;j++) {//i를 2부터 i미만으로 나누어지는지 확인한다.
				if(i%j==0) {//나머지가 0이면 나눠지는 수가 있으니 탈출
					ss = false;//소수여부 판별값을 거짓으로 만듬
					break; //그후 나눠보는 과정 탈출
				}
			}
			if(ss==true) {//소수여부 판별값이 안바뀌었으면 소수
				if(s!=0) { //소수찾기 카운트가 0이아니면 ", "을 출력해서 앞 소수와 구분
					System.out.print(", ");
				}
				if(s!=0&&s%10==0) { //소수찾기 카운트가 0이아니고 10으로 나눈 나머지가 0이면 줄바꿈
					System.out.println();
				}
				s++; //소수찾기 카운트를 1증가시킨다.
				System.out.print(i);
			}
		}		
		System.out.println();
		System.out.println("범위 내 소수는 총 "+s+"개 있습니다."); // 소수찾기 카운트를 출력


		scanner.close();
	}
}
