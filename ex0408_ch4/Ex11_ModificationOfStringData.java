package ex0408_ch4;

import java.util.Arrays;

public class Ex11_ModificationOfStringData {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//String 객체의 수정 방법, 객체내의 내용은 변경 불가, 새로운 객체를 생성함
		String str1 = new String("안녕");
		String str2 = str1;
		
		str1 = "안녕하세요";
		
		System.out.println(str1);
		System.out.println(str2);
		
		//배열 참조 자료형
		int[] array1  = new int[] {3,4,5};
		int[] array2 = array1;
		array1[0]=6;
		array1[1]=7;
		array1[2]=8;
		
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		//참조변수는 배열의 주소값을 받아오는 식이라서 원본이 변하면 같이 변한다.
	}

}
