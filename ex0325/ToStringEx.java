package ex0325;

class Point2{
	private int x, y;
	public Point2(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public String toString() {//포인트 객체를 문자열로 리턴하는 메소드
		return "Point("+x+","+y+")";
	}
}

public class ToStringEx {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Point2 p = new Point2(2,3);
		System.out.println(p.toString());
		System.out.println(p);//p.toString()으로 자동 변환
		System.out.println(p+"입니다.");
	}

}
