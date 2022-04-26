package ex0318;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("소수를 구할 범위를 입력해주세요(자연수 2개): ");
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		
		//입력 받은 두 수 큰 수 작은 수로 분류
		int big; int small;
		if(m>n) {
			big=m;
			small=n;
		}
		else {
			big=n;
			small=m;
		}
		// 큰수 이하 소수 찾는 로직
		boolean[] pn = new boolean[big+1]; //큰수 이하를 전부 boolean 배열에 넣음
		for (int i=0; i<pn.length;i++) {
			pn[i]=true;
		}
		pn[0]=pn[1]=false; //수를 인덱스로 쓰기 위해 pn[0],pn[1]값은 false로 설정
		
		int count = 0; //10개씩 끊어서 출력하기 위해 소수찾으면 증가하는 카운트 설정
		for(int i=0; i<pn.length; i++) { //큰수까지 반복
			if(pn[i]==true) { //pn[i]값이 true면 출력(소수이면 출력)
				if(i>=small) {
					System.out.print(i+"\t");
					count++;
					if(count%10 == 0)
						System.out.println();
				}
				for(int j =i*2; j<pn.length;j+=i) { //에라토스테네스식 소수 판정 알고리즘
					//n의 배수이면 소수가 아니기 때문에 2의 배수 지우고(false 만들고), 3의 배수 지우고를 반복한다.
					//j초기값이 i*2인건 i의 1배수는 i자체 이기 때문에 i의 2배수부터 시작하기 위함
					//i값을 증가하는 이유는 인덱스 자체가 그 정수이기때문에 그정수 크기만큼 늘어나면 배수가 되는것과 마찬가지이기 때문이다.
					pn[j]=false;
					//System.out.println(j+"값 확인");
				}
			}
		}
		System.out.println();
		System.out.println("범위 내 소수는 "+count+"개입니다");
		scanner.close();
	}

}
