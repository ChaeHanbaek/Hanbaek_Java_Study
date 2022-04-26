package ex0311;

public class ForSample {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int sum=0;
		
		for(int i=1;i<=10;i++) { //1~10반복
			sum+=i;
			System.out.print(i);
			
			if(i<=9) { //1~9까지는 + 출력
				System.out.print("+");
			}
			else {
				System.out.print("="); //10이면 = 출력하고 덧셈결과출력
				System.out.print(sum);
				
			}
		}
	}

}
