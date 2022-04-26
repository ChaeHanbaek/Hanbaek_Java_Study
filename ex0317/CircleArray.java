//반지름이 0~4인 Circle 객체 5개를 가지는 배열을 생성하고, 배열에 있는 모든 Circle객체의 면적을 출력하라.
package ex0317;

class CircleC {
	int radius;
	public CircleC(int radius) {
		this.radius = radius;
	}
	public double getArea(){
		return 3.14*radius*radius;
	}
}
	public class CircleArray{
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		CircleC[] c;
		c=new CircleC[5];
		
		for(int i=0;i<c.length;i++) {
			c[i]=new CircleC(i);
		}
		for(int i =0; i<c.length;i++) {
			System.out.print((int)(c[i].getArea())+" ");
		}
	}

}
