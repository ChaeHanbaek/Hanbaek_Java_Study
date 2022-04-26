package ex0407_ch2;

public class Ex01_ArithmeticOperator {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//산술연산자
		System.out.println("산술연산자 결과");
		System.out.println("2+3 = "+(2+3));
		System.out.println("8-5 = "+(8-5));
		System.out.println("7*2 = "+(7*2));
		System.out.println("8%5 = "+(8%5));
		System.out.println();
		
		//증감 연산자
		int v1 = 3;
		System.out.println("v1++ 출력: "+(v1++));
		System.out.println("그뒤 v1 값: "+v1);
		
		int v2 = 3;
		
		System.out.println("v2++ 출력 : "+(++v2));
		System.out.println("그뒤 v2값 :"+v2);
		System.out.println();
		
		//증감 연산자
		int v3 = 3;
		int v4 = v3++;
		System.out.print("v3 = ");
		System.out.println(v3);
		System.out.print("v4 = v3++ = ");
		System.out.println(v4);
		System.out.println();
		
		int v5 = 3;
		int v6 = ++v5;
		System.out.print("v5 = ");
		System.out.println(v5);
		System.out.print("v6 = ++v5 =");
		System.out.println(v6);
		System.out.println();
		
		//증감 연산자
		int v7 = 3;
		int v8 = 4;
		int v9 = 2 + v7-- + ++v8;
		System.out.print("v7 = ");
		System.out.println(v7);
		System.out.print("v8 = ");
		System.out.println(v8);
		System.out.print("v9 = 2+ v7-- + ++v8 = ");
		System.out.println(v9);
	}

}
