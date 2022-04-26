package ex0408_ch4;

import java.util.Arrays;

public class Ex14_MethodsOfString {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//문자열길이
		String s1 = "Hello Java!";
		String s2 = "안녕하세요! 반갑습니다.";
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println();
		
		//문자열 검색
		//charAt(n) 문자열의 index n값을 반환
		System.out.println(s1.charAt(1));
		System.out.println(s2.charAt(1));
		System.out.println();
		
		//indexOf() 왼쪽부터, lastIndexof() 오른쪽 부터 찾아서 일치하는 문자열의 순서 반환
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.indexOf('a',8));
		System.out.println(s1.lastIndexOf('a',8));
		System.out.println(s1.indexOf("Java"));
		System.out.println(s1.lastIndexOf("Java"));
		System.out.println(s1.indexOf("하세요"));
		System.out.println(s1.lastIndexOf("하세요"));
		System.out.println(s1.indexOf("Bye"));
		System.out.println(s1.lastIndexOf("고맙습니다."));
		//문자열에 없는걸 찾으라고하면 -1값을 반환
		System.out.println();
		
		//문자열 변환 및 연결
		//String.valueOf 기본자료형 -> String
		String s3 = String.valueOf(2.3);
		String s4 = String.valueOf(false);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println();
		
		//.concat()합치는 메소드
		String s6 = "안녕" + 3;
		String s7 = "안녕".concat(String.valueOf(3));
		System.out.println(s6);
		System.out.println(s7);
		System.out.println();
		
		//.getBytes() 문자열 - > byte[] .toCharArray() 문자열 ->char[]
		String s8 = "Hello Java!";
		String s9 = "안녕하세요";
		//.getBytes()
		byte[] array1 = s8.getBytes();
		byte[] array2 = s9.getBytes();
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println();
		
		//.toCharArray()
		char[] a3 = s8.toCharArray();
		char[] a4 = s9.toCharArray();
		System.out.println(Arrays.toString(a3));
		System.out.println(Arrays.toString(a4));
	}

}
