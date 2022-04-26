package ex0407_ch3;

class Ex03_ForcontrolStatement {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int a;
		for (a=0; a<3; a++) {
			System.out.print(a+" ");
		}
		System.out.println();
		
		for(int i=0;i<3;i++) {
		System.out.print(i+ " ");
		}
		System.out.println();
		
		
		for(int i=0;i<100;i++) {
		System.out.print(i+ " ");
		}
		System.out.println();
		
		
		for(int i=10;i>0;i--) {
		System.out.print(i+ " ");
		}
		System.out.println();
		
		
		for(int i=0;i<10;i+=2) {
		System.out.print(i+ " ");
		}
		System.out.println();
		
		
		for(int i=0, j=0;i<10;i++, j++) {
		System.out.print(i + j + " ");
		}
		System.out.println();
		
		//조건식 비워놓으면 컴파일러가 true로 채워넣어서 무한루프
/*
		for(int i=0;;i++) {
		System.out.println(i+ " ");
		}
		System.out.println();
*/
		
		//무한루프되면 아래부분은 실행안되서 에러뜸, 에러 없애려면 탈출조건도 지정해줘야함
		
		for(int i=0;;i++) {
		if(i>10) {
			break;
		}
		System.out.print(i+" ");
		}
		System.out.println("무한루프 탈출");
	}
}
