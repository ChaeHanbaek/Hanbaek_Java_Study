package ex0316;

public class IrregularArray { //비정방형 배열의 생성과 접근
	public static void main(String[] args) {
		int intArray[][]=new int[4][]; //intArray 레퍼런스 변수로 선언하고 생성
		intArray[0]= new int[3]; //intArray[0]에 int[3]배열(인트값을 3개 저장할 공간) 주소값 할당
		intArray[1]= new int[2]; //intArray[1]에 int[2]배열(인트값을 2개 저장할 공간) 주소값 할당
		intArray[2]= new int[3]; //intArray[2]에 int[3]배열(인트값을 3개 저장할 공간) 주소값 할당
		intArray[3]= new int[2]; //intArray[3]에 int[2]배열(인트값을 2개 저장할 공간) 주소값 할당
		
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				intArray[i][j]=(i+1)*(10)+j; //intArray[i][j]값 바꿈
			}
		}
		for (int i = 0; i< intArray.length; i++) {
			for (int j=0; j< intArray[i].length; j++) {
				System.out.print(intArray[i][j]+" "); //intArray[i][j]값 출력
			}
			System.out.println(); //엔터로 행구분
		}
	}
}
