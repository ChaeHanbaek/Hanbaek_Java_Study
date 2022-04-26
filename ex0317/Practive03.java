package ex0317;
//2차원 배열 n을 출력하는 프로그램을 작성하시오.
//int[][] n= {{1},{1,2,3},{1},{1,2,3,4},{1,2}}
public class Practive03 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int[][] n= {{1},{1,2,3},{1},{1,2,3,4},{1,2}};
		for(int i=0;i<n.length;i++) { //n이 가리키는 레퍼런스 배열의 크기를 이용.
			for(int j=0;j<n[i].length;j++) {
				System.out.print(n[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
