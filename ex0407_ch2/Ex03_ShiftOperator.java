package ex0407_ch2;

public class Ex03_ShiftOperator {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//산술 쉬프트 부호변화 없음 
		// << 레프트 쉬프트 *2, /2 효과
		System.out.println(3<<1);
		System.out.println(-3<<1);
		System.out.println(3<<2);
		System.out.println(-3<<2);
		System.out.println();
		
		//>>
		System.out.println(5>>1);
		System.out.println(-5>>1);
		System.out.println(5>>2);
		System.out.println(-5>>2);
		System.out.println();
		
		//논리 쉬프트 >>> 밀어내고 
		System.out.println(3>>>1);
		System.out.println(-3>>>31);
		System.out.println();
		

	}

}
