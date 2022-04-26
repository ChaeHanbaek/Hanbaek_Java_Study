package scartchPad;

class A6{
	int m = 3;
	int n = 5;
	void abc(int m, int n) {
		m = this.m;
		n = n; //이름이 같으면 작동 안함
	}
	
}
public class Ch6_P6 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		A6 a = new A6();
		a.abc(7,8);
		System.out.println(a.m);
		System.out.println(a.n);
	}

}
