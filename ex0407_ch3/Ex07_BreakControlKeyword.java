package ex0407_ch3;

public class Ex07_BreakControlKeyword {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//break 제어문 실습
		for(int i=0;i<10;i++) {
			System.out.println(i);
			break;
		}
		System.out.println();
		
		for(int i = 0; i<10; i++) {
			if(i==5) {
				System.out.println(i+"번째에서 탈출");
				break;
			}
			System.out.println(i+" ");
		}
		System.out.println();
		
		//다중 반복문 break로 탈출
		// 하나의 반복문만 탈출
		for(int i=0;i<5;i++) {
			for(int j=0; j<5; j++) {
				if(j==2) {
					break;
				}
				System.out.println(i+", "+j);
			}
		}
		System.out.println();
		
		//다중반복문 한번에 탈출 방법1: break label 이용
		POS1: for(int i = 0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j==2) {
					i=100;
					break POS1;
				}
				System.out.println(i+", "+j);
				
			}
			System.out.println();
		}
	}

}
