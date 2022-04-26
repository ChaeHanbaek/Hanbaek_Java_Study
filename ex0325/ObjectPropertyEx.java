package ex0325;

class Point{
	private int x, y;
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
}

public class ObjectPropertyEx {
	
	public static void print(Object obj) {
		System.out.println(obj.getClass().getName()); //클래스 이름 출력
		System.out.println(obj.hashCode());//해시 코드 출력
		System.out.println(obj.toString());//객체를 문자열로 만들어 출력
		System.out.println(obj); //객체 출력
		//해시코드와 객체는 컴퓨터마다 다 다름
	}
	
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Point p = new Point (2,3);
		print(p);
	}

}
