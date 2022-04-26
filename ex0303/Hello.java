package ex0303;

public class Hello { //class명은 파일명과 같은게 원칙, {시작  끝}
	//클래스안에 또 클래스가 들어갈수있음, 다른 클래스에 있는 메소드나 변수는 불러 쓸 수 없음
	//sum 메소드 정의, 메소드 안에 들어가는 변수는 지역 변수, 다른 메소드에서 그 변수값을 참조할 수 없음
	public static int sum(int n, int m) { //()들어가면 함수, (){~}꼴이면 함수 정의
		return n+m;
	}
//main() 메소드에서 실행 시작 cf)해석은 맨위부터 시작
	public static void main(String[] arg) { //main() 메소드는 시스템이 호출, String 클래스를 가져옴
		//변수 이름 짓는 규칙, 1.숫자선행 불가, 2.키워드로 사용되는 거 불가(if등), 3.특수문자불가(_제외), 3가지 금칙을 제외하고 문자, 숫자, _를 조합해서 짓는다.
		int i = 20; //선언과 동시에 초기화, 메모리 공간에 정수형(타입정의) i=20값을 할당(상수), 정수형은 4byte
		int s; //메모리에는 값을 새로 쓰기만 할뿐 지우진 않는다. 
		//선언하고 쓰지않는 값을 가비지(쓰레기)라고 한다. 이는 에러의 원인이 되므로 변수 초기화 과정을 거친다.
		char a; // char형은 1byte
		//자바에선 ;이 문장끝을 나타낸다. a; b; c;로 써도 3줄로 인식
		s=sum(i,10); //sum() 메소드 호출
		a='?'; //문자는 'a'꼴로 지정, 문자열은 "ab"로 지정하는 것이 약속
		System.out.println(a); //문자 ? 출력
		System.out.println("Hello"); // Hello 출력
		System.out.println(s); // 정수 s값 출력	
		}
}