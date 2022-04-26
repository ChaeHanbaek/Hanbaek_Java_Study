//일반 클래스에서의 메서드 오버라이딩 실습
package ex0413_Ch10.sec02_abstractmodifier.Ex01_AbstractModifier_1;

class Animal{
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


public class AbstractModifier_1 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();
		
		animal1.cry(); 
		animal2.cry();
		
		//cry() 메서드가 오버라이딩된 모습을 확인할수 있음
	}

}
