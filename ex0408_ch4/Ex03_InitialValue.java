package ex0408_ch4;

import java.util.Arrays;

public class Ex03_InitialValue {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		// stack 메모리값 강제 초기화 안됨 
		///초기화 안하고 쓰려고하면 에러 발생 //값이 초기화 안된상태라서 못씀
/*		
		int value1; System.out.print(value1);
		int[] v2; System.out.println(v2);
*/
		int v3= 0 ;
		System.out.println(v3);
		int[] v4 = null; //null값으로라도 초기화 시키면 사용 가능
		System.out.println(v4);
		System.out.println();
		
		//heap 메모리값은 강제초기화됨
		boolean[] array1 = new boolean[3]; //boolean 배열은 false로 초기화됨
		for(boolean x:array1) {
			System.out.println(x+" ");
		}
		System.out.println();
		
		int[] array2 = new int[3]; //int 배열은 0으로 초기화 됨
		for(int x:array2) {
			System.out.println(x+" ");
		}
		System.out.println();
		
		double[] array3 = new double[3]; //double 배열은 0.0으로 초기화됨
		for(double x:array3) {
			System.out.println(x+" ");
		}
		System.out.println();
		
		//참조자료형 배열
		String[] array4 = new String[3]; //String 배열은 null으로 초기화됨
		for(String x:array4) {
			System.out.println(x+" ");
		}
		System.out.println();
		
		//배열 전체 순차적으로 출력하는 메소드 Arrays.toString(A) [A[0], ... , A[n]]꼴로 출력
		//사용하려면 import java.util.Arrays 선언해줘야됨
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));
		
	}

}
