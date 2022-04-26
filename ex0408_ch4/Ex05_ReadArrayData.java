package ex0408_ch4;

import java.util.Arrays;

public class Ex05_ReadArrayData {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int[] a = new int[] {3,4,5,6,7};
		//배열의 길이 구하기
		System.out.println(a.length);
		
		//출력하기
		System.out.print(a[0]+" ");
		System.out.print(a[1]+" ");
		System.out.print(a[2]+" ");
		System.out.print(a[3]+" ");
		System.out.print(a[4]+" ");
		System.out.println();
		
		//for문으로 출력하기
		for (int i =0; i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		
		//for-each 문으로 출력하기
		for(int x:a) {
			System.out.print(x+" ");
		}
		System.out.println();
		
		//Arrays.toString()으로 출력하기
		System.out.println(Arrays.toString(a));
		
		
	}

}
