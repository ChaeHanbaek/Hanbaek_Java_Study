package ex0413_Ch10.sec02_abstractmodifier.Ex02_AbstractModifier_2;

abstract class Animal{ //추상클래스를 이용해 메서드 오버라이딩
	void cry() {}
}

class Cat extends Animal{
	void cry() {
		System.out.println("야옹");
	}
}

class Dog extends Animal{
	void cry() {
		System.out.println("멍멍");
	}
}

public class AbstractModifier_2 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Animal animal1 = new Cat(); //추상 클래스도 생성자를 서브 클래스 쓰면 생성됨?
		Animal animal2 = new Dog();
		
		animal1.cry();
		animal2.cry();
	}

}
