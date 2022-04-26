package ex0411_ch6;

import java.util.Arrays;

public class Ex07_EffectOfReferenceDataArgument {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int[] array = new int[] {1,2,3};
		modifyData(array);
		printArray(array);
	}
	
	public static void modifyData(int[] a) {
		a[0] = 4;
		a[1] = 5;
		a[2] = 6;
	}
	
	public static void printArray(int[] a) {
		System.out.println(Arrays.toString(a));
	}

}
