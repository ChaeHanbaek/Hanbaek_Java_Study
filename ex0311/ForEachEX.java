package ex0311;

public class ForEachEX {
	enum Week {월,화,수,목,금,토,일} //enum 이용해 배열 생성
	
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int[] n= {1,2,3,4,5};
		String names[]= {"사과","배","바나나","체리","딸기","포도"};
		
		int sum = 0;
		//아래 for문에서 k는 n[0]꼴로 반복
		for (int k:n) {
			System.out.print(k+" ");
			sum+=k;
		}
		System.out.println("합은 "+sum);
		
		//아래 for문에서 s는 names[0]꼴로 반복
		for (String s:names) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		//아래 for문에서 day는 월,화,수,목,금,토,일 로 반복
		for(Week day: Week.values()) {
			System.out.print(day+"요일 ");
		}
		System.out.println();
	}

}
