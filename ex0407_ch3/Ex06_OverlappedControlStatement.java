package ex0407_ch3;

public class Ex06_OverlappedControlStatement {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//if-if 중복
		int v1 = 5;
		int v2 = 3;
		if(v1>5) {
			if(v2<2) {
				System.out.println("실행1");
			}
			else {
				System.out.println("실행2");
			}
		}
		else {
			System.out.println("실행3");
		}
		System.out.println();
		
		//switch-for 중복
		int v3 = 2;
		switch(v3) {
		case 1:
			for(int k=0;k<10;k++) {
				System.out.print(k+" ");
			}
			break;
		case 2:
			for(int k=10;k>0;k--) {
				System.out.print(k+" ");
			}
			break;
		}
		System.out.println();
		System.out.println();
		
		//for-for-if
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				System.out.println(i+" "+j);
				if(i==j) {
					System.out.println("i==j");
				}
			}
		}
	}

}
