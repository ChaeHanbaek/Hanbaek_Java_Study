package ex0324;

public class UsingOverrride {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//Shape 클래스 3개 가리키는 참조변수 설정
		Shape start,last,obj; 
		// 링크드 리스트로 도형 생성하여 연결
		start= new Line();
		last = start;
		obj=new Rect();
		last.next= obj;
		last = obj;
		obj = new Line();
		last.next=obj;
		last=obj;
		obj=new Circle();
		last.next=obj;

		Shape p = start;
		while (p!=null) {
			p.draw();
			p=p.next;
		}
		//p.draw(); p가 마지막으로 가진 값은 null이라서 넣으면 에러남
	}

}
