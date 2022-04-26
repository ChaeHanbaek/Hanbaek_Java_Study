package ex0408_ch4;

public class Ex08_NonRectangleArray {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//비정방 행렬의 선언 및 값 대입방법1
		int[][] a1= new int[2][];
		a1[0]= new int[2];
		a1[0][0]=1;
		a1[0][1]=2;
		a1[1]=new int[3];
		a1[1][0]=3;
		a1[1][1]=4;
		a1[1][2]=5;
		for(int[] x:a1) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		int[][] a2 = new int[2][];
		a2[0] = new int[] {1,2};
		a2[1] = new int[] {3,4,5};
		
		for(int[] x:a2) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
		int[][] a3 = new int[][] {{1,2},{3,4,5}};
		for(int[] x:a3) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		int[][] a4;
		a4=new int[][] {{1,2},{3,4,5}};
		for(int[] x:a4) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//비정방행렬의 선언 및 값 대입방법
		int[][] a5 = {{1,2},{3,4,5}};
		for(int[] x:a5) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
/*		int[][] a6;
		a6= {{1,2},{3,4,,5};*/ //불가능
	}

}
