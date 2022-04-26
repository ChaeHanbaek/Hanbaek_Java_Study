package ex0407_ch3;

public class Ex05_DoWhileControlStatement {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int a;
		a=0;
		while(a<0) {
			System.out.print(a+" ");
			a++;
		}
		System.out.println();
		
		a=0;
		do {
			System.out.print(a+" ");
			a++;
		}while(a<0);
		System.out.println();
		
		//반복횟수 1인 경우 do-while while 비교
		a=0;
		while(a<1) {
			System.out.print(a+" ");
			a++;
		}
		System.out.println();
		
		a=0;
		do {
			System.out.print(a+" ");
			a++;
		} while(a<1);
		System.out.println();
		
		//반복횟수 10인경우 do-while while비교
		a=0;
		while(a<10) {
			System.out.print(a+" ");
			a++;
		}
		System.out.println();
		
		a=0;
		do {
			System.out.print(a+" ");
			a++;
		} while(a<10);
		System.out.println();
		
	}

}
