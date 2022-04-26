package ex0411_ch6;

import java.util.Arrays;

public class Ex09_FlexibleSizeArrayArgument {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		method1(1,2);
		method1(1,2,3);
		method1();
		
		method2("안녕", "방가");
		method2("땡큐","베리","감수");
		method2();
	}
	
	public static void method1(int... values) {
		System.out.println("배열의 길이 : "+values.length);
		for(int k : values) {
			System.out.print(k+" ");
		}
		
		System.out.println();
	}

	public static void method2(String... values) {
		System.out.println("배열의 길이 : "+values.length);
		
		for(String s:values) {
			System.out.print(s+" ");
		}
		
		System.out.println();
	}
}
