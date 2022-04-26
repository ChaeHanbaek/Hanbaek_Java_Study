package ex0325;

class Point3{
	private int x, y;
	public Point3 (int x, int y) {
		this.x=x;
		this.y=y;
	}
	public boolean equals(Object obj) {//오버라이딩
		Point3 p = (Point3)obj;
		if(x==p.x&&y==p.y) {
			return true;
		}
		else return false;
	}
}

public class EqualsEx {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Point3 a = new Point3(2,3);
		Point3 b = new Point3(2,3);
		Point3 c = new Point3(3,4);
	
		if(a==b) {
			System.out.println("a==b");
		}
		if(a.equals(b)) {
			System.out.println("a is equal to b");
		}
		if(a.equals(c)) {
			System.out.println("a is equal to c");
		}
	}
}
