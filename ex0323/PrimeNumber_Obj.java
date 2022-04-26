package ex0323;
//이전에 만들었던 소수판정 객체지향적 리팩토링
import java.util.Scanner;

class PrimeNum{
	//필드 멤버 변수
	private int big;
	private int small;
	boolean[] pn = new boolean[big+1];
	int count;
	

	public PrimeNum(int i, int j) {
		if(i>j) {
			big=i;
			small=j;
		}
		else {
			big=j;
			small=i;
		}
	}
	
	//멤버 메소드
	//소수 생성 메소드
	public void PrimeGen() { //void는 return타입이 없는거
		boolean[] p = new boolean[big+1];
		for (int i=0; i<p.length;i++) {
			p[i]=true;
		}
		p[0]=p[1]=false; //수를 인덱스로 쓰기 위해 pn[0],pn[1]값은 false로 설정
		
		for(int i=0; i<p.length; i++) { //큰수까지 반복
			if(p[i]==true) {
				for(int j =i*2; j<p.length;j+=i) { //에라토스테네스식 소수 판정 알고리즘
					p[j]=false;
				}
			}
		}
		pn = p;
	}
	
	//소수 출력 메소드
	public void PrimePrint(){
		count=0;
		for(int i=0; i<pn.length; i++) { //큰수까지 반복
			if(pn[i]==true) { //pn[i]값이 true면 출력(소수이면 출력)
				if(i>=small) {
					System.out.print(i+"\t");
					count++;
					if(count%10 == 0)
						System.out.println();
				}
			}
		}
		System.out.println();
		System.out.println("범위 내 소수는 "+count+"개입니다");
	}
}

//main 메소드
public class PrimeNumber_Obj {
	
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁		
		//do-while 사용해서 서로 다른 두 자연수 받는다
		int m, n;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("소수를 구할 범위를 입력해주세요(자연수 2개): ");
			System.out.println("첫번째 자연수를 입력하세요. :");
			m = scanner.nextInt();
			System.out.println("두번째 자연수를 입력하세요. :");
			n = scanner.nextInt();
			if (n==m) {
				System.out.println("서로 다른 수를 입력하세요.");
			}
			else {
				break;				
			}
		}while(true);
		PrimeNum prime = new PrimeNum(n,m);
		prime.PrimeGen();
		prime.PrimePrint();	
		scanner.close();
	}
}
