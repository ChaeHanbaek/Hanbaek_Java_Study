package ex0323;
//3x3행렬의 역행렬 구하기

public class EX03 {
	//자주 쓸 행렬 출력 메소드로 분리
	public static void ArrayPrint(double A[][]){
		for(double x[]:A) {
			for(double y:x) {
				System.out.print(y+"\t");
			}
			System.out.println();
		}
			System.out.println("-------------------------------------");
	}
	
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		double A[][]= {{-1,1,2,5},{3,-1,1,10},{-1,3,4,5}}; //예제 행렬 입력
		int m=3; //행수
		int n=3; //해값 제외한 열수
		//A행렬 출력
		ArrayPrint(A);
		
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
		
//A행렬의 i행을 A[i][i]값으로 나누기
		for(int i=0;i<m;i++) {
			double d=A[i][i];
			for(int j=0;j<n+1;j++) {
				//System.out.println(i+"확인");
				A[i][j]=A[i][j]/d;
				//System.out.println(A[i][j]+"확인");
			}
		}
	//순서바꾼 A행렬 출력
		ArrayPrint(A);
		

	//주축 빼고 나머지를 0으로 만들기
	//각 행을 그 열 값으로 나눠 1로만들고 그값에 주축이 있는 행을 빼서 0으로 만들면 되지 않을까?
	//하드코딩은 되는데 반복문으로 구현하는 방법은 안떠오름
	
	for (int i=0;i<m;i++){
		for (int j=0;j<n;j++) {
			double Aij=0;
			if(i==j||A[i][j]==0
					
					) {
				continue;
			}
			else {
				Aij=A[i][j];
				System.out.println(i+"행"+j+"열 ::"+A[i][0]);
				System.out.println(i+"행"+j+"열 ::"+A[j][0]);
				A[i][0]=A[i][0]-A[j][0]*Aij;
				A[i][1]=A[i][1]-A[j][1]*Aij;
				A[i][2]=A[i][2]-A[j][2]*Aij;
				A[i][3]=A[i][3]-A[j][3]*Aij;
				A[i][0]=A[i][0]/A[i][i];
				A[i][1]=A[i][1]/A[i][i];		
				A[i][2]=A[i][2]/A[i][i];
				A[i][3]=A[i][3]/A[i][i];
				System.out.println(i+"행"+j+"열 :"+A[i][j]);
			}
		}
	}
	ArrayPrint(A);		
	
	for (int i=0;i<m;i++){
		for (int j=0;j<n;j++) {
			double Aij=0;
			if(i==j) {
				continue;
			}
			else {
				Aij=A[i][j];
				A[i][0]=A[i][0]-A[j][0]*Aij;
				A[i][1]=A[i][1]-A[j][1]*Aij;
				A[i][2]=A[i][2]-A[j][2]*Aij;
				A[i][3]=A[i][3]-A[j][3]*Aij;
				A[i][0]=A[i][0]/A[i][i];
				A[i][1]=A[i][1]/A[i][i];		
				A[i][2]=A[i][2]/A[i][i];
				A[i][3]=A[i][3]/A[i][i];
				System.out.println(i+"행"+j+"열 :"+A[i][3]);
			}
		}
	}
	ArrayPrint(A);		
	
//2번 반복하면 가우스 요르단 식으로 정렬 되는거 확인 하지만 울프람알파에서 구한 값이랑 다르다.
//{{-1,1,2},{3,-1,1},{-1,3,4}}*{{x},{y},{z}}={{5},{10},{5}} {{x},{y},{z}}=={{0},{-5},{5}}
			
}
	}