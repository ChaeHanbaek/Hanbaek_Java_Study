package ex0411_ch6;

import java.util.Arrays;

public class Ex05_ArrayArgumentMethod {
	public static void Main(String[] args) {
		int[] a = new int[] {1,2,3};
		printArray(a);
		printArray(new int[] {1,2,3});
		//printArray({1,2,3}); //인자로 배열이 아닌것을 넣어서 오류 발생
	}
	
	public static void printArray(int[] a) {
		System.out.println(Arrays.toString(a));
	}
}
