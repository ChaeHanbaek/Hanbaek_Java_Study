package ex0318;

class Sample{
	public int a;
	private int b;
	int c;
}

public class AccesEX {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Sample aClass = new Sample();
		aClass.a = 10;
		//aClass.b = 10; //b는 private 로 선언이 되었으므로 AccessEx클래스에서 보이지 않아 컴파일 오류 발생
		aClass.c = 10;
	}

}
