package ex0324;

class Person{
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public void setWeight(int weight) {
		this.weight=weight;
	}
	public int getWeight() {
		return weight;
	}
}

class Student extends Person{
	public void set() {
		age=30;
		name= "홍길동";
		height=175;
		//weight=99;
		setWeight(99);
	}
}

public class InheritanceEX {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Person p = new Person();
		p.setWeight(80);
		System.out.println(p.getWeight());
		Student s = new Student();
		s.set();
		System.out.println(s.age);
		System.out.println(s.name);
		System.out.println(s.height);
		System.out.println(s.getWeight());//별도영역에 생성되었기 때문에 함수로 접근
		System.out.println(p.getWeight());//부모 클래스 필드값에 영향 안줌
	}

}
