package ex0316;

public class ReturnArray {
	static int[] makeArray() { //정수형 배열을 리턴하는 메소드 정의
		int temp[] = new int[4]; // 배열 생성
		for (int i =0; i<temp.length; i++) { //정수 i를 1씩 늘리면서 i가 배열의 길이보다 커질때까지 반복
			temp[i]=i; // 배열의 원소를 0,1,2,3으로 초기화
		}
		return temp; //배열의 주소값을 가진 레퍼런스 변수 temp리턴
	}
	
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int intArray[]; // 배열 레퍼런스 변수 선언
		intArray = makeArray(); // 메소드로부터 temp 레퍼런스 변수를 받아 배열의 주소값 전달받음
		//temp 레퍼런스 변수는 메소드 종료시 사라지나 그로인해 만들어진 배열은 객체취급받아 동적 메모리 공간에 할당되서 사라지지 않음
		for (int i=0; i<intArray.length; i++) {
			System.out.print(intArray[i]+" "); //배열 모든 원소 출력
		}
	}

}
