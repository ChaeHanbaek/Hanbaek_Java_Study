package ex0331;
//해를 구하는거 뿐만아니라 역행렬도 구할수 있게 개선하는게 목적
//A[][]행렬의 대각선외 다른 요소를 0으로 만드는 과정에서 단위행렬 I[][]에도 같은 연산을 하면 역행렬을 구할 수 있다.

public class EX03개선2 {
	//자주 쓸 행렬 출력 메소드로 분리
	public static void ArrayPrint(double A[][]){
		for(double x[]:A) {
			for(double y:x) {
				System.out.print(String.format("%.4f",y)+"\t"); //String.format("%.nf",num) 소수점 n번째까지 표현
			}
			System.out.println();
		}
		System.out.println("-------------------------------------");
	}
	
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		double A[][]= {{-1,1,2,5},{3,-1,1,10},{-1,3,4,5}}; //예제 행렬 입력
		double I[][]= {{1,0,0},{0,1,0},{0,0,1}}; //단위 행렬 I
		int m=3; //행수
		int n=3; //해값 제외한 열수
		//A행렬 출력
		ArrayPrint(A);
/*		
//i번째 열에서 절대값이 가장 큰 행 선택
//절대 값 가장 큰 행의 값 max[]배열에 저장
		double max[]= new double [m];//절대값 가장 큰 행값 저장 비교용
		double B[]= new double [n]; //임시 저장값
		

		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(A[j][i]*A[j][i]>=max[i]*max[i]) {//제곱해서 크면 그값으로 max[i]값 바꿈
					max[i]=A[j][i];
					B=A[i];
					A[i]=A[j];
					A[j]=B;
				}
			}
		}
		
		
//순서바꾼 A행렬 출력
		ArrayPrint(A);
*/		
//A행렬의 i행을 A[i][i]값으로 나누기
		for(int i=0;i<m;i++) {
			double d=A[i][i];
			A[i][0]=A[i][0]/d;
			A[i][1]=A[i][1]/d;		
			A[i][2]=A[i][2]/d;
			A[i][3]=A[i][3]/d;
		}
	//순서바꾼 A행렬 출력
		ArrayPrint(A);
		

	//주축 빼고 나머지를 0으로 만들기
	//각 행을 그 열 값으로 나눠 1로만들고 그값에 주축이 있는 행을 빼서 0으로 만들면 되지 않을까? //맞음
	//하드코딩은 되는데 반복문으로 구현하는 방법은 안떠오름 //해결
		
		while(true) {
			for (int i=0;i<m;i++){
				for (int j=0;j<n;j++) { //해부분은 제외하고 반복하게 값조정
					double Aij=0;
					if(i==j) {
						continue;
					}
					else { //무식하게 각요소값이 들어오면 그열을 전체처리하도록 바꿈 for문 하나 더 쓰거나 클래스 메소드로 분리하면 줄일 수 있어보임
						Aij=A[i][j]; //A[i][i]값을 제외하고 0으로 만들기위해 그 열에서 A[i][j]값을 곱한 j열을 뺌
						A[i][0] = A[i][0] - A[j][0]*Aij;
						A[i][1] = A[i][1] - A[j][1]*Aij;
						A[i][2] = A[i][2] - A[j][2]*Aij;
						A[i][3] = A[i][3] - A[j][3]*Aij;
						//단위행렬에도 같은 연산
						I[i][0]= I[i][0] - I[j][0]*Aij;
						I[i][1]= I[i][1] - I[j][1]*Aij;
						I[i][2]= I[i][2] - I[j][2]*Aij;
						
						// 다시 1로 만들기위해 반복
						double Aii = A[i][i]; //A[i][i]를 변수로 저장안해놓고 해서 울프람알파랑 다른 결과값이 나온것						
						A[i][0] = A[i][0]/Aii;
						A[i][1] = A[i][1]/Aii;		
						A[i][2] = A[i][2]/Aii;
						A[i][3] = A[i][3]/Aii;

						}
					}
				}
			ArrayPrint(A);	
			
			int count=0;
			for (int i=0;i<m;i++){
				for (int j=0;j<n;j++) {
					if(A[i][j]==0) {
						count++;
					}
				}

			}
			if(count==6) {
				break;
			}
		}
		ArrayPrint(I);

	
//2번 반복하면 가우스 요르단 식으로 정렬 되는거 확인 하지만 울프람알파에서 구한 값이랑 다르다.// 문제 해결 A[i][i]로 나누는 중에 A[i][i]값이 바뀌는걸 까먹어 값이 변했던것
//변수를 넣어서 같은 값으로 나눈 결과는 같다.
//{{-1,1,2},{3,-1,1},{-1,3,4}}*{{x},{y},{z}}={{5},{10},{5}} {{x},{y},{z}}=={{0},{-5},{5}}

//해결해야되는 문제: 2번 반복없이 while문 이용해서 자동 반복하게 만드는 알고리즘 생각해내기	
//값바꾸는 for문에 안넣고 따로 빼내면 가능할듯 //해결 //하지만 for문을 너무 중첩해놓은거 같음 메서드로 분리해야함
	
}
	}