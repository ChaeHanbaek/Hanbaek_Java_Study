package ex0330;
//배열 바꾸는 알고리즘을 매번 배열 새로 만드는게 아니라 인덱스만 바꾸는 거로 갈아치움

import java.util.Scanner;

public class Ex06변형 {
	public static void Aprint(int A[]) {
		for(int x:A) {
			System.out.print(x+"\t");
		}
		System.out.println();
	}
	public static void InsertIndex(int x, int i,int A[]) {//배열 A의 인덱스 i위치에 x를 넣고 그뒤에 있는 값의 인덱스를 하나씩 밀어내는 메소드
		int B[]=new int[A.length];
		for(int k=0;k<A.length;k++) {
			if(k<i) {
				B[k]=A[k];
			}
			else if(k==i) {
				B[k]=x;
				if(k<A.length-1) {//마지막 숫자가 가장 클때 에러방지
					B[k+1]=A[k];
				}
			}

			else if(k>i&&k<A.length-1) { //이렇게 해야 인덱스 i+1부터 A.length-2까지 값이 들어감
				B[k+1]=A[k];
			}
		}
	
		for(int n=0;n<A.length;n++) { //로컬 배열이라 그런지 A=B;식으로 하면 값을 못넘겨받음
			A[n]=B[n];
		}
	} 
	
	public static void main(String arg[]) {		
		Scanner scanner = new Scanner(System.in);
		System.out.println("10명의 번호를 입력해주세요");
		int p_number = 10;//총 인원수
		int people[] = new int[p_number];
		for (int i=0;i<p_number;i++) { //10명의 번호 받아 배열에 넣기
			people[i]= scanner.nextInt();
		}
		
		System.out.println("순서를 알고 싶은 번호를 입력해주세요");
		int w= scanner.nextInt(); //10명중 순서 알고 싶은 번호 받기

		//Aprint(people); //입력된거 맞는지 확인용
		
		int sort[] = new int[p_number];
		sort[0]=people[0];
		Aprint(sort);
		
		for(int i=1;i<p_number;i++) {
			for (int j=0;j<i;j++) {
				if(people[i]<=sort[j]) {//원래배열의 수보다 작으면 그 수의 인덱스에 들어가고 그뒤의 인덱스를 +1씩 밀어냄
					InsertIndex(people[i],j,sort);
					break;
				}			
				else if(people[i]>sort[i-1]){ //sort[j]랑 비교하면 에러 i-1번째랑 비교해야 정상작동
					sort[i]=people[i];
					break;
				}
			}
			//Aprint(sort); //정상작동 확인용
		}
		Aprint(sort);
		//Aprint(sort); //배열된게 맞는지 확인용
		
		for (int i=0;i<sort.length;i++) {
			if(w==sort[i]) {
				System.out.println(w+"는 "+(i+1)+"번째 입니다.");
			}
		}
		
		scanner.close();
	}
}
