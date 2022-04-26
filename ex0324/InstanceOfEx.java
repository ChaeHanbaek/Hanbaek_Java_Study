package ex0324;

class Person2{}
class Student2 extends Person2{}
class Researcher extends Person2{}
class Professor extends Researcher{}


public class InstanceOfEx {
	//instanceof : 클래스의 속성을 보여주는 메소드 
	static void print(Person2 p) {
		if(p instanceof Person2) {
			System.out.print("Person2 ");
		}
		if(p instanceof Student2) {
			System.out.print("Student2 ");
		}
		if(p instanceof Researcher) {
			System.out.print("Researcher ");
		}
		if(p instanceof Professor) {
			System.out.print("Professor ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.print("new Student() ->\t");
		print(new Student2());
		System.out.print("new Researcher() ->\t");
		print(new Researcher());
		System.out.print("new Professor() ->\t");
		print(new Professor());
		
	}
}
