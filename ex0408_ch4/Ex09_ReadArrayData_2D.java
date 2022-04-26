package ex0408_ch4;

public class Ex09_ReadArrayData_2D {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//2차원 데이터의 배열의 길이
		//정방 배열
		int[][] a1 = new int[2][3];
		System.out.println(a1.length);
		System.out.println(a1[0].length);
		System.out.println(a1[1].length);
		System.out.println();
		
		//비정방 배열
		int[][] a2 = new int[][] {{1,2},{3,4,5}};
		System.out.println(a2.length);
		System.out.println(a2[0].length);
		System.out.println(a2[1].length);
		System.out.println();
		
		//2차원 배열의 출력 방법
		System.out.print(a2[0][0]+" ");
		System.out.print(a2[0][1]+" ");
		System.out.println();
		System.out.print(a2[1][0]+" ");
		System.out.print(a2[1][1]+" ");
		System.out.print(a2[1][2]+" ");
		System.out.println();
		System.out.println();
		
		//for문
		for(int i=0;i<a2.length;i++) {
			for(int j=0;j<a2[i].length;j++) {
				System.out.print(a2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//for-each문
		for(int[] x:a2) {
			for(int y:x){
				System.out.print(y+" ");
			}
			System.out.println();
		}

	}

}
