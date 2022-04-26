package ex0323;
//피보나치 수열 0, 1, 1 ,2 ,3 ,5 ...식으로 0,1로 시작해서 앞의 두개를 더해서 값으로 가지는 수열
//입력값 N는 10<=N<100으로 입력
//int 범위 내의 정수만 입력
//한줄에 10개씩 출력, 10번째수는 다음줄로 이동하여 출력
//정수 값이 2, 147, 483,647을 넘어가면 반복문을 종료한다.
import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("철수는 토끼 한 쌍을 구매하여 집에서 키우게 되었다. 토끼는 다음과 같은 조건에 따라 생육 번식한다.​ 태어난 지 두 달 이상이 된 토끼만 번식이 가능하다.​ 번식 가능한 토끼 한 쌍은 매달 새끼 한 쌍을 낳는다. ​토끼는 죽지 않고 계속 번식한다.");
		System.out.print("N개월까지의 토끼수를 계산합니다. N을 입력해주세요. (10<=N<100) : ");
		Scanner scanner = new Scanner(System.in);
		int m = 0;
		do {
		m= scanner.nextInt();
		if(m<10||m>100) {
			System.out.print("10에서 100사이로 입력해주세요: ");
		}
		else {
			break;
		}
		}while(true);
		
		int rabbit []= new int[m+1];
		rabbit[0]=0;
		rabbit[1]=1;
		
		//피보나치 수열 배열에 넣기
		int error=0;// int 최대값 넘어가는 횟수 찾기용 변수
		for (int i=2;i<=m;i++) {
			int k =(rabbit[i-2]+rabbit[i-1]);
			if (k<0) {//int 범위 넘어가서 0보다 작게되면 탈출, 이유는 모르지만 2,147,483,647와 대소비교해놓으면 작동안됨
				System.out.println("int 최대치 초과");
				error=i;
				break;
			}
			else {//int 범위 안의 숫자는 제대로 배열에 값을 넣어준다.
				rabbit[i]=k;
			}
		}
		//출력
		int count=0;
		for (int j=1;j<m;j++) {
			if(j==error) {
				break;
			}
			if (count%10==0) {
				System.out.println();
			}
			System.out.print(rabbit[j]+"\t");
			count++;
		}
		if (error!=0) {
			System.out.println();
			System.out.println("int 최대치를 넘어가 "+(error-1)+"개월 까지만 계산되었습니다.");
		}
		scanner.close();
	}

}
