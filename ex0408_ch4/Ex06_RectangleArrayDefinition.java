package ex0408_ch4;

public class Ex06_RectangleArrayDefinition {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//2차원 배열의 선언방법1
		int[][] ar1 = new int[3][4];
		int[][] ar2;
		ar2 = new int[3][4];
		System.out.println(ar1.length);
		System.out.println(ar2.length);
		
		//2차원 배열의 선언방법2
		int ar3[][] = new int[3][4];
		int ar4[][];
		ar4 = new int[3][4];
		System.out.println(ar3.length);
		System.out.println(ar4.length);
		
		//2차원 배열의 선언방법3
		int[] ar5[] = new int [3][4];
		int[] ar6[];
		ar6 = new int[3][4];
		System.out.println(ar5.length);
		System.out.println(ar6.length);
		
		//다양한 자료형의 배열 선언
		boolean[][] ar7 = new boolean[3][4];
		int[][] ar8 = new int[2][4];
		double[][] ar9 = new double[3][5];
		String[][] ar10 = new String[2][6];
		System.out.println(ar7.length);
		System.out.println(ar8.length);
		System.out.println(ar9.length);
		System.out.println(ar10.length);
		
	}

}
