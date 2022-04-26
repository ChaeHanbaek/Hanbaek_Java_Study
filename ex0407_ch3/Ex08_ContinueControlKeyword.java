package ex0407_ch3;

public class Ex08_ContinueControlKeyword {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//단일 루프에서의 continue
		for(int i=0; i<10; i++) {
			continue;
			//continue 뒤에 있는 코드는 작동안해서 컴파일러 에러 경고
		}
		System.out.println();
		
		for(int i=0; i<10; i++) {
			System.out.print(i+" ");
			continue;
		}
		System.out.println();
		
		for(int i=0; i<10; i++) {
			if(i==5) {
				System.out.println(i+"에서 continue");
				continue;
			}
			System.out.println(i+" ");
		}
		System.out.println();
		
		//이중 루프에서의 continue
		for(int i=0;i<5;i++) {
			for(int j=0; j<5; j++) {
				if(j==3) {
					System.out.println(i+", "+j+"에서 continue");
					continue;
				}
				System.out.println(i+", "+j);
			}
		}		
		System.out.println();
		
		POS1: for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j==3) {
					System.out.println(i+", "+j+"에서 continue");
					continue POS1;
				}
				System.out.println(i+", "+j);
			}
		}
	}

}
