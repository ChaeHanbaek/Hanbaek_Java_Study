package scartchPad;

import java.util.Arrays;

public class adsfasf234 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		double[] a = {1.2,3.4,5.6};
		double[] b = a;
		b[0] = 7.8;
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		int[][] d = new int[][] {{1,3,5},{7,9}};
		//for each 로 출력
		for(int [] x:d) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		for (int i = 0; i<d.length;i++) {
			for(int j=0;j<d[i].length;j++) {
				System.out.print(d[i][j]+"\t");
			}
			System.out.println();
		}

		
		
		
	}
}
