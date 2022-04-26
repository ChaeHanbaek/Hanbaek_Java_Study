package ex0324;

class Shape{
	public Shape next;
	public Shape(){
		next=null;
	}
	//메소드 오버라이딩 대상
	public void draw() {
		System.out.println("Shape");
	}
}
	
class Line extends Shape{
	//Line 클래스에서 draw 메소드 오버라이딩
	public void draw() {
		System.out.println("Line");
	}	
}

class Rect extends Shape{
	//Rect클래스에서 draw 메소드 오버라이딩
	public void draw() {
		System.out.println("Rect");
	}	
}

class Circle extends Shape{
	//Circle 클래스에서 draw 메소드 오버라이딩
	public void draw() {
		System.out.println("Circle");
	}	
}

public class MethodOverridingEx {
	static void paint(Shape p) {
		p.draw(); //타입이 shpae인 p의 draw()호출 //동적바인딩
	}
	
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Line line = new Line(); //Line 속성의 클래스 line 생성
		paint(line); //shape로 업스케일링한 line 출력
		paint(new Shape()); //shape로 업스케일링한 Shape 출력
		paint(new Line()); //shape로 업스케일링한 Line 출력
		paint(new Rect()); //shape로 업스케일링한 Rect 출력
		paint(new Circle()); //shape로 업스케일링한 Circle 출력
		
	}

}
