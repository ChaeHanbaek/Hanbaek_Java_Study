package ex0324;

class Point{
	private int x, y;
	//x,y 설정하는 메소드
	public void set(int x, int y) {
		this.x=x;
		this.y=y;
	}
	//x,y 출력하는 메소드
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}

class ColorPoint extends Point{ //Point class 상속 //상속하는 순간 Point class의 필드와 메소드가 ColorPoint로 복사됨
	private String color;
	public void setColor(String color) {
		this.color=color;
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint(); //복사한 자기 자신의 showPoint() 호출
	}
}

public class ColorPointEX {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Point p = new Point();
		p.set(1,2);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		cp.set(3,4); //Point에서 상속받은 set메소드 사용가능
		cp.setColor("red"); //자체에서 새로 만든 메소드도 사용 가능
		cp.showColorPoint(); //Point메소드를 활용한 메소드도 사용 가능
		System.out.println();
		p.showPoint(); //c
		}
	}


