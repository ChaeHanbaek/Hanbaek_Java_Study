package scartchPad;

public class 이차원배열_출력 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int score = 95;
		if(score >= 90) {
			System.out.println("A학점");
		}
		else if (score>=80&&score<90) {
			System.out.println("B학점");
		}
		else if (score>=70&&score<80) {
			System.out.println("C학점");
		}
		else if (score<70) {
			System.out.println("D학점");
		}
		
		switch(score/10) { //int 값을 소숫점 버림하는걸 이용
		case 7:
			System.out.println("C학점");
			break;
		case 8:
			System.out.println("B학점");
			break;	
		case 9:
			System.out.println("A학점");
			break;
		default:
			System.out.println("D학점");
			break;
		}
		
		for(int i=0; ;i+=2) {
			if(i>10) {
				break;
			}
			System.out.println(i);
		}
		
		for(int i = 10;i>0;i-=2) {
			System.out.println(i);
		}
		
		int a =10;
		while(a>0) {
			System.out.println(a);
			a-=2;
		}
		
		for(int i = 0; i<5; i++) {
			for(int j=0; j<3;j++) {
				if(i==2) {
					continue;
				}
				if(j==1) {
					break;
				}
				System.out.println("A");
			}
		}
	}

}
