package ex0408_ch4;

import java.util.Arrays;

public class Ex15_MethodsOfString2 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//문자열 수정
		//toLowerCase(), toUpperCase()
		String s1= "Java Study";
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println();
		
		//.replace(,) 대체
		System.out.println(s1.replace("Study","공부"));
		
		//.substring(,) 일정 부분만 출력
		System.out.println(s1.substring(0,5));
		
		//.split() 기준에따라 문자열 나눔
		String[] strArray = "abc/def-ghi jkl".split("/|-| ");
		System.out.println(Arrays.toString(strArray));
		
		//trim 공백 제거
		System.out.println("   abc   ".trim());
		System.out.println();
		
		//문자열 내용 비교
		String s2 = new String("Java");
		String s3 = new String("Java");
		String s4 = new String("java");
		
		//stack 메모리 비교 ==
		System.out.println(s2==s3);
		System.out.println(s3==s4);
		System.out.println(s4==s2);
		System.out.println();
		
		//equals(), equalsIgnoreCase() 내용비교
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
	}

}
