package ex0407_ch3;

public class Ex02_SwitchControlStatement {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int v1 = 2;
		//break없는 경우 //맞는 값으로 점프한뒤 그뒤 전부 실행
		switch(v1) {
		case 1:
			System.out.println("A");
		case 2:
			System.out.println("B");
		case 3:
			System.out.println("C");
		case 4:
			System.out.println("D");
		}
		System.out.println();
		
		//break 있는 경우 //맞는 값으로 점프한뒤 break문으로 탈출
		int v2= 2;
		switch(v2) {
		case 1:
			System.out.println("A");
			break;
		case 2:
			System.out.println("B");
			break;
		case 3:
			System.out.println("C");
			break;
		case 4:
			System.out.println("D");
			break;
		}
		System.out.println();
		
		//switch문을 if-else 구문으로 변환
		if(v1==1) {
			System.out.println("A");
		}
		else if (v2==2) {
			System.out.println("B");
		}
		else if (v2==3) {
			System.out.println("C");
		}
		else {
			System.out.println("D");
		}
	}
}
