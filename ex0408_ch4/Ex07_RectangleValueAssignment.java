package ex0408_ch4;

public class Ex07_RectangleValueAssignment {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//배열객체 생성 및 원소값 초기화 방법1
		int[][] a1= new int[2][3];
		a1[0][0]=1;
		a1[0][1]=2;
		a1[0][2]=3;
		a1[1][0]=4;
		a1[1][1]=5;
		a1[1][2]=6;
		
		System.out.println(a1[0][0]+" "+a1[0][1]+" "+a1[0][2]);
		System.out.println(a1[1][0]+" "+a1[1][1]+" "+a1[1][2]);
		System.out.println();
		
		int[][] a2;
		a2 = new int[2][3];
		a2[0][0]=1;
		a2[0][1]=2;
		a2[0][2]=3;
		a2[1][0]=4;
		a2[1][1]=5;
		a2[1][2]=6;
		for(int[] x:a2) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//배열객체 생성 및 원소값 초기화
		int[][] a3 = new int[][] {{1,2,3},{4,5,6}};
		for(int[] x:a3) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		int[][] a4;
		a4 = new int[][] {{1,2,3},{4,5,6}};
		for(int[] x:a4) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//배열객체 생성 및 원소값 초기화
		int[][] a5 = {{1,2,3},{4,5,6}};
		for(int[] x:a5) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
		/*
		 * int[][] a6; a6 = {{1,2,3},{4,5,6}}; //선언후 이런식으로 치기화 하는건 불가능
		 */

	}

}
