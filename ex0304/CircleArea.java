package ex0304;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.14; // 상수 선언과 동시에 초기화
		
		double radius = 10.0;
		double circleArea = radius*radius*PI;
		
		System.out.println("원의 면적 ="+circleArea); // 문자열을 +로 연산하면 이어진다.
}
}