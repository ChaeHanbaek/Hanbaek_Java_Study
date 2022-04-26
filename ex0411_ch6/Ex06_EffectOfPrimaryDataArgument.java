package ex0411_ch6;

public class Ex06_EffectOfPrimaryDataArgument {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int a = 3; //main() 메소드의 지역변수
		int result1 = twice(3);
		System.out.println(result1);
		int result2 = twice(a);
		System.out.println(result2);
		System.out.println(a);
	}

	public static int twice(int a) {//twice 메소드의 지역변수
		a*=2;	
		return a;
	}
}
