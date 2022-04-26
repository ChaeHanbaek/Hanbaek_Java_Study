package ex0324;

abstract class Calculator{ //abstract 메소드를 가진 abstract 클래스
	public abstract int add(int a, int b);
	public abstract int subtract (int a, int b);
	public abstract double average(int[] a);
}

public class GoodCalc extends Calculator { //main () 메소드 가진 클래스도 상속 가능
	@Override //오버라이드로 구현하는 거 앞에 붙여놓으면 잘못 구현했을때(철자가 틀렸거나 인자가 틀렸다는등) 컴파일러가 알려줌
	public int add(int a, int b) {
		return a+b;
	}
	@Override
	public int subtract (int a, int b) {
		return a-b;
	}
	@Override
	public double average(int[] a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];			
		}
		return sum/a.length;		                                
	}
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		GoodCalc c= new GoodCalc();
		System.out. println(c.add(2,3));
		System.out. println(c.subtract(2,3));
		System.out. println(c.average(new int[] {2,3,4}));
	}

}
