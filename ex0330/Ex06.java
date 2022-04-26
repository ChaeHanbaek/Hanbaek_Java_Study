package ex0330;
/*
 * 삽입정렬(Insert Sort)은 앞에서부터 차례대로 이미 정렬된 배열 부분과 비교하여 자신의 위치를 찾아 삽입하여 정렬을 완성하는 알고리즘으로 2번째 값부터 시작한다. 
 * 즉, 2번째 값과 맨 앞의 값을 비교하여 정렬한 후 3번째 값을 앞의 정렬된 2개와 비교하여 정렬하는 방식이다.
 * ----------------------------------------------------------------------------​
 * 준성이는 마라톤 대회에 출전하였다. 대회에 출전하는 사람들은 대회운영 측으로부터 각자 무작위로 번호표를 받았다. 
 * 마라톤 대회 당일에 준성이는 31번 번호표를 받았다. 
 * 그리고 출전자들은 35, 9, 8, 18, 98, 31, 58, 17, 76, 45 순으로 입장하였다. 
 * 대회운영 측은 공정한 마라톤 대회 진행을 위해 출전자들을 다시 번호순으로 줄을 세우려고 한다.
 * 입력 : 10개의 정수를 입력한다. 그 다음 줄에 입력된 정수 중에서 위치를 알고자 하는 정수 하나를 입력한다.​
 * 가장 작은 수부터 오름차순으로 정렬하여 나열한다. 추가로 입력된 정수의 위치를 출력한다.(첨자는 1부터 시작한다.)​​
 */

import java.util.Scanner;

public class Ex06 {
	public static void Aprint(int A[]) {
		for(int x:A) {
			System.out.print(x+"\t");
		}
		System.out.println();
	}
	public static int[] InsertArray(int x, int i,int A[]) {
		//x를 A배열의 index i위치에 넣을때 사용할 메소드 //i보다 작은 배열은 그대로 x는 i에 들어가고 그뒤 값들의 index는 1씩증가한다. 
		//작동 확인 // 마지막자리에 오도록 하면 에러 발생해서 고치는데 시간 오래걸림
		int B[] = new int[A.length+1];
		for(int k=0;k<A.length;k++) {
			if(i==A.length) {
				B[i]=x;
			}
			if(k<i) {
				B[k]=A[k];
			}
			else if(k==i) {
				B[k]=x;
				B[k+1]=A[k];
			}
			else if(k>i) {
				B[k+1]=A[k];
			}

		}
		return B;
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
		
		int sort[] = {people[0]};
		for(int i=1;i<p_number;i++) {
			for (int j=0;j<i;j++) {
				if(people[i]<=sort[j]) {//원래배열의 수보다 작으면 그 수의 인덱스에 들어가고 그뒤의 인덱스를 +1씩 밀어냄
					sort=InsertArray(people[i],j,sort);
					break; //탈출문 없으면 에러 발생
				}			
				else if(people[i]>sort[sort.length-1]){ //원래 배열 가장 큰수보다도 크면 원래배열 복사하고 마지막에 자신 추가
					sort=InsertArray(people[i],i,sort);
					break; //탈출문 없으면 에러 발생
				}
			}

		}
		
		//Aprint(sort); //배열된게 맞는지 확인용
		
		for (int i=0;i<sort.length;i++) {
			if(w==sort[i]) {
				System.out.println(w+"는 "+(i+1)+"번째 입니다.");
			}
		}
		
		scanner.close();
	}
}
