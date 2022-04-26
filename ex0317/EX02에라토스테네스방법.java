package ex0317;
/*
<< 에라토스테네스  방법 >>​
1. 2부터 소수를 구하고자 하는 구간의 모든 수를 나열한다.​
2. 2의 배수를 모두 지운다.​
3. 다음 수(3)에 해당하는 배수를 모두 지운다.​
4. 다음 수(5)에 해당하는 배수를 모두 지운다.​
5. 3, 4와 같이 남아 있는 다음 수의 배수를 모두 지운다.​
6. 5번을 반복 수행한다.
*/

//교수님 힌트: 배열에 정수값을 넣는대신 정수를 인덱스삼고 내용물을 t/f로 한다.
//수를 지운다고 생각하지말고 값을 바꿔서 계산과정에서 쓰지않는거로 생각
//나중에 보니 알고리즘이 에라토스테네스 방법이 아니었다.
/* 에라토스테네스식 소수판정
 * 		for(int i=0; i<big; i++) { //큰수까지 반복
			for(int j =i*2; j<big;j+=i) { 
				pn[j]=false;
			}
		}
 */
import java.util.Scanner;

public class EX02에라토스테네스방법 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		System.out.print("소수를 찾을 자연수 범위를 입력해주세요(2,147,483,647이하) : ");
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		while(m>n) {
			System.out.println("작은 수, 큰 수 순으로 입력해주세요.");
			m = scanner.nextInt();
			n = scanner.nextInt();
		}
		boolean decimal[]=new boolean[n+1]; //자연수를 index로 삼아 소수면 true값으로 바꿔서 구분하는 boolean 배열 생성 - 참조변수 decimal
		//boolean 배열의 기본값은 false이므로 구분용으로 사용 가능, 배열은 0부터 만들어지므로 자연수를 인덱스로 쓰려면 n+1개 크기로 만들어야된다.
		boolean ss = true;// 소수인지 확인할 판별값
		for (int i=2;i<=n;i++) {
			ss = true; //매 반복마다 소수여부 판별값을 초기화
			for(int j=2;j<i;j++) {//i를 2부터 i미만으로 나누어지는지 확인한다.
				if(i%j==0) {//나머지가 0이면 나눠지는 수가 있으니 탈출
					ss = false;//소수여부 판별값을 거짓으로 만듬
					break; //그후 나눠보는 과정 탈출
				}
			}
			if(ss==true) {
				decimal[i]=true;
			}
			
		}
		int ss_count=0; //범위내 소수숫자 카운트
		for(int k=m;k<=n;k++) {
			if(decimal[k]==true) {
				if(ss_count!=0) { //소수찾기 카운트가 0이아니면 ", "을 출력해서 앞 소수와 구분
					System.out.print(", ");
				}
				if(ss_count!=0&&ss_count%10==0) { //소수찾기 카운트가 0이아니고 10으로 나눈 나머지가 0이면 줄바꿈
					System.out.println();
				}
				ss_count++; //소수찾기 카운트를 1증가시킨다.
				System.out.print(k);
			}
		}
		System.out.println();
		System.out.println("범위 내 소수는 총 "+ss_count+"개 있습니다."); // 소수찾기 카운트를 출력
		scanner.close();
	}

}
