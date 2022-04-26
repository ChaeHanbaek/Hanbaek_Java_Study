package scartchPad;

import java.util.Arrays;

class AAA{
	void abc(int m) {
		m = 8;
	}
	
	void bcd(int[] n) {
		n[0]=4;
		n[1]=5;
		n[2]=6;
	}
}
public class Ch6_P3 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		AAA a = new AAA();
		int m = 5;
		int[] n = {1,2,3};
		
		a.abc(m); //메소드에서 변수 변화시킨 값이 영향 안줌
		a.bcd(n); //메소드에서 배열 변화시킨 값이 영향 줌
		
		//변수는 값을 받아서 복사해서 사용해서 그렇고
		//배열은 주소를 받아서 원본을 수정해서 그런것
		
		System.out.println(m);
		System.out.println(Arrays.toString(n));
	}

}
