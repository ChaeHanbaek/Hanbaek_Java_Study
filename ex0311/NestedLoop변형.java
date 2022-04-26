package ex0311;

public class NestedLoop변형 { //1단 출력 막기

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		for(int i=2;i<10;i++) { //2단에서 9단 반복
			for(int j=1;j<10;j++) {//각 단의 구구셈 반복
				System.out.print(i+"*"+j+"="+i*j);//구구셈 출력
				System.out.print('\t');//하나씩 탭으로 띄기
			}
			System.out.println();//각 단 끝나면 다음줄로 띔
		}
	}

}
