package ex0318;

class Calc{
	//전역 함수로 함수 3개 작성
	public static int abs(int a) {
		return a>0?a:-a; // 3항 연산자 조건식?참값:거짓값; 조건식이 참이면 참값, 거짓이면 거짓값 반환
	}
	public static int max (int a, int b) {
		return (a>b)?a:b;
	}
	public static int min (int a, int b) {
		return (a>b)?b:a;
	}
}

public class CalcEX {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		System.out.println(Calc.abs(-5));
		System.out.println(Calc.max(10,8));
		System.out.println(Calc.min(-3,-8));
	}

}
