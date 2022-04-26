package ex0407_ch3;

public class Ex04_WhileControlStatement {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//while 기본 구조
		int a = 0; //초기식
		while (a<10) { //조건식
			System.out.print(a+" ");
			a++; //증감식
		}
		System.out.println();
		
		//for문으로 변환
		for(int i=0;i<10;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		int b = 10;
		while(b>10) {
			System.out.print(b+" ");
			b--;
		}
		System.out.println();
		
		//for문 변환
		for(int i=10; i>0; i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//무한루프
		/*
		 * while(true){
		 * 	System.out.print("무한루프");
		 * }
		 */
		//무한 루프 탈출
		int c = 0;
		while (true) {
			if(c>10) {
				break;
			}
			System.out.print(c+" ");
			c++;
		}
	}

}
