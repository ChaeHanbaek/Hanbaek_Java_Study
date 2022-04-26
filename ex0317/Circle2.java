package ex0317;

public class Circle2 {
	int radius;
	String name;
	
	public Circle2() { //클래스이름과 동일한 생성자 //매개 변수 없는 생성자.
		radius = 1; name =""; //radius의 초기값은 1
	}
	public Circle2(int r, String n) { //매개 변수 2개 가진 생성자 //메소드 오버로딩
		radius = r; name=n;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Circle2 pizza = new Circle2(10,"자바피자"); // 변수 2개들어있어서 Circle 객체 생성
		
		double area = pizza.getArea();
		System.out.println(pizza.name+"의 면적은 " + area);
		
		Circle donut = new Circle(); //Circle의 객체 생성 , 반지름 1
		donut.name ="도넛피자";
		area=donut.getArea();
		System.out.println(donut.name+"의 면적은 "+area);
	}

}
