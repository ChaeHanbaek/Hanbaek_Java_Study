package ex0413_Ch09.Sec01_inheritancepolymorphism.Ex01_Inhereitance;

class Human {
	String name;
	int age;
	void eat() {
		System.out.println("식사");
	}
	void sleep() {
		System.out.println("잔다");
	}
}

class Student extends Human{
	int studentID;
	void goToSchool() {
		System.out.println("학교간다");
	}
}

class Worker extends Human{
	int workerID;
	void goToWork() {
		System.out.println("일한다");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Human h = new Human();
		h.name = "김현지";
		h.age = 11;
		h.eat();
		h.sleep();
		
		Student s = new Student();
		s.name = "김민성";
		s.age = 11;
		h.eat();
		h.sleep();
		
		Worker w = new Worker();
		w.name = "봉윤정";
		w.age = 45;
		w.workerID = 128;
		w.eat();
		w.sleep();
		w.goToWork();
		
	}
}
