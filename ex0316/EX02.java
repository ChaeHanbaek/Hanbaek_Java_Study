package ex0316;
//소수는 1과 그 자신만을 약수로 가지는 수이다.
/*1이 아닌 p가 소수일 필요충분조건은 p가 p|m이고 m=ab를 만족하는 임의의 자연수 a, b에 대해 p|a이거나 p|b이다. 
 * 일반적으로 안전하게 개인키, 공개키를 생성하기 위해 큰 소수가 필요하다. 이러한 소수를 찾는 방법을 고민해 보고 있다.​
 * 입력된 두 자연수 범위에 있는 소수를 모두 찾아 출력하시오.*/
import java.util.Scanner;

public class EX02 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁

		System.out.print("소수를 찾을 자연수 범위를 입력해주세요 : ");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		while(x>y) {
			System.out.println("작은 수, 큰 수 순으로 입력해주세요.");
			x = scanner.nextInt();
			y = scanner.nextInt();
		}

		int 소수[]=new int[y]; //소수 모을 배열 선언
		int a = 0; //소수인덱스 변수
		
		//주어진 범위의 수의 약수를 모두 찾는다.
		for(int m=x;m<=y;m++) {
			
			int 약수[]=new int[y] ; //약수 모을 배열 선언
			int n = 0; //약수인덱스 변수
			//주어진 수를 1부터 그 수까지로 나눠보고 나머지가 0일때 나눗수를 약수배열에 넣는다.
			for(int i=1;i<=m;i++) {
				if(m%i==0) {
					약수[n]=i;
					n++;
					//System.out.println("약수"+i+"를 추가했습니다."); //정상작동 확인용.
				}
			}
			//약수배열의 index 1이 그 수 자신이면 소수
			if(약수[1]==m) { 
				//System.out.println(m+" 은/는 소수입니다."); //정상작동 확인용.
				소수[a]=m; // 소수이면 미리 만들어놓은 소수배열에 넣고 소수 인덱스의 값을 1 올린다.
				a++;
			}

		}
		
		System.out.println("범위 내 ("+x+"~"+y+") 소수는 다음과 같습니다.");
		for(int j=0;j<=y;j++) {
			if(소수[j]==0) { //소수배열에 들어가는 초기값은 0이므로 인덱스j가 0이면 값이 안들어간 것이므로 종료한다.
				System.out.println();
				System.out.println("범위 내 소수는 총 "+j+"개 있습니다."); //0부터 시작하므로 그앞에 들어간 소수는 j개
				break;
			}
			if(j>0&&j%10==0) { //인덱스 10마다 줄바꿈을 넣는다.
				System.out.println();
			}
			System.out.print(소수[j]);
			if(소수[j+1]!=0) { 
				System.out.print(", ");
			}

		}
		scanner.close();
	}
}
