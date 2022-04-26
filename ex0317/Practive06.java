package ex0317;
/* 정수를 몇 개 저장할지 키보드로부터 개수를 입력받아(100보다 작은 개수)정수 배열을 생성하고, 
 * 이곳에 1에서 100까지 범위의 정수를 랜덤하게 삽입하라. 
 * 단 배열에는 같은 수가 없도록 하여 배열을 출력하시오.
 * 힌트 1에서 10까지 범위의 정수를 랜덤하게 생성할 때 다음 코드를 활용하시오.
 * int x = (int)(Math.random()*10+1);
 */
import java.util.Scanner;

public class Practive06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~100 범위에서 랜덤하게 뽑아낼 정수의 갯수를 입력하시오. : ");
		int num = scanner.nextInt();
		while (num>100) {
			System.out.print("1~100 범위에서 랜덤하게 뽑아낼 정수의 갯수를 입력하시오. : ");
			num = scanner.nextInt();
		}
		int random [] = new int[num];
		boolean jb;
		int count=0;
		while(count<num) {
			jb = false;
			int x = (int)(Math.random()*100+1);
			for(int j=0;j<num;j++) {
				if (x==random[j]) {
					jb = true;	
					break;
				}
			}
			if(jb==false) {
				random[count]=x;
				count +=1;
			}			
		}
		
	for (int k=0;k<num;k++) {
		if(k!=0&k%10==0) {
			System.out.println();
		}
		System.out.print(random[k]+" ");
	}
	scanner.close();
	
	}
}