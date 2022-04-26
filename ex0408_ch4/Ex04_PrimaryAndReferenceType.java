package ex0408_ch4;

public class Ex04_PrimaryAndReferenceType {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//기본 자료형의 대입연산 : stack값을 복사해서 처리, 연산되도 원본에 영향 안줌
		int v1 = 3;
		int v2 = v1;
		v2 = 7;
		System.out.println(v1);
		System.out.println(v2);
		System.out.println();
		
		//참조자료형의 대입연산 : stack 값 복사
		int[] a1 = new int[] {3,4,5};
		int[] a2 = a1;
		a2[0]=7;
		System.out.println(a1[0]);
		System.out.println(a2[0]);
		
	}

}
