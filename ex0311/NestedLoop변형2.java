package ex0311;

public class NestedLoop변형2 { //각단출력을 행기준에서 열기준으로 바꾸기 //각단 표시하게 바꾸기

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//Sytem.out.print("1단\t"+~"9\t"); 으로 간단하게 처리해도 됨
		for(int i=0;i<10;i++) { // 각 곱
			for(int j=2;j<10;j++) {//2단에서 9단 반복
				if(i==0) { //i==0이면 단표시 출력
					System.out.print(j+"단");//구구단 각단 표시
					System.out.print('\t');//하나씩 탭으로 띄기
				}
				else { //i!=0이면 구구셈 출력
					System.out.print(j+"*"+i+"="+j*i);//구구셈 출력
					System.out.print('\t');//하나씩 탭으로 띄기
				}
			}
			System.out.println();//각 곱 끝나면 다음줄로 띔
		}
	}

}
