package ex0401;
/*가위바위보 게임
* <가위, 바위, 보 게임>
* 1) 가위, 2) 바위, 3) 보
* 선택하세요 : 2
* 나 : 바위, 상대 : 가위
* 당신이 승리하였습니다.
* 1) 다시하기, 2)게임종료 무한 반복
*/

import java.util.Scanner;

public class RockPaperScissor변형 {
	public static String RPS(int x) {
		String a = null;
		if(x==1) {
			a="가위";
		}
		else if(x==2) {
			a="바위";
		}
		else if(x==3) {
			a="보";
		}
		return a;
	}
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("<<가위, 바위, 보 게임>>");
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("1)가위, 2)바위, 3)보");
			System.out.print("선택하세요: ");		
			int u_rps = scanner.nextInt();
			int c_rps = (int)(Math.random()*3+1); //math.random() 0~1 난수 반환
			System.out.println("나   : "+RPS(u_rps));
			System.out.println("상대  : "+RPS(c_rps));


			if((Math.abs(u_rps-c_rps)==1&&(u_rps<c_rps))||(Math.abs(u_rps-c_rps)==2&&(u_rps>c_rps))) {
				System.out.println("당신이 졌습니다.");
				
			}
			else if((Math.abs(u_rps-c_rps)==1&&(u_rps>c_rps))||(Math.abs(u_rps-c_rps)==2&&(u_rps<c_rps))) {
				System.out.println("당신이 이겼습니다.");
								
			}
			else if(u_rps==c_rps) {
				System.out.println("상대와 비겼습니다.");
			}
			
			System.out.println("1)다시 하기, 2)게임 종료");
			int repeat = scanner.nextInt();
			if(repeat==1) {
				continue;
			}
			else if(repeat==2) {
				break;
			}
		}
		scanner.close();
		
	}

}
