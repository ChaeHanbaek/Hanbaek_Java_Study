package ex0331;

import java.util.Vector;

class Point{
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "("+x+","+y+")";
	}
}

public class PointVectorEx {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//Point 객체를 요소로 가지는 벡터 v 생성
		Vector<Point> v = new Vector <Point>();
		
		//v에 3개의 포인트 객체 삽입
		v.add(new Point(2,3));
		v.add(new Point(-5,20));
		v.add(new Point(30,-8));
		
		//v 인덱스1 삭제
		v.remove(1);
		
		//v에 있는 모든 Point객체 검색해서 출력
		for(int i = 0; i<v.size(); i++) {
			Point p = v.get(i);
			System.out.println(p); //Point 클래스에서 정의한 toString()을 이용해서 출력
		}
	}

}
